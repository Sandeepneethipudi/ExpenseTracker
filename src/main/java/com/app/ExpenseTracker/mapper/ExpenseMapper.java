package com.app.ExpenseTracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.app.ExpenseTracker.bean.Expense;
import com.app.ExpenseTracker.entity.ExpenseEntity;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExpenseMapper {
    Expense mapEntityToDto(ExpenseEntity expenseEntity);

    ExpenseEntity mapDtoToEntity(Expense expense);
}
