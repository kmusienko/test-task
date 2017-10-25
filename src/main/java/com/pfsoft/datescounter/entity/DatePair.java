package com.pfsoft.datescounter.entity;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class DatePair {

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate firstDate;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate secondDate;

  public LocalDate getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(LocalDate firstDate) {
    this.firstDate = firstDate;
  }

  public LocalDate getSecondDate() {
    return secondDate;
  }

  public void setSecondDate(LocalDate secondDate) {
    this.secondDate = secondDate;
  }
}
