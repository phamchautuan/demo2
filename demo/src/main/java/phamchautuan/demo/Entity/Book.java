package phamchautuan.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import phamchautuan.demo.Validator.annotation.ValidCategoryId;
import phamchautuan.demo.Validator.annotation.ValidUserId;
import phamchautuan.demo.Validator.annotation.ValidUsername;

@Data
@Entity
@Table(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name ="title" )
    @NotEmpty(message ="title must not be  requied ")
    @Size(max = 50 ,min =1, message ="title must be less than 50 characters")
    private String title;

    @Column(name ="author")
    private String author;

    @Column(name="price")
    @NotNull(message = "price is required")
    @Positive(message = "price must be greater than 0")
    private  Double price;
//    mot voi nhieu
    @ManyToOne
    @JoinColumn(name ="category_id" , referencedColumnName = "id")
    @ValidCategoryId
    private Category category;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private  User user;
}
