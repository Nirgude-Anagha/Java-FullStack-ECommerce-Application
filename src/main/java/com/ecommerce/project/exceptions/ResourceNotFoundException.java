package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    String fieldName;
    String field;
    String resourceName;
    Long fieldId;

    public ResourceNotFoundException(String fieldName, String field, String resourceName) {
        super(String.format("%s not found with %s : %s", resourceName, field, fieldName));
        this.fieldName = fieldName;
        this.field = field;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId) {
        super(String.format("%s not found with %s : %d", resourceName, field, fieldId));
        this.field = field;
        this.resourceName = resourceName;
        this.fieldId = fieldId;
    }
}
