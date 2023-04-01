package com.pokemo.studi.constraint;

import com.pokemo.studi.constraint.validator.CapaciteConstraintValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy ={CapaciteConstraintValidator.class})
public @interface CapaciteConstraint {
    String message() default "Le libelle est vide ou null";

    Class<?> [] groups() default {};
    Class <? extends Payload> [] payload() default {};
}
