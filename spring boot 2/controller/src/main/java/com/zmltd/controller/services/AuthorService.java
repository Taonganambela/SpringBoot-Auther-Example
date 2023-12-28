package com.zmltd.controller.services;

import org.springframework.stereotype.Service;

import com.zmltd.controller.entities.Author;
import com.zmltd.controller.repo.AuthorRepo;

@Service

public class AuthorService {



    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo){

        this.authorRepo = authorRepo;

    }

    public Author saveAuthor(Author author){

        Author author1 = new Author();
        author1.setFName(author.getFName());
        author1.setLName(author.getLName());
        return authorRepo.save(author1);
    }
}