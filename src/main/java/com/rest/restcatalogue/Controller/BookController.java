package com.rest.restcatalogue.Controller;

import com.rest.restcatalogue.DTO.BookDTO;
import com.rest.restcatalogue.Model.Book;
import com.rest.restcatalogue.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }
    @PostMapping("/post")
    public BookDTO post(@RequestBody BookDTO dto){
        return service.post(dto);
    }

    @GetMapping("/getAll")
    public List<BookDTO> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public BookDTO getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public BookDTO update(@PathVariable Long id, @RequestBody BookDTO dto){
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
