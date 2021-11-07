package com.liu.www;


public class FundProfitImpl implements FundProfit{
    @Override
    public double calculateRateOfReturn(double investmentIncome, double costOfInvestment) {
        return investmentIncome/costOfInvestment;
    }

    @Override
    public double calculateTheSevenDayAnnualizedRateOfReturn(double investmentIncome, double costOfInvestment) {
        return (calculateRateOfReturn(investmentIncome, costOfInvestment) /7 )*365;
    }

    @Override
    public double calculateAnnualInterestRate(double investmentIncome, double costOfInvestment,double passTime) {
        return (investmentIncome/costOfInvestment)/passTime*365;
    }
}
