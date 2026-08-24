public class Solution {
    public int findNumbers(int[] nums) {
        int op = 0;
        for (int i = 0; i < nums.length; i++) {
            int cno = nums[i];
            int count = 0; // reset for each number
            
            while (cno > 0) {
                cno = cno / 10;
                count++;
            }
            
            if (count % 2 == 0) {
                op++;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Sample test case
        int[] testArray = {12, 345, 2, 6, 7896}; 
        int result = sol.findNumbers(testArray);
        
        System.out.println("Total numbers with even digits: " + result);
    }
}