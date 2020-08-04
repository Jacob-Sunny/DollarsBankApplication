package com.dollarsbank.model;

public class Customer {
    //Decelerations
    private String customerName;
    private String customerPhoneNumber;
    private String customerAddress;
    private String customerID;
    private String password;

    //default constructor
    public Customer() {
    }

    //parameterized constructor
    public Customer(String customerName, String customerPhoneNumber, String customerAddress, String customerID, String password) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAddress = customerAddress;
        this.customerID = customerID;
        this.password = password;
    }


    /************** GETTERS and SETTERS *********/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


}
