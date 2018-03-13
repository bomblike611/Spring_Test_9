package com.iu.s9;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("interceptor");
		boolean check=true;
		// TODO Auto-generated method stub
		Object object=request.getSession().getAttribute("member");
		if(object==null){
			check=false;
			/*response.sendRedirect("../");*/
		}
		return /*super.preHandle(request, response, handler)*/ true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String view=modelAndView.getViewName();
		System.out.println("view:"+view);
		Map<String, Object> map=modelAndView.getModel();
		System.out.println("date:"+map.get("date"));
		String id=request.getParameter("id");
		if(id.equals("iu")){
			modelAndView.addObject("date", "3000-03-11");
			modelAndView.setViewName("notice/result");
		}
		
		//super.postHandle(request, response, handler, modelAndView);
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
}
