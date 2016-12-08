package com.yaruis.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Category {

	@Id
	private String Category_id;

	@Column
	private String Category_name;

	@Column
	private String Category_description;

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}

	public String getCategory_name() {
		return Category_name;
	}

	public void setCategory_name(String category_name) {
		Category_name = category_name;
	}

	public String getCategory_description() {
		return Category_description;
	}

	public void setCategory_description(String category_description) {
		Category_description = category_description;
	}


}
