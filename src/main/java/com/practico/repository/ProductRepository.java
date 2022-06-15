package com.practico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practico.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
