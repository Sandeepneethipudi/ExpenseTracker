package com.app.ExpenseTracker.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="expense")
@Getter
@Setter
public class ExpenseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(nullable = false)
    private CategoryEntity category;

    @Column(nullable = false)
     private double amount;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private  String merchant;

     @ManyToOne
     @JoinColumn(nullable = false)
     private PaymentMethodEntity paymentMethod;

     private String notes;
}
