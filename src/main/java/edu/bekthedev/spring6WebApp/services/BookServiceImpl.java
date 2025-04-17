package edu.bekthedev.spring6WebApp.services;

import edu.bekthedev.spring6WebApp.domain.Book;
import edu.bekthedev.spring6WebApp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
