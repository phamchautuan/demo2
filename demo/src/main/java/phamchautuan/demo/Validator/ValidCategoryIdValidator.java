package phamchautuan.demo.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import phamchautuan.demo.Entity.Category;
import phamchautuan.demo.Validator.annotation.ValidCategoryId;

public class ValidCategoryIdValidator  implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public  boolean isValid(Category category , ConstraintValidatorContext context){
        return  category != null && category.getId() !=null;

    }
}
