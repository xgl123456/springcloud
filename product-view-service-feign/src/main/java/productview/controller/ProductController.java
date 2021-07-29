package productview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import productview.pojo.Product;
import productview.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/products")
	public Object products(Model m){
		List<Product> ps = productService.list();
		m.addAttribute("ps", ps);
		return "products";
	}
}
