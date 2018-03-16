package com.manage.insurance.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.manage.insurance.constant.ScreenConstant;
import com.manage.insurance.logic.CompanyLogic;
import com.manage.insurance.model.Company;

@ManagedBean(name = "MH02Bean", eager = true)
@RequestScoped
public class MH02Bean implements Serializable {
    private static final long serialVersionUID = 5001311425387553107L;
    @Autowired
    CompanyLogic companyLogic;
    @Autowired
    MH02Session mh02Session;

    List<SelectItem> listItemsCompany;
    String companyInternalId;
    String userFullName;
    String insuranceNumber;
    String placeOfRegister;

    public List<SelectItem> getListItemCompany() {
        return companyLogic.findItemCompany();
    }

    public String doInitMH02() {
        listItemsCompany = companyLogic.findItemCompany();

        return ScreenConstant.SCREEN_MH02;
    }

    public String valueChanged(ValueChangeEvent event) {

        return ScreenConstant.SCREEN_MH02;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getPlaceOfRegister() {
        return placeOfRegister;
    }

    public void setPlaceOfRegister(String placeOfRegister) {
        this.placeOfRegister = placeOfRegister;
    }

    public List<SelectItem> getListItemsCompany() {
        return listItemsCompany;
    }

    public void setListItemsCompany(List<SelectItem> listItemsCompany) {
        this.listItemsCompany = listItemsCompany;
    }

    public CompanyLogic getCompanyLogic() {
        return companyLogic;
    }

    public void setCompanyLogic(CompanyLogic companyLogic) {
        this.companyLogic = companyLogic;
    }

    public String getCompanyInternalId() {
        return companyInternalId;
    }

    public void setCompanyInternalId(String companyInternalId) {
        this.companyInternalId = companyInternalId;
    }

}
