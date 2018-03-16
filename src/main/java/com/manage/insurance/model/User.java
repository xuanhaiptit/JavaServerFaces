package com.manage.insurance.model;

import java.sql.Date;

public class User {
    private int userInternalId;
    private String userFullName;
    private String userSexDivision;
    private Date birthdate;
    private Company company;
    private Insurance insurance;

    public User() {}

    public User(int userInternalId, String userFullName, String userSexDivision, Date birthdate, Company company,
            Insurance insurance) {
        super();
        this.userInternalId = userInternalId;
        this.userFullName = userFullName;
        this.userSexDivision = userSexDivision;
        this.birthdate = birthdate;
        this.company = company;
        this.insurance = insurance;
    }

    public int getUserInternalId() {
        return userInternalId;
    }

    public void setUserInternalId(int userInternalId) {
        this.userInternalId = userInternalId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserSexDivision() {
        return userSexDivision;
    }

    public void setUserSexDivision(String userSexDivision) {
        this.userSexDivision = userSexDivision;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

}
