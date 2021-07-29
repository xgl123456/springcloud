package productview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productview.client.FeignServiceClient;
import productview.pojo.Product;

@Service
public class ProductService {

	@Autowired
	FeignServiceClient feignServiceClient;
	
	public List<Product> list(){
		return feignServiceClient.lProducts();
	}
}
