package com.yaruis.ecommercebackend.dao;

import java.util.List;

import com.yaruis.ecommercebackend.model.Product;


public interface ProductDAO {
	public void save(Product product);

	public void update(Product product);

	public void deleteID(String id);

	public Product get(String id);

	public List<Product> list();
}
