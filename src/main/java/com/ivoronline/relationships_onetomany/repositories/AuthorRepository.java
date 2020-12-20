package com.ivoronline.relationships_onetomany.repositories;

import com.ivoronline.relationships_onetomany.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
