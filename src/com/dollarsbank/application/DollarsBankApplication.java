package com.dollarsbank.application;

import com.dollarsbank.utility.ConsolePrinterUtility;
import com.dollarsbank.utility.ConsolePrinterUtility.Result;
import com.dollarsbank.utility.ConsolePrinterUtility.TYPES;
import com.dollarsbank.controller.DollarsBankController;

public class DollarsBankApplication {


    public static boolean exitFlag = true;

    public static void main(String[] args) {
        DollarsBankController dbc = new DollarsBankController();
    System.out.println("Welcome to Online Banking!!!");
        do {
            System.out.println("Please choose an option to proceed:");

            System.out.println("1. Create a New Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            Result option = ConsolePrinterUtility.retryUntilSucceeds("Your input: ", TYPES.INT, 3);

            switch (option.getValueAsInt()) {

                case 1:
                    System.out.println("Create a new Account");
                    dbc.createCustomerWithInputs();
                    break;

                case 2:
                    System.out.println("Please enter your ID and Password to proceed");
                    dbc.login();
                    break;

                case 3:
                    exitFlag = false;
                    System.out.println("Thanks for using online banking, have a great day!");
            }

        } while (exitFlag);

        ConsolePrinterUtility.close();

    }


    }

