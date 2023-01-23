package com.theatre.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movieshowtype")
public class MovieShowType {

  /**
   * Represents Movie Show Type indicates Morning, Evening, Night
   */

  public MovieShowType() {

  }

  public MovieShowType(Integer showId, String showTime, ShowType showType) {
    this.showId = showId;
    this.showTime = showTime;
    this.showType = showType;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer Id;

  public ShowType getShowType() {
    return showType;
  }

  public String getShowTime() {
    return showTime;
  }

  public Boolean getActive() {
    return active;
  }

  public Integer getSeats() {
    return seats;
  }

  public void setShowType(ShowType showType) {
    this.showType = showType;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public void setSeats(Integer seats) {
    this.seats = seats;
  }

  @Column(name = "showtype")
  private ShowType showType;

  public Integer getShowId() {
    return showId;
  }

  public void setShowId(Integer showId) {
    this.showId = showId;
  }

  @Column(name = "showid")
  private Integer showId;

  @Column(name = "showtime")
  private String showTime;

  @Column(name = "active")
  private Boolean active;

  @Column(name = "seats")
  private Integer seats;


}
