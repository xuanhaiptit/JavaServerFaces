package com.manage.insurance.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateAccessor;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.manage.insurance.dao.CustomerDao;
import com.manage.insurance.model.Customer;
import com.sun.istack.internal.logging.Logger;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
    public void addCustomer(Customer customer) {
        customer.setCreatedDate(new Date());
        getHibernateTemplate().save(customer);

    }

    @SuppressWarnings("unchecked")
    public List<Customer> findAllCustomer() {
        System.out.println("qua dao customer");
        HibernateTemplate hibernateTemplate = new HibernateTemplate(this.getSessionFactory());
        hibernateTemplate.setAlwaysUseNewSession(true);
        hibernateTemplate.setFlushMode(HibernateAccessor.FLUSH_NEVER);
        List<Customer> customers = hibernateTemplate.find("from Customer");
        if (customers.isEmpty()) {
            return null;
        } else {
            return customers;
        }
    }
}
