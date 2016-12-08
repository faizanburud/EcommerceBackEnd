package com.yaruis.ecommercebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table

public class Supplier {
@Id
private String Supplier_id;
@Column
private String Supplier_name;
@Column
private String Supplier_address;
public String getSupplier_id() {
	return Supplier_id;
}
public void setSupplier_id(String supplier_id) {
	Supplier_id = supplier_id;
}
public String getSupplier_name() {
	return Supplier_name;
}
public void setSupplier_name(String supplier_name) {
	Supplier_name = supplier_name;
}
public String getSupplier_address() {
	return Supplier_address;
}
public void setSupplier_address(String supplier_address) {
	Supplier_address = supplier_address;
}


	
}
