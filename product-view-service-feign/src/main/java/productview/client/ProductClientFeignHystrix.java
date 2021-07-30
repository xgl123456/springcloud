package productview.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import productview.pojo.Product;

@Component
public class ProductClientFeignHystrix implements FeignServiceClient{

	@Override
	public List<Product> lProducts() {
		List<Product> result = new ArrayList<Product>();
		result.add(new Product(0, "产品数据微服务不可用", 0));
		return result;
	}

}
