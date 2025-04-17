package edu.bekthedev.spring6WebApp.repositories;


import edu.bekthedev.spring6WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

