// Program to find the maximum subarray sum using Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize current_sum with the first element
        int current_sum = nums[0];
        
        // Initialize max_sum with the first element
        int max_sum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update current_sum: either start a new subarray at nums[i] 
            // or extend the previous subarray by adding nums[i]
            current_sum = Math.max(nums[i], current_sum + nums[i]);
            
            // Update max_sum if current_sum is greater
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
        }
        
        // Return the maximum subarray sum found
        return max_sum;
    }

    // Main function to test the program
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Call the function and print the result
        int result = sol.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

/*
------------------ OUTPUT ------------------
Maximum Subarray Sum: 6
--------------------------------------------

Explanation:
The algorithm finds the contiguous subarray with the largest sum.
For the input array {-2, 1, -3, 4, -1, 2, 1, -5, 4}:
- The best subarray is [4, -1, 2, 1].
- Its sum is 4 + (-1) + 2 + 1 = 6.
- No other contiguous subarray has a larger sum.
Hence, the output is 6.
*/
