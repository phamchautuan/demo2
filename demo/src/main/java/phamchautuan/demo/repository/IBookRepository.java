package phamchautuan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phamchautuan.demo.Entity.Book;


@Repository
public interface   IBookRepository extends JpaRepository<Book, Long> {
}
