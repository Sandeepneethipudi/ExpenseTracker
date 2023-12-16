package com.app.ExpenseTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

import com.app.ExpenseTracker.bean.Expense;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.entity.ExpenseEntity;
import com.app.ExpenseTracker.entity.UserEntity;
import com.app.ExpenseTracker.mapper.ExpenseMapper;
import com.app.ExpenseTracker.mapper.UserMapper;
import com.app.ExpenseTracker.repository.ExpenseRepository;
import com.app.ExpenseTracker.repository.UserRepository;
import com.app.ExpenseTracker.specs.ExpenseSpecs;
import com.app.ExpenseTracker.specs.UserSpecs;

@Service
public class ExpenseService {

    @Resource
    private ExpenseRepository expenseRepository;

    @Resource
    private ExpenseMapper expenseMapper;

    public Expense create(Expense expense) {
        ExpenseEntity expenseEntity = expenseMapper.mapDtoToEntity(expense);
        return expenseMapper.mapEntityToDto(expenseRepository.save(expenseEntity));
    }
    public List<Expense> search(SearchCriteria criteria) {
        return expenseRepository.findAll(ExpenseSpecs.searchByCriteria(criteria))
                .stream().map(expenseEntity -> expenseMapper.mapEntityToDto(expenseEntity)).toList();
    }

}

