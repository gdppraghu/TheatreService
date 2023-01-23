package com.theatre.dao;

import com.theatre.domain.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowDAO extends JpaRepository<MovieShow,Integer> {

}
