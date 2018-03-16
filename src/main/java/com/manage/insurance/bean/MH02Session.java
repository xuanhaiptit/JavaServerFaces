package com.manage.insurance.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import org.springframework.context.annotation.Scope;

@ManagedBean(name = "MH02Session")
@SessionScoped

public class MH02Session {
    List<SelectItem> listItemsCompany;
    String companyInternalId;

    public List<SelectItem> getListItemsCompany() {
        return listItemsCompany;
    }

    public void setListItemsCompany(List<SelectItem> listItemsCompany) {
        this.listItemsCompany = listItemsCompany;
    }

    public String getCompanyInternalId() {
        return companyInternalId;
    }

    public void setCompanyInternalId(String companyInternalId) {
        this.companyInternalId = companyInternalId;
    }

}
