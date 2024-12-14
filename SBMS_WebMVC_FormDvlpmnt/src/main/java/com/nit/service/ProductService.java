package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.binders.Product;
import com.nit.entity.Products;
import com.nit.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void saveIntoDB(Product product) {  //binding the data into binders
		Products p = new Products();        //Calling entity
		p.setPid(product.getProductId());    //getting value from binders class 
		p.setPname(product.getProductName());    //And setting it into the entity 
		p.setPrice(product.getProductPrice());
		
		productRepository.save(p);                  //saving it into db
		System.out.println("Products Saved Into DB...");
	}
}
