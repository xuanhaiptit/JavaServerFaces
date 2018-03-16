package com.manage.insurance.logic;

import java.util.List;

import javax.faces.model.SelectItem;

import com.manage.insurance.model.Company;

public interface CompanyLogic {
    List<Company> findAllCompany();
    
    List<SelectItem> findItemCompany();
}
