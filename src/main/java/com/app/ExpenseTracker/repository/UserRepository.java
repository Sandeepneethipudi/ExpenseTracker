package com.app.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.ExpenseTracker.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer>,
        JpaSpecificationExecutor<UserEntity>, PagingAndSortingRepository<UserEntity, Integer> {
}

