package com.java1234.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/upload")
public class UploadController {

	
	@RequestMapping("/uploadview")
	public ModelAndView uploadView() {

		ModelAndView view=new ModelAndView();
		view.setViewName("upload/uploadfile");
			
		return view;
	}

	@RequestMapping("/uploadfile")
	public String upload(@RequestParam("file1") MultipartFile file1, HttpServletRequest request)
			throws IllegalStateException, IOException {

		// 1.获取上传图片路径
		String filePath = request.getServletContext().getRealPath("/");
		System.out.println(filePath);
		// 保存
		file1.transferTo(new File(filePath + "upload/" + file1.getOriginalFilename()));
		return "redirect:../success.html";
	}
	
	@RequestMapping("/uploadfiles")
	public String uplaods(@RequestParam("file") MultipartFile[] files,HttpServletRequest request) throws IllegalStateException, IOException {
		
		String filePath=request.getServletContext().getRealPath("/");
		System.out.println(filePath);
		
		for (MultipartFile file : files) {
			file.transferTo(new File(filePath+"upload/"+file.getOriginalFilename()));
		}
		
		return "redirect:../success.html";
	}
}
