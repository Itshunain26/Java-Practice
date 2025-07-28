package com.example;

public class Bank {
    public static void main(String[] args) {
        System.out.println("\t\tHunain Shaikh 241P043");
        System.out.println("\t\tBank Account Manager\n");
        BankAccount b1 = new BankAccount();
        b1.SetAccNo(241006);
        b1.GetAccNo();
        b1.AddBal(1000);
        b1.GetBal();
    }
}

class BankAccount{
    private int accountno;
    private double bal = 0;

    public void GetBal(){
        System.out.println("Current balance is " + bal + "/-");
    }

    public void AddBal(double x){
        if(x > 0){
            bal += x;
        }
        else{
            System.out.println("Balance cannot be negative.");
        }
    }

    public void SetAccNo(int x){
        accountno = x;
    }

    public void GetAccNo(){
        System.out.println("Account Number :- " + accountno);
    }
}