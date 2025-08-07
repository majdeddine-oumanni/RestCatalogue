package com.rest.restcatalogue.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {
    private String name;
    private String biography;
    private List<Long> booksIDs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public List<Long> getBooksIDs() {
        return booksIDs;
    }

    public void setBooksIDs(List<Long> booksIDs) {
        this.booksIDs = booksIDs;
    }
}
