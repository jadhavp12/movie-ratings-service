package io.javabrains.movieratingsservice.resources;

import io.javabrains.movieratingsservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable ("movieId") String movieId){
        return new Rating(movieId,4);
    }

}
