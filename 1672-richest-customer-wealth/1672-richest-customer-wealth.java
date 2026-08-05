class Solution {
    public int maximumWealth(int[][] accounts) {

        int personWealth = Integer.MIN_VALUE;

        // going through every person data
        for(int person = 0 ; person < accounts.length; person++ ){

            // sum for person bank accounts (col)
            int personSum = 0;
            for(int bank = 0 ; bank < accounts[person].length; bank++ ) {
                personSum += accounts[person][bank];
            }

            // comparing highest number of bank accounts of a person
            if (personSum > personWealth){
                personWealth = personSum;
            }
        }
        return personWealth;
    }
}
