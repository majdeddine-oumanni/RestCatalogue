package com.rest.restcatalogue.Repository;

import com.rest.restcatalogue.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
