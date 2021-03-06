package com.project.duo.controller.shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.duo.model.category.CategoryService;
import com.project.duo.model.product.ProductService;

/*  쇼핑몰 메인의 요청을 처리하는 하위 컨트롤러 */
@Controller
public class MainController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getMain() {
		List categoryList = categoryService.selectAll();//카테고리 가져오기
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("categoryList", categoryList);
		
		mav.setViewName("shop/index");
		
		return mav;
	}
}
