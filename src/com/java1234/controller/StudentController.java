package com.java1234.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.model.Student;


@Controller
@RequestMapping("/student")
public class StudentController {

	private static List<Student> studentList = new ArrayList<Student>();

	// ��̬����� ��Ӧ�ó��������Ժ� ִֻ��һ��
	static {
		studentList.add(new Student(1, "����", 11));
		studentList.add(new Student(2, "����", 12));
		studentList.add(new Student(3, "����", 13));
	}

	/*
	 * �б�չʾ
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("studentList", studentList);
		mav.setViewName("student/list");
		return mav;
	}

	/*
	 * ��תҳ����
	 */
	@RequestMapping("/prveSave")
	public ModelAndView save(@RequestParam(value = "id", required = false) String id) {

		ModelAndView view = new ModelAndView();

		if (id != null) {
			view.addObject("student", studentList.get(Integer.parseInt(id) - 1));
			view.setViewName("student/update");

		} else {
			view.setViewName("student/add");
		}

		return view;
	}

	/*
	 * �������
	 */
	@RequestMapping("/save")
	public String save(Student student) {
		
		int id=student.getId();
		
		if(id==0) {
			student.setId(studentList.size()+1);
			studentList.add(student);
		}else {
			
			Student stu = studentList.get(student.getId() - 1);
			stu.setName(student.getName());
			stu.setAge(student.getAge());
		}
		
		return "redirect:/student/list.do";
	}

	/*
	 * ���²���
	 */
	@RequestMapping("/update")
	public String update(Student student) {

		Student stu = studentList.get(student.getId() - 1);
		stu.setName(student.getName());
		stu.setAge(student.getAge());

		return "redirect:/student/list.do";
	}

	/*
	 * ɾ������
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value = "id") int id) {

		studentList.remove(id - 1);
		return "forward:/student/list.do";
	}

}
