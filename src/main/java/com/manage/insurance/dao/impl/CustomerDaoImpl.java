package com.manage.insurance.dao.impl;
 
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.manage.insurance.dao.CustomerDao;
import com.manage.insurance.model.Customer;
 
public class CustomerDaoImpl extends 
       HibernateDaoSupport implements CustomerDao{
 
	public void addCustomer(Customer customer){
 
		customer.setCreatedDate(new Date());
		getHibernateTemplate().save(customer);
 
	}
 
	public List<Customer> findAllCustomer(){
 
		return getHibernateTemplate().find("from Customer");
 
	}
}