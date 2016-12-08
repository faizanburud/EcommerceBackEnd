package com.yaruis.ecommercebackend.dao.impl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yaruis.ecommercebackend.dao.SupplierDAO;
import com.yaruis.ecommercebackend.model.Supplier;

@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);

	}

	@Transactional
	public void update(Supplier supplier) {
		sessionFactory.getCurrentSession().update(supplier);

	}

	@Transactional
	public void delete(String id) {
		Supplier supplier = new Supplier();
		supplier.setSupplier_id(id);
		sessionFactory.getCurrentSession().delete(supplier);
	}
	@Transactional
	public Supplier get(String id) {
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);
		
	}
@Transactional
	public List<Supplier> list() {
      String hql ="from Supplier";
      Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

}
