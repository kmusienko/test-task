package com.pfsoft.datescounter.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "weekend_dates")
public class Weekend {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @Column(name = "date")
  private LocalDate date;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate localDate) {
    this.date = localDate;
  }
}
