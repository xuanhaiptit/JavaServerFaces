package com.manage.insurance.logic.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import com.manage.insurance.dao.CompanyDao;
import com.manage.insurance.logic.CompanyLogic;
import com.manage.insurance.model.Company;

public class CompanyLogicImpl implements CompanyLogic {
    CompanyDao companyDao;

    public void setCompanyDao(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public List<Company> findAllCompany() {
        return companyDao.findAllCompany();
    }

    @Override
    public List<SelectItem> findItemCompany() {
        return companyDao.findItemCompany();
    }

}
