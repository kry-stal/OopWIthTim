package OopWithTim;

import java.util.Scanner;
public class PracticeRun {
    private long accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private long phoneNumber;

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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(){
        Scanner scannerDeposit = new Scanner(System.in);
        System.out.println("ENTER AMOUNT TO DEPOSIT: ");
        long amountToDeposit = scannerDeposit.nextLong();
        double newAccountBalance = amountToDeposit + accountBalance;
        System.out.println(amountToDeposit + " Has been Credited to your Account, " + customerName);
        System.out.println("YOUR NEW ACCOUNT BALANCE IS: " + newAccountBalance);
        scannerDeposit.close();
    }

    public void withdrawFunds(){
        Scanner scannerWithdraw = new Scanner(System.in);
        System.out.println("ENTER AMOUNT TO WITHDRAW: ");
        long amountToWithdraw = scannerWithdraw.nextLong();

        System.out.println("ENTER ACCOUNT NUMBER: ");
        long collectAccountNumber = scannerWithdraw.nextLong();
        if(collectAccountNumber == accountNumber) {
            System.out.println("WELCOME " + customerName
            + " KINDLY CONFIRM WITHDRAWAL OF " + amountToWithdraw + " \n"
        + " 1. CONTINUE 2. CANCEL" + "\n");
            int choice = scannerWithdraw.nextInt();
            if (choice == 1 && accountBalance > amountToWithdraw){
                double newAccountBalance = accountBalance - amountToWithdraw;
                System.out.println(" WITHDRAWAL SUCCESSFULL " + " \n"
                + " YOUR NEW ACCOUNT BALANCE IS: " + newAccountBalance);
            } else if (choice == 1 && accountBalance < amountToWithdraw) {
                System.out.println("INSUFFICIENT AMOUNT");
            } else {
                System.out.println("WITHDRAWAL TERMINATED SUCCESSFULLY");
            }
        } scannerWithdraw.close();



    }
}

