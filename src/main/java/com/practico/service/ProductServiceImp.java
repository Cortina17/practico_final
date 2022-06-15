package com.practico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.practico.model.Product;
import com.practico.repository.ProductRepository;

public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public void saveProduct(Product product) {
		this.productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> optionalCourse = productRepository.findById(id);
		Product course = null;
		if (optionalCourse.isPresent()) {
			course = optionalCourse.get();
		} else {
			throw new RuntimeException("Product not found for this id: " + id);
		}
		return course;
	}

	@Override
	public void deleteProductById(long id) {
		this.productRepository.deleteById(id);

	}

}
