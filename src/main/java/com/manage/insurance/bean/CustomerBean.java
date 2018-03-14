package com.manage.insurance.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.event.PhaseEvent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.manage.insurance.logic.CustomerBo;
import com.manage.insurance.model.Customer;


public class CustomerBean implements Serializable {
	// DI via Spring
	CustomerBo customerBo;

	public String name;
	public String address;

	private static final long serialVersionUID = 5957846325926627154L;
//
	public String doInitIndex() {
			
			return "index";
	}

	// get all customer data from database
	public List<Customer> getCustomerList() {
		return customerBo.findAllCustomer();
	}

	// add a new customer data into database
	public String addCustomer() {
		Customer cust = new Customer();
		cust.setName(getName());
		cust.setAddress(getAddress());

		customerBo.addCustomer(cust);

		clearForm();

		return "test";
	}

	// clear form values
	private void clearForm() {
		setName("");
		setAddress("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}

}
