package com.myCompany.Service;

import com.myCompany.Entity.Movie;
import com.myCompany.Repository.MovieRepository;

public class MovieService {
    private MovieRepository movierepository =new MovieRepository();
    public void registerMovie(Movie movie){
        movierepository.addMovie(movie);
    }
}
