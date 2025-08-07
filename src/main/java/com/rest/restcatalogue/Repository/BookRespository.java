package com.rest.restcatalogue.Repository;

import com.rest.restcatalogue.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRespository extends JpaRepository<Book, Long> {
}
