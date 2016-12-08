package com.yaruis.ecommercebackend.dao;

import java.util.List;

import com.yaruis.ecommercebackend.model.Category;

public interface CategoryDAO {

	public void save(Category category);

	public void update(Category category);

	public void delete(String id);

	public Category get(String id);

	public List<Category> list();
}
