package com.theatre.service;

import com.theatre.dao.MovieShowCustomRepositoryImpl;
import com.theatre.dao.MovieShowDAO;
import com.theatre.dao.MovieShowTypeDAO;
import com.theatre.domain.MovieShow;
import com.theatre.domain.MovieShowType;
import com.theatre.domain.ShowType;
import com.theatre.dto.TheaterMovieShowDTO;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreServiceImpl implements TheatreService {

  @Autowired
  MovieShowDAO movieShowDAO;

  @Autowired
  MovieShowTypeDAO movieShowTypeDAO;

  @Autowired
  MovieShowCustomRepositoryImpl movieShowCustomRepository;

  public Integer addMovieShow(MovieShow movieShow) {
    Integer showId = movieShowDAO.save(movieShow).getId();
    movieShow.getTimings().forEach(time -> {
      ShowType showType = ShowType.showType(LocalTime.parse(time));
      movieShowTypeDAO.save(
          new MovieShowType(movieShow.getId(), time,showType ));
    });
    return showId;
  }

  public List<TheaterMovieShowDTO> listMovieShows(String townId,String movieId, String showDate,String showType){
    return movieShowCustomRepository.findShowTypes(townId,movieId,showDate,showType);
  }

}
