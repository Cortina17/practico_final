package com.practico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practico.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
