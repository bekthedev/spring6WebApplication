package edu.bekthedev.spring6WebApp.repositories;

import edu.bekthedev.spring6WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
