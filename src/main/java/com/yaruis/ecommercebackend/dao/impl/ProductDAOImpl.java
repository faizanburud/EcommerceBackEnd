package com.yaruis.ecommercebackend.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yaruis.ecommercebackend.dao.ProductDAO;
import com.yaruis.ecommercebackend.model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
//	@Autowired
//ProductDAO prdoa;
	@Transactional
	public void save(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);

	}

	@Transactional
//	public void update(Product product) {
//		sessionFactory.getCurrentSession().update(product);
//	}
//		@Transactional
	public void update(Product product) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(product);
       // session.flush();
//        logger.info("Product updated successfully, Product Details="+product);
	}
	

	@Transactional
	public void deleteID(String id) {
		Product product = new Product();
		product.setProduct_id(id);
sessionFactory.getCurrentSession().delete(product);

//		Session session = this.sessionFactory.getCurrentSession();
//		 session.delete(id);
//	     session.flush();
//logger.info("Product deleted successfully, product details="+product);
		
	}
	
	
	@Transactional
	public Product get(String id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Transactional
	public List<Product> list() {
	 String hql="from Product";
	 Query query=sessionFactory.getCurrentSession().createQuery(hql);
	 	return query.list();
	}

	

	
}
