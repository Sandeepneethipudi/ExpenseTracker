package com.app.ExpenseTracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.app.ExpenseTracker.bean.PaymentMethod;
import com.app.ExpenseTracker.entity.PaymentMethodEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMethodMapper {

    PaymentMethod mapEntityToDto(PaymentMethodEntity paymentMethodEntity);
    PaymentMethodEntity mapDtoToEntity(PaymentMethod paymentMethod);
}
