package com.theatre.dto;

public class TheaterMovieShowDTO {

  public String getTheaterName() {
    return theaterName;
  }

  public void setTheaterName(String theaterName) {
    this.theaterName = theaterName;
  }

  public String getTheatreAddress() {
    return theatreAddress;
  }

  public void setTheatreAddress(String theatreAddress) {
    this.theatreAddress = theatreAddress;
  }

  public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  private String theaterName;

  private String theatreAddress;

  private String showTime;



}
