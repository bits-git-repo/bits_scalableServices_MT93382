package com.stockbroker.stockbrokingservice.response;

import java.sql.Date;

public class DepositoryAccountResponse {

    private int CustomerID;
    private String CustomerName;
    private int DepositoryAccountID;
    private String DepositoryAccountType;
    private String AccountStatus;
    private Date DateOpened;
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
