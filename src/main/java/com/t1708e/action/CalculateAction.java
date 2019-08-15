package com.t1708e.action;

import com.opensymphony.xwork2.ActionSupport;
import com.t1708e.entity.MonthlyPayment;

public class CalculateAction extends ActionSupport {
    private MonthlyPayment monthlyPayment;

    public String form(){
        monthlyPayment = new MonthlyPayment();
        return INPUT;
    }

    public String calculate(){
        monthlyPayment.calculateMonthlyPaymentAmount();
        return SUCCESS;
    }

    public MonthlyPayment getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(MonthlyPayment monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
