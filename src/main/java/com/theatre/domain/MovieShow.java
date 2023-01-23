package com.theatre.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * Represents particular show of a given theatre. Not the Time of show.
 */
@Entity
@Table(name = "movieshow")
public class MovieShow {

  public Integer getId() {
    return Id;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer Id;

  public Integer getTheatreId() {
    return theatreId;
  }

  public Integer getMovieId() {
    return movieId;
  }

  public Date getStartDate() {
    return startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public Boolean getActive() {
    return active;
  }

  public void setTheatreId(Integer theatreId) {
    this.theatreId = theatreId;
  }

  public void setMovieId(Integer movieId) {
    this.movieId = movieId;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Column(name = "theatreid")
  private Integer theatreId;

  @Column(name = "movieid")
  private Integer movieId;

  @Column(name = "startdate")
  private Date startDate;

  @Column(name = "enddate")
  private Date endDate;

  private Boolean active;

  public List<String> getTimings() {
    return timings;
  }

  public void setTimings(List<String> timings) {
    this.timings = timings;
  }

  @Transient
  private List<String> timings;


}
