package com.app.ExpenseTracker.controller;

import java.util.List;

import jakarta.annotation.Resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ExpenseTracker.bean.Category;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.service.CategoryService;
import com.app.ExpenseTracker.service.UserService;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return categoryService.create(category);
    }

    @PostMapping("/search")
    public List<Category> search(@RequestBody final SearchCriteria criteria){
        return categoryService.search(criteria);
    }
}
