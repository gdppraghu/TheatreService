package com.theatre.controller;

import com.theatre.domain.MovieShow;
import com.theatre.dto.TheaterMovieShowDTO;
import com.theatre.service.TheatreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movieshow")
public class TheatreController {

  @Autowired
  TheatreService theatreService;

  @GetMapping
  public Integer sayHello() {
    return 123;
  }

  @ResponseBody
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping(
      consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<MovieShow> addMovieShow(@RequestBody MovieShow movieShow) {
    theatreService
        .addMovieShow(movieShow);
    return ResponseEntity.ok(movieShow);
  }

  @GetMapping("/{townId}/{movieId}/{showDate}/{showType}")
  public List<TheaterMovieShowDTO> listTownTheatre(@PathVariable String townId,
      @PathVariable String movieId, @PathVariable String showDate, @PathVariable String showType) {
    List<TheaterMovieShowDTO> movieShowTypes = theatreService
        .listMovieShows(townId, movieId, showDate, showType);
    return movieShowTypes;
  }



}
