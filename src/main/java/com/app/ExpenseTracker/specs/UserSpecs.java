package com.app.ExpenseTracker.specs;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;


import org.springframework.data.jpa.domain.Specification;

import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.entity.UserEntity;

public final class UserSpecs {

    private UserSpecs() {

    }

    public static Specification<UserEntity> searchByCriteria(final UserSearchCriteria criteria) {
        return new Specification<UserEntity>() {

            @Override
            public Predicate toPredicate(final Root<UserEntity> root, final CriteriaQuery<?> query,
                                         final CriteriaBuilder cb) {

                List<Predicate> predicates = new ArrayList<>();

                if (criteria.getId() != null) {
                    predicates.add(cb.equal(root.get("id"), criteria.getId()));
                }

                if (criteria.getName() != null) {
                    predicates.add(cb.like(root.get("name"), "%" + criteria.getName() + "%"));
                }

                return cb.and(predicates.toArray(new Predicate[] {}));
            }
        };
    }

}