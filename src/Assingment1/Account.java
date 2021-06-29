package Assingment1;

import java.util.Date;

public class Account {
    private int number;
    private double balance;
    private  Date date;

    public Account(int number) {
        super();
        this.number = number;
        this.balance = (double)0.0;
        this.date = new Date();
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Date getDate() {
       return date;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public int  getNumber() { return this.number;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", balance=" + balance + "]"+"date" +date;
    }
}

