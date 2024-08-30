package com.kavindu.netflixclone.services;

import java.util.List;

import com.kavindu.netflixclone.entities.Movie;
import com.kavindu.netflixclone.exceptions.MovieDetailsNotFoundException;

public interface MovieService {
    List<Movie> fetchMovie(String user_id) throws MovieDetailsNotFoundException;
    Movie addMovie(Movie movie);

    boolean deleteMovie(String id);
}
