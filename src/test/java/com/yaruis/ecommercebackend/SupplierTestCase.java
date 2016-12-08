package com.yaruis.ecommercebackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yaruis.ecommercebackend.dao.SupplierDAO;
import com.yaruis.ecommercebackend.model.Supplier;



public class SupplierTestCase {
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired 
	static Supplier supplier;
	
	@BeforeClass
	public static void init()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.yaruis.ecommercebackend");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		supplier = (Supplier) context.getBean("supplier");

	}
	

	@Test
	public void CreateSupplierTestCase() {
        supplier.setSupplier_id("SUP03");
        supplier.setSupplier_name("Ajit");
        supplier.setSupplier_address("Mulund");
		supplierDAO.update(supplier);
		
		//String supplierName = supplier.getSupplier_name();
		
		//assertEquals("Get the Supplier Name", "Ruju", supplierName);

        
		
		
        }

}
