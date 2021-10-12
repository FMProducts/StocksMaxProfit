package com.company;

public class Stocks {

    public static void main(String[] args) {
        int result = getMaxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }

    public static int getMaxProfit(int[] prices){

        if (prices.length < 1 || prices.length > 105) {
            return 0;
        }

        int buy = 0; // день покупки
        int sell = 0; // день продажи
        int profit = 0; // тута будет в процессе сохранятся самая большая выгода
        // отсчет нужно начать с воторого элемента
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < 0 || prices[i] > 104) {
                return 0;
            }
            int diff; // локальная разница (выгода)
            if (prices[buy] > prices[i]) buy = i;
            else if(prices[sell] < prices[i]) sell = i;
            if (sell < buy) sell = buy;
            diff = prices[sell] - prices[buy];
            if (diff > profit){
                profit = diff;
            }
        }
        return profit;
    }
}
