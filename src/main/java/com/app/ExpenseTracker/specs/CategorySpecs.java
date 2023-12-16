package com.app.ExpenseTracker.specs;



        import java.util.ArrayList;
        import java.util.List;

        import jakarta.persistence.criteria.CriteriaBuilder;
        import jakarta.persistence.criteria.CriteriaQuery;
        import jakarta.persistence.criteria.Predicate;
        import jakarta.persistence.criteria.Root;


        import org.springframework.data.jpa.domain.Specification;

        import com.app.ExpenseTracker.criteria.SearchCriteria;
        import com.app.ExpenseTracker.entity.CategoryEntity;

public final class CategorySpecs {

    private CategorySpecs() {

    }

    public static Specification<CategoryEntity> searchByCriteria(final SearchCriteria criteria) {
        return new Specification<CategoryEntity>() {

            @Override
            public Predicate toPredicate(final Root<CategoryEntity> root, final CriteriaQuery<?> query,
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