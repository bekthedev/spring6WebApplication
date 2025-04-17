package edu.bekthedev.spring6WebApp.services;

import edu.bekthedev.spring6WebApp.domain.Author;


public interface AuthorService {
    Iterable<Author> findAll();
}