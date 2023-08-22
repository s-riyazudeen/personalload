package com.earnestbank.loan.domain;

public class LoanApplication {

//add the following attributes to the LoanApplication class i.e. applicationId, loanAmount, tenureInYears, creditScore

    private int applicationId;
    private double loanAmount;
    private int tenureInYears;
    private int creditScore;

    public LoanApplication() {
    }

    public LoanApplication(int applicationId, double loanAmount, int tenureInYears, int creditScore) {
        this.applicationId = applicationId;
        this.loanAmount = loanAmount;
        this.tenureInYears = tenureInYears;
        this.creditScore = creditScore;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getTenureInYears() {
        return tenureInYears;
    }   

    public int getCreditScore() {
        return creditScore;
    }   

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }   

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setTenureInYears(int tenureInYears) {
        this.tenureInYears = tenureInYears;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "LoanApplication{" + "applicationId=" + applicationId + ", loanAmount=" + loanAmount + ", tenureInYears=" + tenureInYears + ", creditScore=" + creditScore + '}';
    }
}
