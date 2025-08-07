package com.rest.restcatalogue.Controller;

import com.rest.restcatalogue.DTO.AuthorDTO;
import com.rest.restcatalogue.Model.Author;
import com.rest.restcatalogue.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }
    @PostMapping("/post")
    public AuthorDTO post(@RequestBody AuthorDTO dto){
        return service.post(dto);
    }

    @GetMapping("/getAll")
    public List<AuthorDTO> getAll(){
        return service.getAll();
    }

    @GetMapping("/getAuthor/{id}")
    public AuthorDTO getById(@PathVariable Long id){
        return service.getById(id);
    }

    @DeleteMapping("/get/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("/put/{id}")
    public AuthorDTO update(@PathVariable Long id, @RequestBody AuthorDTO dto){
        return service.update(id, dto);
    }
}
