package com.manage.insurance.dao;
 
import java.util.List;

import com.manage.insurance.model.Customer;
 
public interface CustomerDao{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}