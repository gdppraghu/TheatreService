package com.theatre.dao;

import com.theatre.domain.MovieShowType;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieShowCustomRepository  {

  public List<MovieShowType> findShowTypes(String townId, String movieId, String showType);

}
