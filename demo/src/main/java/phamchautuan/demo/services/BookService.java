package phamchautuan.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phamchautuan.demo.Entity.Book;
import phamchautuan.demo.repository.IBookRepository;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;
     public List<Book> getAllBooks(){

         return bookRepository.findAll();
     }
    public Book getBookById(long id){

         return  bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book){
          bookRepository.save(book);
    }
}
