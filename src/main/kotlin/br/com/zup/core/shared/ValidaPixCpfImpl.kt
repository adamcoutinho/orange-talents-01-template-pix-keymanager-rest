package br.com.zup.core.shared

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import javax.validation.Validation

class ValidaPixCpfImpl:ConstraintValidator<ValidPixCpf,String> {

    override fun isValid(value: String?,annotationMetadata: AnnotationValue<ValidPixCpf>, context: ConstraintValidatorContext,): Boolean {

        if(value!!.isEmpty()){
            return false
        }

        val validations  = Validation
            .buildDefaultValidatorFactory()
            .getValidator()
            .validate(value)

        return validations.isNotEmpty()
    }


}