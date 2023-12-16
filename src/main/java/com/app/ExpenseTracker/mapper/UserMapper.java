package com.app.ExpenseTracker.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.entity.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserEntity mapDtoToEntity(User user);

    @Mapping(target = "password", ignore = true)
    User mapEntityToDto (UserEntity userEntity);


}
