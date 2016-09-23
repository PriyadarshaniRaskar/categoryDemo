package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.CategoryDemoDAO;

@Controller
public class CategoryController {

	@Autowired 
	CategoryDemoDAO categoryDemoDAO ;
	
	
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mv =new ModelAndView("index");
		
		
		mv.addObject("isHomeClicked", "true");
		return mv;
	}
	
	
	
	@RequestMapping("/viewCategory")
	public ModelAndView view(Model model){
		ModelAndView mv = new ModelAndView("index");		
		model.addAttribute("listOfCategories",categoryDemoDAO.list());
		mv.addObject("isCategoryView","true");
		return mv;
	}
}
