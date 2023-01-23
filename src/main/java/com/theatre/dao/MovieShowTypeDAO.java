package com.theatre.dao;

import com.theatre.domain.MovieShowType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShowTypeDAO extends JpaRepository<MovieShowType,Integer> {

}
