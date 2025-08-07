package com.rest.restcatalogue.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String title;
    private String isbn;
    private Long authorId;
}
