package com.kavindu.netflixclone.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kavindu.netflixclone.entities.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao extends MongoRepository<Movie,String> {
    Optional<List<Movie>> findAllByUserId(String id);
}
