class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0 ) {
                    return ans;
                }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right){

            // first row (left -> right)
            for(int col = left ; col <= right ; col++){
                ans.add(matrix[top][col]);
            }
            top++;
            

            // last col (top -> bottom)
            for(int row = top ; row <= bottom ; row++){
                ans.add(matrix[row][right]);
            }
            right--;

            // last row (right -> left)
            if (top <= bottom) {

                for(int col = right ; col >= left ; col--){
                    ans.add(matrix[bottom][col]);
                }

                bottom--;
            }

            // first col (bottom -> top)
            if (left <= right){

                for(int row = bottom ; row >= top ; row--){
                    ans.add(matrix[row][left]);
                }
                left++;
            }
        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna