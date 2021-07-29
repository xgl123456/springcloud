package productview.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import productview.pojo.Product;


@FeignClient(value = "product-data-server")
public interface FeignServiceClient {
	
	@GetMapping("/products")
	public List<Product> lProducts();
}
