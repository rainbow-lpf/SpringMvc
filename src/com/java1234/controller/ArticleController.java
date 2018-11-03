package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/article")
public class ArticleController {

	@RequestMapping("/list")
	public ModelAndView list() {

		ModelAndView view = new ModelAndView();

		view.setViewName("article/list");

		return view;
	}

	/*
	 * ��ȡRestful�ĸ�ʽ������
	 * @PathVariable 
	 */
	@RequestMapping("/details/{id}")
	public ModelAndView details(@PathVariable("id") int id) {

		ModelAndView view = new ModelAndView();
		if (id == 1) {
			view.addObject("content", "������");
		} else {
			view.addObject("content", "���϶Է������������ط�����");
		}

		view.setViewName("article/details");
		return view;

	}
}
