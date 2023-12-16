package com.app.ExpenseTracker.controller;

import java.util.List;

import jakarta.annotation.Resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ExpenseTracker.bean.Category;
import com.app.ExpenseTracker.bean.Expense;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.service.CategoryService;
import com.app.ExpenseTracker.service.ExpenseService;
import com.app.ExpenseTracker.service.UserService;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Resource
    private ExpenseService expenseService;

    @PostMapping("/create")
    public Expense create(@RequestBody Expense expense){
        return expenseService.create(expense);
    }

    @PostMapping("/search")
    public List<Expense> search(@RequestBody final SearchCriteria criteria){
        return expenseService.search(criteria);
    }
}
