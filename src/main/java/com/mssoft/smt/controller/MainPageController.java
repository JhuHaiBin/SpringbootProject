package com.mssoft.smt.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mssoft.smt.mapper.StudentScoreInfoMapper;
import com.mssoft.smt.model.StudentScoreInfo;
import com.mssoft.smt.model.StudentScoreInfoExample;

@Controller
public class MainPageController {
	//还差分页功能
	@Autowired
	StudentScoreInfoMapper studentScoreInfoMapper;
	@RequestMapping("/DeletePage") 
	public String delete(HttpServletRequest request, HttpSession session,Model model) {
		String sId = request.getParameter("sId");
		Integer id = new Integer(sId);
		StudentScoreInfoExample studentScoreInfoExample = new StudentScoreInfoExample();
		studentScoreInfoExample.createCriteria().andSIdEqualTo(id);
		studentScoreInfoMapper.deleteByPrimaryKey(id);
		//继续从数据库读取学生成绩数据，用model带到Main页面中
		List<StudentScoreInfo> list = getStudentList();
		model.addAttribute("studentList",list);
		return "Main";
	}
	/*
	 * 跳转到Update页面
	 */
	@RequestMapping("/UpdatePage") 
	public String update(HttpServletRequest request, HttpSession session,Model model) {
		String sNumber = request.getParameter("sNumber");
		String sChineseScore =request.getParameter("sChineseScore");
		String sMathScore =request.getParameter("sMathScore");
		String sEnglishScore =request.getParameter("sEnglishScore");
		String sClass =request.getParameter("sClass");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sNumber", sNumber);
		map.put("sChineseScore", sChineseScore);
		map.put("sMathScore", sMathScore);
		map.put("sEnglishScore", sEnglishScore);
		map.put("sClass", sClass);
		model.addAllAttributes(map);
		return "Update";
		
	}
	@RequestMapping("/UpdateSubmit")
	public String updateSubmit(HttpServletRequest request, HttpSession session,Model model) {
		String sId = request.getParameter("sId");
		String sNumber = request.getParameter("sNumber");
		String sChineseScore =request.getParameter("sChineseScore");
		String sMathScore =request.getParameter("sMathScore");
		String sEnglishScore =request.getParameter("sEnglishScore");
		String sClass =request.getParameter("sClass");
		Integer id = new Integer(sId);
		Long number = Long.parseLong(sNumber);
		Integer chineseScore = new Integer(sChineseScore);
		Integer mathScore = new Integer(sMathScore);
		Integer englishScore = new Integer(sEnglishScore);
		StudentScoreInfo studentScoreInfo = new StudentScoreInfo(id,number,chineseScore,mathScore,englishScore,sClass);
		//添加进数据库
		
		StudentScoreInfoExample studentScoreInfoExample = new StudentScoreInfoExample();
		studentScoreInfoExample.createCriteria().andSIdEqualTo(id);
		studentScoreInfoMapper.updateByPrimaryKeySelective(studentScoreInfo);
		List<StudentScoreInfo> list = getStudentList();
		model.addAttribute("studentList",list);
		return "Main";
	}
	@RequestMapping("/AddStudent")
	public String addSubmit(HttpServletRequest request, HttpSession session,Model model) {
		String sNumber = request.getParameter("sNumber");
		String sChineseScore =request.getParameter("sChineseScore");
		String sMathScore =request.getParameter("sMathScore");
		String sEnglishScore =request.getParameter("sEnglishScore");
		String sClass =request.getParameter("sClass");
		Long number = Long.parseLong(sNumber);
		Integer chineseScore = new Integer(sChineseScore);
		Integer mathScore = new Integer(sMathScore);
		Integer englishScore = new Integer(sEnglishScore);
		StudentScoreInfo studentScoreInfo = new StudentScoreInfo(number,chineseScore,mathScore,englishScore,sClass);
		//第一步，检查学号是否有冲突，若有冲突，提示用户添加失败
		StudentScoreInfoExample studentScoreInfoExample = new StudentScoreInfoExample();
		if(null==studentScoreInfoExample.createCriteria().andSNumberEqualTo(number)) {
			//此处有错误！！无论有没有查到snumber，该对象都不为null！
			
			//第二步，添加学生成绩进数据库
			studentScoreInfoMapper.insert(studentScoreInfo);
		}else {
			//提示用户添加失败--提示失败！！
			request.setAttribute("message", "添加失败，已有相同学号的学生！");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		List<StudentScoreInfo> list = getStudentList();
		model.addAttribute("studentList",list);
		return "Main";
	}
	@RequestMapping("/Main") 
	public String Main(Model model) {
		List<StudentScoreInfo> list = getStudentList();
		model.addAttribute("studentList",list);
		return "Main";
	}
	@RequestMapping("/Add") 
	public String Add(Model model) {

		return "Add";
	}
	//获取数据库学生成绩数据
	public List<StudentScoreInfo> getStudentList() {
		StudentScoreInfoExample studentScoreInfoExample = new StudentScoreInfoExample();
		studentScoreInfoExample.createCriteria().andSIdIsNotNull();
		List<StudentScoreInfo> list = studentScoreInfoMapper.selectByExample(studentScoreInfoExample);
		return list;
		
	}
}
