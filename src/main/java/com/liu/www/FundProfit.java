package com.liu.www;

public interface FundProfit {
//    计算收益率 公式：投资收益率＝投资收益／投资成本×100％
    double calculateRateOfReturn(double investmentIncome, double costOfInvestment);
//    计算七日年化收益率   公式：七日年化收益率 = 七日总收益率（%）/ 7 x 365
//    将7天的总收益率除以7，得到过去7天的平均日收益率，再乘上365天，得到七日年化收益率
    double calculateTheSevenDayAnnualizedRateOfReturn(double investmentIncome, double costOfInvestment);
//    公式：年化利率=[（利息收入 / 本金）/ 存入天数] * 365 ×100%
    double calculateAnnualInterestRate(double investmentIncome, double costOfInvestment,double passTime);


}
