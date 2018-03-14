package com.manage.insurance.logic;
 
import java.util.List;

import com.manage.insurance.model.Customer;
 
public interface CustomerBo{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}