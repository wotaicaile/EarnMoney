package com.liu.www;

import java.time.LocalDate;

public interface PassTime {
    long calculateTimeDifferenceByChronoUnit(LocalDate start, LocalDate end);

}
