package com.akhilesh.springboot_crud.controller;

import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhilesh.springboot_crud.model.Product;
import com.akhilesh.springboot_crud.service.ProductService;

@RestController
public class ProductController 
{
  @Autowired
  private ProductService productService;
  
  
  @GetMapping("/products")
  public ResponseEntity<List<Product>> getAllProduct()
  {
	return ResponseEntity.ok().body(productService.getAllProduct());
  }
  
  
  @GetMapping("/products/{id}")
  public ResponseEntity<Product> getProductById(@PathVariable long id)
  {
	return ResponseEntity.ok().body(productService.getProductById(id));
  }
  
  
  @PostMapping("/products")
  public ResponseEntity<Product> createProduct(@RequestBody Product product)
  {
	  return ResponseEntity.ok().body(this.productService.createProduct(product));
  }
  
  
  @PutMapping("/products/{id}")
  public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product product)
  {
	  return ResponseEntity.ok().body(this.productService.updateProduct(product)); 
  }
  
  
  @DeleteMapping("/products/{id}")
  public ResponseEntity<?> deleteProduct(@PathVariable long id)
  {
	  this.productService.deleteProduct(id);
	  return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK); 
  }
  
}

