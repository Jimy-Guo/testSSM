package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class TestException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
        ex.printStackTrace();
        //2.�����쳣��Ϣ����ת������ҳ��
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", "������~ϵͳ��æ~");
        mv.setViewName("error");
        return mv;
	}

}
