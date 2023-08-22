package com.earnestbank.loan.domain;

public class Customer {
    //add the following attributes to the Customer class i.e. customerId, customerName, customerAge, customerGender, LoanApplication

    private int customerId;
    private String customerName;
    private int customerAge;
    private String customerGender;
    private LoanApplication loanApplication;

    public Customer() {
    }

    public Customer(int customerId, String customerName, int customerAge, String customerGender, LoanApplication loanApplication) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerGender = customerGender;
        this.loanApplication = loanApplication;
    }

    public int getCustomerId() {
        return customerId;
    }


    public String getCustomerName() {
        return customerName;
    }


    public int getCustomerAge() {
        return customerAge;
    }   

    public String getCustomerGender() {
        return customerGender;
    }   


    public LoanApplication getLoanApplication() {
        return loanApplication;
    }   

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }   

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }   


    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }   

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }

    @Override

    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge + ", customerGender=" + customerGender + ", loanApplication=" + loanApplication + '}';
    }

}







