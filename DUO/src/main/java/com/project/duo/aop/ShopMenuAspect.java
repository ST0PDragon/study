package com.project.duo.aop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.project.duo.model.category.CategoryService;

public class ShopMenuAspect {
	
	@Autowired
	private CategoryService categoryService;

	//내가 원하는 처리....
	public Object getCategoryList(ProceedingJoinPoint joinPoint) throws Throwable{
		
		Class target=joinPoint.getTarget().getClass(); //어떤 클래스에 요청을 하려고 했는지...
		//컨트롤러에 요청객체가 있는지 여부를 판단해보자!!
		Object[] args=joinPoint.getArgs(); //지금 이 요청을 처리하는 메서드의 매개변수들을 추출...
		
		System.out.println("너가 요청을 하려던 클래스는 "+target.getName());
		HttpServletRequest request=null; //무언가를 담기 위한 요청객체 
		
		for(Object obj : args) {
			if(obj instanceof HttpServletRequest) {
				request=(HttpServletRequest)obj;
			}
			System.out.println("너가 호출하는 메서드의 매개변수는 "+obj);
		}
		
		
		//공통로직 호출 
		List categoryList=categoryService.selectAll();
		
		//원래의 요청을 그대로 진행을 시키자~
		System.out.println("joinPoint.proceed() 호출 전 ");
		Object returnObj = joinPoint.proceed(); //즉 본래의 메서드 호출진행
		System.out.println("joinPoint.proceed() 호출 후 ");
		
		//리터값이 ModelAndView일때 결과를 심어버리겠슴...
		ModelAndView mav=null;
		if(returnObj instanceof ModelAndView) {
			mav =(ModelAndView)returnObj;
			mav.addObject("categoryList", categoryList);
		} 
		//저장 
		
		return mav;
	}
}
