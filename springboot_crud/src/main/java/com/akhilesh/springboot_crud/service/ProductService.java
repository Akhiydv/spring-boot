package com.akhilesh.springboot_crud.service;

import java.util.List;

import com.akhilesh.springboot_crud.model.Product;

public interface ProductService {

	Product createProduct(Product product);
	
	Product updateProduct(Product product);
	
	List<Product> getAllProduct();
	
	Product getProductById(long productId);
	
	void deleteProduct(long id);
	
}
