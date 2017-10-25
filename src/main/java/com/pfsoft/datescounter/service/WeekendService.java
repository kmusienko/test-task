package com.pfsoft.datescounter.service;

import com.pfsoft.datescounter.entity.DatePair;

public interface WeekendService {

  int getAmountOfWeekends(DatePair datePair);
}
