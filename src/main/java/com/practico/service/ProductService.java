package com.practico.service;

import java.util.List;

import com.practico.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	void saveProduct(Product product);

	Product getProductById(long id);

	void deleteProductById(long id);

}
