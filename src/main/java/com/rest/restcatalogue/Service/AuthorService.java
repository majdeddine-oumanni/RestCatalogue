package com.rest.restcatalogue.Service;

import com.rest.restcatalogue.DTO.AuthorDTO;
import com.rest.restcatalogue.Mapper.AuthorMapper;
import com.rest.restcatalogue.Model.Author;
import com.rest.restcatalogue.Repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository repository;
    private final AuthorMapper mapper;

    public AuthorService(AuthorRepository repository, AuthorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public AuthorDTO post(AuthorDTO dto){
        Author author = mapper.toEntity(dto);
        Author savedAuthor = repository.save(author);
        return mapper.toDTO(savedAuthor);
    }

    public List<AuthorDTO> getAll(){
        List<Author> authors = repository.findAll();
        return mapper.toDTOs(authors);
    }

    public AuthorDTO update(Long id, AuthorDTO dto){
        Author foundAuthor = repository.findById(id).
                orElseThrow(()-> new RuntimeException("author not found"));

        foundAuthor.setBiography(dto.getBiography());
        foundAuthor.setName(dto.getName());
        return mapper.toDTO(foundAuthor);
    }

    public AuthorDTO getById(Long id){
        Author foundAuthor = repository.findById(id).
                orElseThrow(()-> new RuntimeException("author not found"));
        return mapper.toDTO(foundAuthor);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
