package edu.bekthedev.spring6WebApp.repositories;

import edu.bekthedev.spring6WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
