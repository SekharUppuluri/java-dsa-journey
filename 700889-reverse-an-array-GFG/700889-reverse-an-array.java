class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        int left = 0 , right = arr.length - 1;
        
        while ( left <= right ){
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            
            left++;
            right--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna