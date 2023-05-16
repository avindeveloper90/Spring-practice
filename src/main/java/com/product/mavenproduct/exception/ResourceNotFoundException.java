package com.product.mavenproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionId = 1L;

    public ResourceNotFoundException(String department_id_is_missing) {
        super(department_id_is_missing);
    }
}
