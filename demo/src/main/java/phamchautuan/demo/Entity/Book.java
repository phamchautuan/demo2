package phamchautuan.demo.Entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name ="title")
    private String title;
    @Column(name ="author")
    private String author;
    @Column(name="price")
    private  Double price;
//    mot voi nhieu
    @ManyToOne
    @JoinColumn(name ="category_id")
    private Category category;
}
