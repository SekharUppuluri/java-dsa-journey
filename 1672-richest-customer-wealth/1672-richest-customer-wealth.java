class Solution {
    public int maximumWealth(int[][] accounts) {

        int personWealth = Integer.MIN_VALUE;
        
        for(int person = 0 ; person < accounts.length; person++ ){
            
            int personSum = 0;
            for(int bank = 0 ; bank < accounts[person].length; bank++ ) {
                personSum += accounts[person][bank];
            }

            if (personSum > personWealth){
                personWealth = personSum;
            }
        }
        return personWealth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna