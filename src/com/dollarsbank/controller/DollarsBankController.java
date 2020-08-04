package com.dollarsbank.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import com.dollarsbank.utility.ConsolePrinterUtility;
import com.dollarsbank.utility.ConsolePrinterUtility.Result;
import com.dollarsbank.utility.ConsolePrinterUtility.TYPES;
import com.dollarsbank.model.Customer;
import com.dollarsbank.model.Account;


public class DollarsBankController {
    Customer customer = new Customer();
    Account account = new Account();


    public static boolean exitFlag = true;
    public void login(){
        Customer cust = new Customer();
        //Enter ID
        Result option;
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter ID:", TYPES.LINE, -1);
        String ID = option.getValue().toString();

        //Enter Password
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter password:", TYPES.LINE, -1);
        String password = option.getValue().toString();

        // Debugging
        /*
        System.out.println(ID);
        System.out.println(password);

        System.out.println(customer.getCustomerID());
        System.out.println(customer.getPassword());
        */


        if(ID.equals(customer.getCustomerID()) && password.equals(customer.getPassword())){
                    menu();
        }

    }

    public void menu(){
        System.out.println("Welcome Customer");
            do{
                System.out.println("Please choose an option to proceed:");

                System.out.println("1. Deposit Amount");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Funds Transfer");
                System.out.println("4. View 5 Recent Transaction");
                System.out.println("5. Display Customer Information");
                System.out.println("6. Sign out");

                Result option = ConsolePrinterUtility.retryUntilSucceeds("Your input: ", TYPES.INT, 6);
                switch (option.getValueAsInt()){
                    case 1:
                        depositMoney();
                        break;
                    case 2:
                        withdrawMoney();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        DisplayCustomerInfo();
                        break;
                    case 6:
                        exitFlag =false;
                        System.out.println("Thanks for using online banking, have a great day!");

                        break;
                    default:
                        System.out.println("ERROR PLease Try again");
                }

            }
            while (exitFlag);
        ConsolePrinterUtility.close();
    }


    public  void depositMoney(){
        Result option;
        option = ConsolePrinterUtility.retryUntilSucceeds("Deposit Money:", TYPES.LINE, -1);
        String deposit = option.getValue().toString();
        account.setCheckingAccount(deposit);

    }


    /**** needs to be implemented *****/
    public void withdrawMoney(){
        Result option;
        option = ConsolePrinterUtility.retryUntilSucceeds("Withdraw Money:", TYPES.LINE, -1);
        //String withdraw = option.getValue().toString();

        int num1 = option.getValueAsInt().intValue();
       // int num2 = account.getAccountID().hashCode();

        System.out.println(num1);
      //  System.out.println(num2);


    }

    public void DisplayCustomerInfo(){
        System.out.println("Customer Information");
        System.out.println(customer);
        System.out.println("Checking Account: " + account.getCheckingAccount());

    }

    public void createCustomerWithInputs(){
        Result option;


        //Enter a Customer ID
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter Customer ID:", TYPES.LINE, -1);
        String custId = option.getValue().toString();
        customer.setCustomerID(custId);

        //Enter name
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter Name:", TYPES.LINE, -1);
        String name = option.getValue().toString();
        customer.setCustomerName(name);

        //Enter Address
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter Address:", TYPES.LINE, -1);
        String adr = option.getValue().toString();
        customer.setCustomerAddress(adr);

        //Enter Phone Number
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter PhoneNumber:", TYPES.LINE, -1);
        String phoneNum = option.getValue().toString();
        customer.setCustomerPhoneNumber(phoneNum);

        //Enter Password
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter Password:", TYPES.LINE, -1);
        String password = option.getValue().toString();
        customer.setPassword(password);

        //Initial Deposit ---> which will go into checking account
        option = ConsolePrinterUtility.retryUntilSucceeds("Enter Initial Deposit:", TYPES.LINE, -1);
        String initialDep = option.getValue().toString();
        account.setInitialDeposit(initialDep); // for record what was their first deposit into the bank
        account.setCheckingAccount(initialDep);

        this.createCustomer(customer,account);
    }


    /******* DataBASE ****/
    public boolean createCustomer(Customer customer, Account account){
        return true;
    }



}
