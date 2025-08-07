package com.rest.restcatalogue.Service;

import com.rest.restcatalogue.DTO.BookDTO;
import com.rest.restcatalogue.Mapper.BookMapper;
import com.rest.restcatalogue.Model.Book;
import com.rest.restcatalogue.Repository.BookRespository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRespository respository;
    private final BookMapper mapper;

    public BookService(BookRespository respository, BookMapper mapper) {
        this.respository = respository;
        this.mapper = mapper;
    }

    public BookDTO post(BookDTO dto){
        Book book = mapper.toEntity(dto);
        Book savedBook = respository.save(book);
        return mapper.toDTO(savedBook);
    }
    
}
