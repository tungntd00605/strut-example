package com.t1708e.entity;

public class MonthlyPayment {
    private double borrowedAmount;
    private double interestRate;
    private int month;
    private double amount;

    public double calculateMonthlyPaymentAmount(){
        double monthlyI = interestRate/12/100;
        this.amount = this.borrowedAmount * ((monthlyI*Math.pow((1+ monthlyI), month)) / (Math.pow((1 + monthlyI), month) -1));
        return this.amount;
    }

    public double getBorrowedAmount() {
        return borrowedAmount;
    }

    public void setBorrowedAmount(double borrowedAmount) {
        this.borrowedAmount = borrowedAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getAmount() {

        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
