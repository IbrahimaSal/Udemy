package com.myCompany.Repository;

import com.myCompany.Entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private static List<Movie> Movies=new ArrayList<>();
    public void addMovie(Movie movie){
        Movies.add(movie);
        System.out.println("Le film de genre "+movie.getGenre()+ "et dont le titre est: "+movie.getTitle()+" a bien été ajouté");
    }
}
