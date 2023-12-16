package com.app.ExpenseTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

import com.app.ExpenseTracker.bean.PaymentMethod;
import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.SearchCriteria;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.entity.PaymentMethodEntity;
import com.app.ExpenseTracker.entity.UserEntity;
import com.app.ExpenseTracker.mapper.PaymentMethodMapper;
import com.app.ExpenseTracker.mapper.UserMapper;
import com.app.ExpenseTracker.repository.PaymentMethodRepository;
import com.app.ExpenseTracker.repository.UserRepository;
import com.app.ExpenseTracker.specs.PaymentMethodSpecs;
import com.app.ExpenseTracker.specs.UserSpecs;

@Service
public class PaymentMethodService {

    @Resource
    private PaymentMethodRepository paymentMethodRepository;

    @Resource
    private PaymentMethodMapper paymentMethodMapper;

    public PaymentMethod create(PaymentMethod paymentMethod) {
        PaymentMethodEntity paymentMethodEntity = paymentMethodMapper.mapDtoToEntity(paymentMethod);
        return paymentMethodMapper.mapEntityToDto(paymentMethodRepository.save(paymentMethodEntity));
    }
    public List<PaymentMethod> search(SearchCriteria criteria) {
        return paymentMethodRepository.findAll(PaymentMethodSpecs.searchByCriteria(criteria))
                .stream().map(paymentMethodEntity -> paymentMethodMapper.mapEntityToDto(paymentMethodEntity)).toList();
    }

}

