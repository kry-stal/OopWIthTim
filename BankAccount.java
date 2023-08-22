package OopWithTim;

import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public double withdrawFunds() {
        Scanner scannerWithdraw = new Scanner(System.in);
        double newAccountBalance = 0;
        System.out.println("ENTER AMOUNT TO WITHDRAW: ");
        double amountToWithdraw = scannerWithdraw.nextDouble();

        System.out.println("ENTER ACCOUNT NUMBER: ");
        long collectAccountNumber = scannerWithdraw.nextLong();

        if (collectAccountNumber != accountNumber) {
            System.out.println("INCORRECT CREDENTIALS");
        }
        else{
            System.out.println("WELCOME " + customerName
                    + " KINDLY CONFIRM WITHDRAWAL OF #" + amountToWithdraw + " \n"
                    + " 1. CONTINUE 2. CANCEL" + "\n");
            int choice = scannerWithdraw.nextInt();
            if (choice == 1 && accountBalance >= amountToWithdraw) {
                newAccountBalance = (accountBalance - amountToWithdraw);
                System.out.println(" WITHDRAWAL PROCESSED SUCCESSFULLY " + " \n"
                        + " YOUR NEW ACCOUNT BALANCE IS: #" + newAccountBalance);
            } else if (choice == 1 && (accountBalance - amountToWithdraw) < 0) {
                newAccountBalance = accountBalance;
                System.out.println("INSUFFICIENT FUNDS! ACCOUNT BALANCE IS #" + newAccountBalance);
            } else {
                newAccountBalance = accountBalance;
                System.out.println("WITHDRAWAL TERMINATED SUCCESSFULLY! \n ACCOUNT BALANCE IS #" + newAccountBalance);
            }
        }
        return this.accountBalance = newAccountBalance;
    }

    public double depositFunds() {
        Scanner scannerDeposit = new Scanner(System.in);
        System.out.println("ENTER AMOUNT TO DEPOSIT: ");
        double amountToDeposit = scannerDeposit.nextDouble();
        double newAccountBalance = (amountToDeposit + accountBalance);
        System.out.println("#" + amountToDeposit + " Has been Credited to your Account, " + customerName);
        System.out.println("YOUR NEW ACCOUNT BALANCE IS: #" + newAccountBalance);
        return this.accountBalance = newAccountBalance;
    }

    public void customerInformation(){
        System.out.println(
                "CUSTOMER NAME: " + customerName + "\n" +
                        "ACCOUNT NUMBER: " + accountNumber + "\n" +
                "EMAIL ADDRESS: " + emailAddress + "\n" +
                "PHONE NUMBER: " + phoneNumber + "\n" +
                "CURRENT ACCOUNT BALANCE: " + this.accountBalance);
    }

}





