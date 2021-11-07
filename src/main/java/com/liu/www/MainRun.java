package com.liu.www;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        int sYear = 0,sMonth = 0,sDay = 0,eYear = 0,eMonth = 0,eDay = 0;
        long passTime = 0;
        double investmentIncome = 0,profit = 0;
        FundProfitImpl fundProfit = new FundProfitImpl();
      
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入本金：");
            investmentIncome = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("格式错误");
        }


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
            System.out.println("请输入收益：");
            profit = scanner.nextDouble();
        }catch (Exception e){
            System.out.println("格式错误");
        }
        try {
            PassTimeImpl passTimeNumber = new PassTimeImpl();
            LocalDate startDate = LocalDate.of(sYear, sMonth, sDay);
            System.out.println("开始时间：" + startDate);

            LocalDate endDate = LocalDate.of(eYear, eMonth, eDay);
            System.out.println("结束时间：" + endDate);
            passTime = passTimeNumber.calculateTimeDifferenceByChronoUnit(startDate,endDate);
        }catch (Exception e){
            System.out.println("格式错误");
        }
        
        double AnnualInterestRate = fundProfit.calculateAnnualInterestRate(profit, investmentIncome,passTime);
        System.out.println("预计年化率为："+new DecimalFormat("#.00").format(AnnualInterestRate*100)+"%");
        System.out.println("预计年盈利为："+new DecimalFormat("#.00").format(AnnualInterestRate*investmentIncome));
    }
}
