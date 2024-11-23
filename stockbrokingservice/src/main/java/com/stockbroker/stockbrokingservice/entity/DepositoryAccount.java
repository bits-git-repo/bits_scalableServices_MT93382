package com.stockbroker.stockbrokingservice.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "depositoryaccount")
public class DepositoryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("CustomerID")
    @Column(name = "CustomerID")
    private int CustomerID;

    @JsonProperty("CustomerName")
    @Column(name = "CustomerName")
    private String CustomerName;

    @JsonProperty("DepositoryAccountID")
    @Column(name = "DepositoryAccountID")
    private int DepositoryAccountID;

    @JsonProperty("DepositoryAccountType")
    @Column(name = "DepositoryAccountType")
    private String DepositoryAccountType;

    @JsonProperty("AccountStatus")
    @Column(name = "AccountStatus")
    private String AccountStatus;

    @JsonProperty("DateOpened")
    @Column(name = "DateOpened")
    private Date DateOpened;

    @JsonProperty("DateClosed")
    @Column(name = "DateClosed")
    private Date DateClosed;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setId(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getDepositoryAccountID(int DepositoryAccountID) {
        return DepositoryAccountID;
    }

    public void setDepositoryAccountID(int DepositoryAccountID) {
        this.DepositoryAccountID = DepositoryAccountID;
    }

    public String getDepositoryAccountType() {
        return DepositoryAccountType;
    }

    public void setDepositoryAccountType(String DepositoryAccountType) {
        this.DepositoryAccountType = DepositoryAccountType;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    public Date getDateOpened() {
        return DateOpened;
    }

    public void setDateOpened(Date DateOpened) {
        this.DateOpened = DateOpened;
    }

    public Date getDateClosed() {
        return DateClosed;
    }

    public void setDateClosed(Date DateClosed) {
        this.DateClosed = DateClosed;

    }
}
