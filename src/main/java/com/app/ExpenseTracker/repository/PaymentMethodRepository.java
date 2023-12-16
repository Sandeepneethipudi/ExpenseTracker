package com.app.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.app.ExpenseTracker.entity.PaymentMethodEntity;
import com.app.ExpenseTracker.entity.UserEntity;

public interface PaymentMethodRepository extends CrudRepository<PaymentMethodEntity, Integer>,
        JpaSpecificationExecutor<PaymentMethodEntity> {

}
