package com.liu.www;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PassTimeImpl implements PassTime {


    @Override
    public long calculateTimeDifferenceByChronoUnit(LocalDate start, LocalDate end) {
        long daysDiff = ChronoUnit.DAYS.between(start, end);
        System.out.println("两个时间之间的天数差为：" + daysDiff);
        return daysDiff;
    }

}

