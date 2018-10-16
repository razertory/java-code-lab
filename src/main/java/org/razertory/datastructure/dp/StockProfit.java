package org.razertory.datastructure.dp;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StockProfit {

    int maxProfit(int[] moneys) {
        if(null == moneys || moneys.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int money = moneys[0];
        for (int i = 1; i < moneys.length; i++) {
            money = (money <= moneys[i]) ? money : moneys[i];
            maxProfit = (maxProfit >= (moneys[i] - money)) ? maxProfit : (moneys[i] - money);
        }
        return maxProfit;
    }
}
