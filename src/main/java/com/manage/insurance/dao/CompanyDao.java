package com.manage.insurance.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import com.manage.insurance.model.Company;
import com.manage.insurance.model.Customer;


public interface CompanyDao {
    void addCompany(Company company);

    List<Company> findAllCompany();
    
    List<SelectItem> findItemCompany();
}
