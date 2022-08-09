package com.example.demo.util;

import org.springframework.data.jpa.domain.Specification;

public interface SpecificationUtils {

    public static final String STATUS = "status";
    public static final int ACTIVE = 1;

    static <T> Specification<T> appendActiveStatus(Specification<T> specs) {
        return specs == null
                ? (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(STATUS), ACTIVE)
                : specs.and((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get(STATUS), ACTIVE));
    }
}
