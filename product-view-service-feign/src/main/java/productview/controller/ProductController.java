package productview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import productview.pojo.Product;
import productview.service.ProductService;

@Controller
@RefreshScope
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Value("${test}")
	String rbmqport;	
	
	@RequestMapping("/products")
	public Object products(Model m){
		List<Product> ps = productService.list();
		m.addAttribute("mq", rbmqport);
		m.addAttribute("ps", ps);
		return "products";
	}
}
