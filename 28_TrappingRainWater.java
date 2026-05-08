/*Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9*/

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater =0;

        for(int i=0; i<n; i++){

            int leftMax = 0 , rightMax = 0;
             
            for(int j=0; j<=i; j++){
                leftMax = Math.max(leftMax, height[j]);
            }

            for(int j=i; j<n; j++){
                rightMax = Math.max(rightMax, height[j]);
            }

            totalWater += Math.min(leftMax, rightMax)-height[i];
        }

        return totalWater;
    }
}
