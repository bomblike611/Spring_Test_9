package com.iu.s9;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(NumberFormatException.class)
	public ModelAndView test1(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error/error404");
		mv.addObject("error", "NumberFormat");
		return mv;
	}
	
	@ExceptionHandler(java.lang.ArithmeticException.class)
	public ModelAndView test2(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("error/error404");
		mv.addObject("error", "ArithmeticException");
		return mv;
	}
}
