package com.manage.insurance.logic.impl;

import java.util.List;

import com.manage.insurance.dao.CustomerDao;
import com.manage.insurance.logic.CustomerBo;
import com.manage.insurance.model.Customer;

public class CustomerBoImpl implements CustomerBo {
    
    CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void addCustomer(Customer customer) {

        customerDao.addCustomer(customer);

    }

    public List<Customer> findAllCustomer() {

        return customerDao.findAllCustomer();
    }
}
