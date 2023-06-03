package phamchautuan.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phamchautuan.demo.Entity.User;
import phamchautuan.demo.repository.IUserRepository;

import java.util.function.IntUnaryOperator;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public  void save (User user ){
        userRepository.save(user);
    }
}
