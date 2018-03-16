package com.manage.insurance.model;

import java.sql.Date;

public class Insurance {
    private int insuranceInternalId;
    private String insuranceNumber;
    private Date insuranceStartDate;
    private Date insuranceEndDate;
    private String placeOfRegister;

    public int getInsuranceInternalId() {
        return insuranceInternalId;
    }

    public void setInsuranceInternalId(int insuranceInternalId) {
        this.insuranceInternalId = insuranceInternalId;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Date getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(Date insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }

    public Date getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(Date insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }

    public String getPlaceOfRegister() {
        return placeOfRegister;
    }

    public void setPlaceOfRegister(String placeOfRegister) {
        this.placeOfRegister = placeOfRegister;
    }

}
