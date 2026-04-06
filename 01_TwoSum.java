// Solution class containing the twoSum method
class Solution {
    // Method to find two indices in the array whose values add up to the target
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Loop through the array
        for(int i = 0; i < nums.length; i++) {
            // Calculate the complement (target - current number)
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if(map.containsKey(complement)) {
                // If found, return the indices of the complement and current number
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[]{};
    }
}

// Main class to test the Solution
public class Main {
    public static void main(String[] args) {
        // Create an instance of Solution
        Solution solution = new Solution();

        // Example input array and target value
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            // If two indices are found, print them and their corresponding values
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            // If no solution is found, print a message
            System.out.println("No solution found.");
        }
    }
}
