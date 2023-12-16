package com.app.ExpenseTracker.criteria;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSearchCriteria {
    private Long id;
    private String name;
    private String email;
    private String password;
}
