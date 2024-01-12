package com.akhilesh.springboot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilesh.springboot_crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
