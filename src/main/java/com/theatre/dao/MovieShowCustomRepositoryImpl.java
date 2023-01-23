package com.theatre.dao;

import com.theatre.dto.TheaterMovieShowDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MovieShowCustomRepositoryImpl {

  @PersistenceContext
  private EntityManager entityManager;

  public List<TheaterMovieShowDTO> findShowTypes(String townId, String movieId, String showDate,
      String showType) {
    StringBuilder queryString = new StringBuilder();
    queryString.append(
        " select th.name As TheaterName, th.address as Address,mst.showTime As Timing from theatre th "
            + " inner join movieshow ms inner join movieShowtype mst"
            + " where (ms.TheatreId=th.id and ms.id = mst.showId and ms.StartDate > '");
    queryString.append(showDate.trim()).append("') and th.townId=").append(townId)
        .append(" and  ms.MovieId=")
        .append(movieId).append(" and mst.showType='").append(showType.trim()).append("'");
    Query query = entityManager.createNativeQuery(queryString.toString());
    return query.getResultList();
  }

}
