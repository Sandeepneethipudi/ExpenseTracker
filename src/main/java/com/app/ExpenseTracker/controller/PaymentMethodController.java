package com.app.ExpenseTracker.controller;

import java.util.List;

import jakarta.annotation.Resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ExpenseTracker.bean.PaymentMethod;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.service.PaymentMethodService;
import com.app.ExpenseTracker.service.UserService;

@RestController
@RequestMapping("/paymentMethod")
public class PaymentMethodController {

    @Resource
    private PaymentMethodService paymentMethodService;

    @PostMapping("/create")
    public PaymentMethod create(@RequestBody PaymentMethod paymentMethod){
        return paymentMethodService.create(paymentMethod);
    }

    @PostMapping("/search")
    public List<PaymentMethod> search(@RequestBody final SearchCriteria criteria){
        return paymentMethodService.search(criteria);
    }
}
