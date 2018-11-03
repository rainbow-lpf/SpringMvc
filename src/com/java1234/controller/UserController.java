package com.java1234.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java1234.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	/*
	 * Spring Mvc 登录设置 Cookie Session 
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		
	    System.out.println("-------------登录验证cookie-------------");
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		//设置Cookie 这里必须对Cookie的Value进行编码设置 不然输入中文时会抛出异常 Control character in cookie value or attribute.
		Cookie cookie=new Cookie("user",URLEncoder.encode(userName+"|"+userPassword, "utf-8") );
		cookie.setMaxAge(60*60*60*27*7);
		response.addCookie(cookie);
		
		// 设置Session
		
		User currentUser=new User(userName,userPassword);
		HttpSession session=request.getSession();
		session.setAttribute("user", currentUser);
		
		return "redirect:/main.jsp";
	}
	
	
	/*
	 *  返回Json数据格式
	 */
	@RequestMapping("/getUsers")
	public @ResponseBody List<User> getUsers() {
		
		List<User> users=new ArrayList<User>();
		
		users.add(new User("张三","123456"));
		
		users.add(new User("李四","123456"));
		
		users.add(new User("王五","123456"));
		
		return users;
	}
	
	
	/*
	 *  返回Json数据格式
	 */
	@RequestMapping("/getUser")
	public @ResponseBody User getUser() {
		
		return new User("张三","123456");
	}
}
