package com.manage.insurance.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.manage.insurance.logic.CustomerBo;
import com.manage.insurance.model.Customer;

@ManagedBean(name = "customer")
@SessionScoped
public class CustomerBean implements Serializable {
    // DI via Spring
    @Autowired
    CustomerBo customerBo;

    public String name;
    public String address;

    private static final long serialVersionUID = 5957846325926627154L;

    //
    public String doInitIndex() {

        return "index";
    }

    public String doInitCustomer() {
        return "index";
    }

    // get all customer data from database
    public List<Customer> getCustomerList() {
        List<Customer> customers = customerBo.findAllCustomer();
        System.out.println("customers "+customers.size());
        return customers;
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
