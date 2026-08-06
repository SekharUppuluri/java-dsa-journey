class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> check = new ArrayList<>();
        
        int max = candies[0];

        for(int i = 0 ; i < candies.length ; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0 ; i < candies.length ; i++){
            int count = candies[i] + extraCandies;
            if ( count < max){
                check.add(false);
            }
            else{
                check.add(true);
            }
        }
        return check;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna