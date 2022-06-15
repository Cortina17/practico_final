package com.practico.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "status")
	private String status;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "delivery_date")
	private LocalDate deliveryDate;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@ManyToMany
	@JoinTable(name = "order_product_relationship", joinColumns = {
			@JoinColumn(name = "order_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })

	List<Product> products;

	public Order() {
	}

	public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, Customer Customer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = Customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
