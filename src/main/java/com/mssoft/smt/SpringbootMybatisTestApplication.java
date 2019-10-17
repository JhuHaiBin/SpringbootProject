package com.mssoft.smt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mssoft.smt.interceptor.LoginInterceptor;
@RestController //不把restcontroller改成controller，就无法跳转到jsp页面
@SpringBootApplication
@MapperScan("com.mssoft.smt.mapper")
@ComponentScan("com.mssoft.smt")
public class SpringbootMybatisTestApplication implements WebMvcConfigurer{
	@Autowired
	LoginInterceptor loginInterceptor;
	@RequestMapping("/logintest")
	public String login() {
		return "LoginRegister";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisTestApplication.class, args);
	}
	@Override //拦截器
	public void addInterceptors(InterceptorRegistry  registry) {
		registry.addInterceptor(loginInterceptor).addPathPatterns("/Main");
	}
}
