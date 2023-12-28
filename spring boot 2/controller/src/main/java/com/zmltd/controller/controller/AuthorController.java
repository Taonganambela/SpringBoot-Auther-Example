package com.zmltd.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmltd.controller.entities.Author;
import com.zmltd.controller.services.AuthorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Author")

public class AuthorController {



    private final AuthorService authorService;

    public AuthorController (AuthorService authorService){

        this.authorService = authorService;
        
    } 

    @PostMapping("/saveAuthor")
    public Author author(@RequestBody Author author) {
        
        
        return authorService.saveAuthor(author);
    }
    
    

}
