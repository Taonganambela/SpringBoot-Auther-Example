package com.zmltd.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmltd.controller.entities.Author;

@Repository

public interface AuthorRepo extends JpaRepository<Author,Integer>{


}
