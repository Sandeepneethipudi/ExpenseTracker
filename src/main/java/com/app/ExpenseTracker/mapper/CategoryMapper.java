package com.app.ExpenseTracker.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.app.ExpenseTracker.bean.Category;
import com.app.ExpenseTracker.entity.CategoryEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    Category mapEntityToDto(CategoryEntity categoryEntity);

    CategoryEntity mapDtoToEntity(Category category);
}
