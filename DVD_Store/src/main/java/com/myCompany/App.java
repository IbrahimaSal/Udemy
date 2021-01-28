package com.myCompany;

import com.myCompany.Entity.Movie;
import com.myCompany.Service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Bienvenue" );
        Scanner sc=new Scanner(System.in);
        System.out.println( "Veuillez entrer un titre de film" );
        String titre=sc.nextLine();
        System.out.println( "Veuillez entrer le nom du genre de ce film" );
        String genre=sc.nextLine();
        sc.close();
        Movie film=new Movie();
        film.setTitle(titre);
        film.setGenre(genre);
        MovieService service = new MovieService();
        service.registerMovie(film);
        
    }
}
