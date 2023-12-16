package com.app.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.app.ExpenseTracker.entity.CategoryEntity;
import com.app.ExpenseTracker.entity.UserEntity;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Integer>,
        JpaSpecificationExecutor<CategoryEntity> {

}

