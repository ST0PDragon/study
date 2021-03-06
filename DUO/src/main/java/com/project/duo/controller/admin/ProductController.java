package com.project.duo.controller.admin;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.duo.domain.Product;
import com.project.duo.domain.ProductImg;
import com.project.duo.exception.ProductException;
import com.project.duo.exception.ProductImgException;
import com.project.duo.exception.UploadException;
import com.project.duo.model.category.CategoryService;
import com.project.duo.model.product.ProductService;
import com.project.duo.util.FileManager;
import com.project.duo.util.Pager;

/*관리자의 상품과 관련된 요청을 처리하는 하위 컨트롤러 */
@Controller
public class ProductController {
	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private Pager pager;
	
	//상품 목록 요청
	@GetMapping("/product/list")
	public String getList(HttpServletRequest request, Model model) {
		List productList = productService.selectAll();
		pager.init(productList, request);
		
		model.addAttribute("productList", productList);
		model.addAttribute("pager", pager);
		
		return "admin/product/list";
	}
	
	//상품 등록 폼 요청 
	@GetMapping("/product/registform")
	public String registForm(Model model) {
		List categoryList=categoryService.selectAll();//3단계: 카테고리 목록 가져오기
		model.addAttribute("categoryList", categoryList); //4단계: 저장하기
		
		return "admin/product/regist";
	}
	
	@RequestMapping(value="/product/regist", method=RequestMethod.POST)
	public String regist(HttpServletRequest request, Product product) {
		//이미지 저장 + db에 저장
		String[] imgArray=fileManager.saveMultiFile(request, product);
		System.out.println("imgArray is "+imgArray);
		
		List imgList = new ArrayList();
		for(String obj : imgArray) {
			ProductImg productImg=  new ProductImg(); //empty
			productImg.setImg(obj); // 478437588345.jpg
			imgList.add(productImg); //리스트에 모으기!!
		}
		
		//서비스에게 db저장 
		productService.regist(product,imgList );   //  product 테이블 + product_img 테이블
		
		System.out.println("업로드 성공");
		
		return "redirect:/admin/product/list";
	}
	
	@ExceptionHandler(UploadException.class)
	public ModelAndView handle(UploadException e) {
		ModelAndView mav = new ModelAndView("");
		mav.addObject("e", e); //에러 객체심기
		return mav;
	}
	
	@ExceptionHandler(ProductException.class)
	public ModelAndView handle(ProductException e) {
		ModelAndView mav = new ModelAndView("");
		mav.addObject("e", e); //에러 객체심기
		return mav;
	}
	@ExceptionHandler(ProductImgException.class)
	public ModelAndView handle(ProductImgException e) {
		ModelAndView mav = new ModelAndView("");
		mav.addObject("e", e); //에러 객체심기
		return mav;
	}
	
}














