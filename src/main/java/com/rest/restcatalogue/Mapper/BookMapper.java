package com.rest.restcatalogue.Mapper;

import com.rest.restcatalogue.DTO.BookDTO;
import com.rest.restcatalogue.Model.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookDTO dto);
    BookDTO toDTO(Book book);
    List<BookDTO> toDTOs(List<Book> books);
}
