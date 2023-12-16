package com.app.ExpenseTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

import com.app.ExpenseTracker.bean.Category;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.entity.CategoryEntity;
import com.app.ExpenseTracker.entity.UserEntity;
import com.app.ExpenseTracker.mapper.CategoryMapper;
import com.app.ExpenseTracker.mapper.UserMapper;
import com.app.ExpenseTracker.repository.CategoryRepository;
import com.app.ExpenseTracker.repository.UserRepository;
import com.app.ExpenseTracker.specs.CategorySpecs;
import com.app.ExpenseTracker.specs.UserSpecs;

@Service
public class CategoryService {

    @Resource
    private CategoryRepository categoryRepository;

    @Resource
    private CategoryMapper categoryMapper;

    public Category create(Category category) {
        CategoryEntity categoryEntity = categoryMapper.mapDtoToEntity(category);
        return categoryMapper.mapEntityToDto(categoryRepository.save(categoryEntity));
    }
    public List<Category> search(SearchCriteria criteria) {
        return categoryRepository.findAll(CategorySpecs.searchByCriteria(criteria))
                .stream().map(categoryEntity -> categoryMapper.mapEntityToDto(categoryEntity)).toList();
    }

}

