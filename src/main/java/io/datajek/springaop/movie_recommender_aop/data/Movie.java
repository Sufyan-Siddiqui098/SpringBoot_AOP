package io.datajek.springaop.movie_recommender_aop.data;

import io.datajek.springaop.movie_recommender_aop.aspect.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    @MeasureTime
    public String getMovieDetails() {
        //interacts with the Movie repository
        return "movie details";
    }
}
