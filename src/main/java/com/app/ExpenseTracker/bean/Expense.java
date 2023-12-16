package com.app.ExpenseTracker.bean;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expense {

    private Long id;
    private User user;
    private Category category;
    private double amount;
    private Date date;
    private String merchant;
    private PaymentMethod paymentMethod;
    private String notes;

}

