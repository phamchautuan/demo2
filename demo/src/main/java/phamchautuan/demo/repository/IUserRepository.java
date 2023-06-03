package phamchautuan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import phamchautuan.demo.Entity.User;

public  interface IUserRepository  extends JpaRepository<User, Long> {
    @Query ("SELECT u FROM User u WHERE u.username =?1")
    User findByUsername(String username);
}
