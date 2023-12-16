
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
        import com.app.ExpenseTracker.entity.ExpenseEntity;

public final class ExpenseSpecs {

    private ExpenseSpecs() {

    }

    public static Specification<ExpenseEntity> searchByCriteria(final SearchCriteria criteria) {
        return new Specification<ExpenseEntity>() {

            @Override
            public Predicate toPredicate(final Root<ExpenseEntity> root, final CriteriaQuery<?> query,
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