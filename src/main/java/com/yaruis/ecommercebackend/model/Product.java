package com.yaruis.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@Entity
@Table
public class Product {

	@Id
	private String Product_id;

	@Column
	private String Product_name;

	@Column
	private String Product_price;

	@Column
	private String Category_id;

	@Column
	private String Product_description;
	
	@Transient
	private MultipartFile image;

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public String getProduct_price() {
		return Product_price;
	}

	public void setProduct_price(String product_price) {
		Product_price = product_price;
	}

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}

	public String getProduct_description() {
		return Product_description;
	}

	public void setProduct_description(String product_description) {
		Product_description = product_description;
	}

}
