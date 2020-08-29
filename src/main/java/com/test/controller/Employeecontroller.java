package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.TestEmployeelist;

@Controller
public class Employeecontroller{
	@Autowired
	private TestEmployeelist employlist;

	@RequestMapping("index")
	public ModelAndView TestList() {
		ModelAndView mav=new ModelAndView();
		System.out.println(employlist.getEmployee());
//		int i=1/0;
		mav.addObject("elist", employlist.getEmployee());
		return mav;
	}

	@RequestMapping("select")
	public ModelAndView selectEmployee(String id) {
		ModelAndView mav=new ModelAndView("redirect:/index");
		mav.addObject("elist", employlist.selectEmployee(id));
		return mav;
	}
	
	@RequestMapping("delete")
	public void deleteEmployee(String id) {
		employlist.deleteEmployee(id);
	}

	@RequestMapping("add")
	public ModelAndView addEmployee(String age, String name, String sex, String address) {
		employlist.addEmployee(age, name, sex, address);
		ModelAndView mav=new ModelAndView("redirect:/index");
		mav.addObject("elist", employlist.getEmployee());
		return mav;
	}
	@RequestMapping("addpage")
	public ModelAndView addPage() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("addpage");
		return mav;
	}
	
	
}