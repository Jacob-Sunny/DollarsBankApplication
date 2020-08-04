package com.dollarsbank.model;

public class Account {
    //Decelerations
    private String accountID;
    private String initialDeposit;
    private String CheckingAccount;
    private String SavingsAccount;
    private String logTime;
    //parameterized constructor
    public Account(String accountID, String initialDeposit, String checkingAccount, String savingsAccount, String logTime) {
        this.accountID = accountID;
        this.initialDeposit = initialDeposit;
        CheckingAccount = checkingAccount;
        SavingsAccount = savingsAccount;
        this.logTime = logTime;
    }
    //default constructor
    public Account() {
    }

    /************** GETTERS and SETTERS *********/

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(String initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public String getCheckingAccount() {
        return CheckingAccount;
    }

    public void setCheckingAccount(String checkingAccount) {
        CheckingAccount = checkingAccount;
    }

    public String getSavingsAccount() {
        return SavingsAccount;
    }

    public void setSavingsAccount(String savingsAccount) {
        SavingsAccount = savingsAccount;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }
}
