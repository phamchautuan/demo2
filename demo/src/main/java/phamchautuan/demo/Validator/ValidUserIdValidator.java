package phamchautuan.demo.Validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import phamchautuan.demo.Entity.User;
import phamchautuan.demo.Validator.annotation.ValidUserId;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId , User> {
    @Override
    public boolean isValid(User user , ConstraintValidatorContext context){
        if(user == null)
            return  true;
        return user.getId() !=null;
    }
}
