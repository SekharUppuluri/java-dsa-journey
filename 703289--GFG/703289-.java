class Solution {
    void segregate0and1(int[] arr) {
        // code here
        
        int zeros = 0;
        
        for (int i : arr){
            if (i == 0){
                zeros++;
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            if (i < zeros){
                arr[i] = 0 ;
            }
            else {
                arr[i] = 1;
            }
        }
    }
}
