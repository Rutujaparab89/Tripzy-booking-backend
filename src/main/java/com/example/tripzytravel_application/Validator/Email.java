package com.example.tripzytravel_application.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD}) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface Email {
    String message()default "invalid email";
    Class<?>[]groups()default{};
    Class<? extends Payload>[]payload()default{}; 
}
