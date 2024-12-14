package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.binders.Product;
import com.nit.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
 
	@Autowired
	private ProductService productService;
	
	@GetMapping("/productform")
	public String loadForm(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "productform";
	}
	
	@PostMapping("/saveProductDetails")
	public String handleRequest(Product product,Model model) {
		//System.out.println(product);
		productService.saveIntoDB(product);
		model.addAttribute("msg","Products Saved successfully!!!");
		return "output";
	}
}
