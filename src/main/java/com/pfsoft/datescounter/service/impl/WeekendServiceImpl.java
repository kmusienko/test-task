package com.pfsoft.datescounter.service.impl;

import com.pfsoft.datescounter.entity.DatePair;
import com.pfsoft.datescounter.entity.Weekend;
import com.pfsoft.datescounter.repository.WeekendRepository;
import com.pfsoft.datescounter.service.WeekendService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeekendServiceImpl implements WeekendService {

  private WeekendRepository weekendRepository;

  @Autowired
  public void setWeekendRepository(WeekendRepository weekendRepository) {
    this.weekendRepository = weekendRepository;
  }

  /**
   * Gets a number of weekends depending on two input dates and stored dates in the database.
   *
   * @param datePair object consists of first and second date.
   * @return number of holidays between two dates.
   */
  @Override
  public int getAmountOfWeekends(DatePair datePair) {
    int weekendAmount = 0;
    if (datePair.getFirstDate().compareTo(datePair.getSecondDate()) < 0) {
      LocalDate localDate = datePair.getFirstDate();
      List<Weekend> weekends = weekendRepository.findAll();
      while (localDate.compareTo(datePair.getSecondDate()) <= 0) {
        if (localDate.getDayOfWeek().getValue() == 6 || localDate.getDayOfWeek().getValue() == 7) {
          weekendAmount++;
        } else {
          for (Weekend weekend : weekends) {
            if (localDate.isEqual(weekend.getDate())) {
              weekendAmount++;
            }
          }
        }
        localDate = localDate.plusDays(1);
      }
    }
    return weekendAmount;
  }
}
