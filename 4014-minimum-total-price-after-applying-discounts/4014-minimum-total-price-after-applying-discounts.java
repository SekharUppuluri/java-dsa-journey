class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);
        
        double total_price = 0;
        int price_end = prices.length - 1 , discounts_end = discounts.length - 1;
        int i = 0;

        while ( price_end - i >= 0 && discounts_end - i >= 0){
            double discounted_price = (prices[price_end - i] * (100 - discounts[discounts_end - i]))/ (double) 100 ;
            total_price += discounted_price;
            i++;
        }

        for(int j = 0 ; j < prices.length - i ; j++){
            total_price += prices[j];
        }
        return total_price;
    }
}
