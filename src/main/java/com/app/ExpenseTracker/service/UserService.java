package com.app.ExpenseTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;

import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.entity.UserEntity;
import com.app.ExpenseTracker.mapper.UserMapper;
import com.app.ExpenseTracker.repository.UserRepository;
import com.app.ExpenseTracker.specs.UserSpecs;

@Service
public class UserService {

    @Resource
    private  UserRepository userRepository;

    @Resource
    private UserMapper userMapper;

    public User create(User user) {
        UserEntity userEntity = userMapper.mapDtoToEntity(user);
        return userMapper.mapEntityToDto(userRepository.save(userEntity));
    }
    public List<User> search(UserSearchCriteria criteria) {
       return userRepository.findAll(UserSpecs.searchByCriteria(criteria))
               .stream().map(userEntity -> userMapper.mapEntityToDto(userEntity)).toList();
    }

}

