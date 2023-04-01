package com.pokemo.studi.constraint.validator;

import com.pokemo.studi.constraint.CapaciteConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.Null;
import org.springframework.util.StringUtils;

public class CapaciteConstraintValidator implements ConstraintValidator<CapaciteConstraint, String> {
    @Override
    public boolean isValid(String libelle, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasLength(libelle);
    }

    @Override
    public void initialize(CapaciteConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
