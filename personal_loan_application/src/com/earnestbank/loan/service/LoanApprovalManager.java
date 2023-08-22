package com.earnestbank.loan.service;
/*Singleton Class for LoanApprovalManager */

public class LoanApprovalManager {
//add the private instance variable of type LoanApprovalManager
private static LoanApprovalManager loanApprovalManager;

//add the private constructor

private LoanApprovalManager() {

}

/* add the singleton design pattern for LoanApprovalManager */
public static LoanApprovalManager getInstance() {
    if (loanApprovalManager == null) {
        synchronized(LoanApprovalManager.class) {
            if (loanApprovalManager == null) {
                loanApprovalManager = new LoanApprovalManager();
            }
        }
    }
    return loanApprovalManager;
}

public boolean ApproveLoan(Customer customer) {
    /*approve loan if
     * customer age is greater than 18
     *  
     * 
      */

    if (customer.getCustomerAge() < 18) {
        return false;
    return true;
}
}
