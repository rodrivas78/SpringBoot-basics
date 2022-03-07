package com.javatpoint.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.javatpoint.model.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
    //New
    Books findByAuthor(String author);
    Books findByBookname(String bookname);
}
