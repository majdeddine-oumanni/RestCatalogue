package com.rest.restcatalogue.Mapper;

import com.rest.restcatalogue.DTO.AuthorDTO;
import com.rest.restcatalogue.Model.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toEntity(AuthorDTO dto);
    AuthorDTO toDTO(Author author);
    List<AuthorDTO> toDTOs(List<Author> authors);
}
