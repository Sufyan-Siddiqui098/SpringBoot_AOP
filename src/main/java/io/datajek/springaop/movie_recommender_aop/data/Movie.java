package io.datajek.springaop.movie_recommender_aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    public String getMovieDetails() {
        //interacts with the Movie repository
        return "movie details";
    }
}
