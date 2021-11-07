package com.liu.www;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PassTimeNumber implements PassTime {


    @Override
    public long calculateTimeDifferenceByChronoUnit(LocalDate start, LocalDate end) {
        long daysDiff = ChronoUnit.DAYS.between(start, end);
        System.out.println("两个时间之间的天数差为：" + daysDiff);
        return daysDiff;
    }

    public static void main(String[] args) {
        int sYear = 0,sMonth = 0,sDay = 0,eYear = 0,eMonth = 0,eDay = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入起始日期（例如 2000 4 29）：");
            sYear = scanner.nextInt();
            sMonth = scanner.nextInt();
            sDay = scanner.nextInt();
         
        }catch (Exception e){
            System.out.println("格式错误");
        }
        
        try {
            System.out.println("请输入结束日期（例如 2000 4 29）：");
            eYear = scanner.nextInt();
            eMonth = scanner.nextInt();
            eDay = scanner.nextInt();
        }catch (Exception e){
            System.out.println("格式错误");
        }

        try {
            PassTimeNumber passTimeNumber = new PassTimeNumber();
            LocalDate startDate = LocalDate.of(sYear, sMonth, sDay);
            System.out.println("开始时间：" + startDate);

            LocalDate endDate = LocalDate.of(eYear, eMonth, eDay);
            System.out.println("结束时间：" + endDate);
            passTimeNumber.calculateTimeDifferenceByChronoUnit(startDate,endDate);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

