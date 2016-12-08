package com.yaruis.ecommercebackend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yaruis.ecommercebackend.dao.CategoryDAO;
import com.yaruis.ecommercebackend.model.Category;

public class CategoryTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static CategoryDAO categoryDAO;

	@Autowired
	static Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.yaruis.ecommercebackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		category = (Category) context.getBean("category");

	}

	@Test
	public void CreateCategoryTestCase() {
		category.setCategory_name("LO");  
		category.setCategory_id("CA106");
		category.setCategory_description("MUMBAI");
		// added by KZN
		categoryDAO.save(category);
		
	//	String categoryName = category.getCategory_name();
		
		//assertEquals("Get the Category Name", "Covers1", categoryName);

	}
    @Test
    public void getAllCategoryTestCase(){
    	
    	
    }

	

}
// public static void main(String[] args) {
//
//
// AnnotationConfigApplicationContext context = new
// AnnotationConfigApplicationContext();
// context.scan("com");
// context.refresh();
//
// Category c =(Category) context.getBean("category");
//
// CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
//
// c.setCategory_id("SUp1");
// c.setCategory_name("ajit");
// c.setCategory_description("ajit");
// categoryDAO.save(c);
//
// }
// }
