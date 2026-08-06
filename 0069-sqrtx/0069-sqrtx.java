class Solution {
    public int mySqrt(int x) {
        
        int left = 0 ;
        int right = x ;
        int sqrt = 0 ;

        while ( left <= right){

            int mid = left + (right - left) / 2 ;

            long square = (long) mid * mid ;
 
            if ( square == x){
                return mid;
            }
            else if ( square < x){
                sqrt = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return sqrt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna