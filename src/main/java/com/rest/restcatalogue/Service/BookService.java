package com.rest.restcatalogue.Service;

import com.rest.restcatalogue.DTO.BookDTO;
import com.rest.restcatalogue.Mapper.BookMapper;
import com.rest.restcatalogue.Model.Book;
import com.rest.restcatalogue.Repository.BookRespository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public BookDTO update(Long id, BookDTO dto){
        Book foundBook = respository.findById(id).
                orElseThrow(()-> new RuntimeException("book not found"));
        foundBook.setIsbn(dto.getIsbn());
        foundBook.setTitle(dto.getTitle());
        foundBook.setDescription(dto.getDescription());
        Book book = respository.save(foundBook);
        return mapper.toDTO(book);
    }

    public List<BookDTO> getAll(){
        List<Book> books = respository.findAll();
        return mapper.toDTOs(books);
    }

    public BookDTO getById(Long id){
        Book foundBook = respository.findById(id).
                orElseThrow(()-> new RuntimeException("book not found"));
        return mapper.toDTO(foundBook);
    }

    public void delete(Long id){
        respository.deleteById(id);
    }
}
