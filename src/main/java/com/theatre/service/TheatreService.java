package com.theatre.service;

import com.theatre.domain.MovieShow;
import com.theatre.domain.MovieShowType;
import com.theatre.dto.TheaterMovieShowDTO;
import java.util.Date;
import java.util.List;


public interface TheatreService {

  public Integer addMovieShow(MovieShow movieShow);

  public List<TheaterMovieShowDTO> listMovieShows(String townId,String movieId,String showDate,String showType);

 // public boolean cancelMovieShow(Integer theatreId, Integer movieId, Date startDate);

}
