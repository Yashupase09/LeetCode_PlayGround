/*Example 1:

Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].*/


class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int countBreak = 0;
        
        for(int i=0; i<n; i++){
            int next = nums[(i+1)%n];
            if(nums[i] > next){
                countBreak++;
            }

            if(countBreak>1){
                return false;
            }
        }
        return true;
    }
}

