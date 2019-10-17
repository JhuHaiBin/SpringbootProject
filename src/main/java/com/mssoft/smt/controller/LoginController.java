package com.mssoft.smt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mssoft.smt.mapper.ManagerInfoMapper;
import com.mssoft.smt.mapper.StudentScoreInfoMapper;
import com.mssoft.smt.mapper.TeacherInfoMapper;
import com.mssoft.smt.model.ManagerInfoExample;
import com.mssoft.smt.model.StudentScoreInfo;
import com.mssoft.smt.model.StudentScoreInfoExample;
import com.mssoft.smt.model.TeacherInfo;
import com.mssoft.smt.model.TeacherInfoExample;
@Controller
public class LoginController{
	@Autowired
	ManagerInfoMapper managerInfoMapper;
	@Autowired
	TeacherInfoMapper teacherInfoMapper;
	@Autowired
	StudentScoreInfoMapper studentScoreInfoMapper;
	@RequestMapping(value = "/loginPage", method =RequestMethod.POST)
	public String login(HttpServletRequest request, HttpSession session,Model model) {
		String tNumber = request.getParameter("tnumber");
		String tPassword = request.getParameter("tpassword");
		TeacherInfoExample example = new TeacherInfoExample();//不可以注入 只能new出来
		example.createCriteria().andTNumberEqualTo(tNumber).andTPasswordEqualTo(tPassword);
		if(teacherInfoMapper.selectByExample(example).size()!=0) {
			//登陆成功，存入session
			TeacherInfo teacherInfo = new TeacherInfo();
			teacherInfo.settNumber(tNumber);
			teacherInfo.settPassword(tPassword);
			HttpSession teacherSession = request.getSession();
			teacherSession.setAttribute("teacherInfo", teacherInfo);
			teacherSession.setMaxInactiveInterval(60*60*10);
			//把数据库里的数据传到页面
			StudentScoreInfoExample studentScoreInfoExample = new StudentScoreInfoExample();
			studentScoreInfoExample.createCriteria().andSIdIsNotNull();
			List<StudentScoreInfo> list = studentScoreInfoMapper.selectByExample(studentScoreInfoExample);
			model.addAttribute("studentList",list);//把所有学生成绩带过来，之后在页面负责接收
			return "Main";
		}else {
			return "LoginRegister";
		}
	}
	@RequestMapping(value = "/registerPage", method =RequestMethod.POST)
	public String register(HttpServletRequest request, HttpSession session) {
		String tNumber = request.getParameter("tnumber");
		String tName = request.getParameter("tname");
		String tPassword = request.getParameter("tpassword");
		String tClass = request.getParameter("tclass");
		String mInvitationCode = request.getParameter("minvitationcode");
		ManagerInfoExample managerInfoExample = new ManagerInfoExample();
		//1、注册之前先查询管理员授权码是否正确
		managerInfoExample.createCriteria().andMInvitationCodeEqualTo(mInvitationCode);
		if(managerInfoMapper.selectByExample(managerInfoExample).size()!=0) {
			//2、若正确，把信息传入数据库，并跳转到登录注册界面
			TeacherInfo teacherInfo = new TeacherInfo();
			teacherInfo.settNumber(tNumber);
			teacherInfo.settPassword(tPassword);
			teacherInfo.settClass(tClass);
			teacherInfo.settName(tName);
			teacherInfoMapper.insert(teacherInfo);
			return "SuccessSkip";
		}else {
			//3、若错误，提示注册失败，并跳转到登录注册界面
			return "FailedSkip";
		}
	}
	@RequestMapping("/login")
	public String login() {
		return "LoginRegister";
	}
}
