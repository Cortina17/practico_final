package com.practico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practico.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
