package phamchautuan.demo.Entity;
import phamchautuan.demo.Validator.annotation.ValidUsername;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import phamchautuan.demo.Entity.Book;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
@Data
@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name ="username" , length = 50 , nullable = false , unique = true)
    @NotBlank(message ="username is requied ")
    @Size(max = 50 , message ="username must be less than 50 characters")
    @ValidUsername
    private String username;
    @Column(name ="password" , length = 250 , nullable = false)
    @NotBlank(message = " password is requied")
    private String password;
    @Column(name ="email" , length = 50)
    @Size(max = 50 , message ="username must be less than 50 characters")
    @Email(message ="Email should be valid")
    private String email;

    @Column(name ="name" , length = 50 , nullable = false)
    @Size(max = 50 , message ="username must be less than 50 characters")
    @NotBlank(message = " password is requied")
    private String name;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
