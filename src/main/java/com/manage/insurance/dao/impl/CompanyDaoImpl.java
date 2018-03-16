package com.manage.insurance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.orm.hibernate3.HibernateAccessor;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.manage.insurance.dao.CompanyDao;
import com.manage.insurance.model.Company;

public class CompanyDaoImpl extends HibernateDaoSupport implements CompanyDao {

    @Override
    public void addCompany(Company company) {
        // TODO Auto-generated method stub

    }

    @SuppressWarnings("unchecked")
    public List<Company> findAllCompany() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(this.getSessionFactory());
        hibernateTemplate.setAlwaysUseNewSession(true);
        hibernateTemplate.setFlushMode(HibernateAccessor.FLUSH_NEVER);
        List<Company> companys = hibernateTemplate.find("from Company");
        if (companys.isEmpty()) {
            return null;
        } else {
            return companys;
        }
    }

    @Override
    public List<SelectItem> findItemCompany() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(this.getSessionFactory());
        hibernateTemplate.setAlwaysUseNewSession(true);
        hibernateTemplate.setFlushMode(HibernateAccessor.FLUSH_NEVER);
        List<SelectItem> itemCompanys = new ArrayList<SelectItem>();

        List<Company> companys = hibernateTemplate.find("from Company");
        if (companys.isEmpty()) {
            return null;
        } else {
            for (Company company : companys) {
                SelectItem item = new SelectItem();
                item.setLabel(company.getCompanyName());
                item.setValue(company.getCompanyInternalId() + "");
                itemCompanys.add(item);
            }
        }
        return itemCompanys;
    }
}
