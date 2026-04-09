class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);   // largest single element
            right += num;                 // sum of all elements
        }
        
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                ans = mid;
                right = mid - 1;  // try smaller maximum sum
            } else {
                left = mid + 1;   // need larger maximum sum
            }
        }
        return ans;
    }
    
    private boolean canSplit(int[] nums, int k, int mid) {
        int count = 1;   // at least one subarray
        int sum = 0;
        for (int num : nums) {
            if (sum + num > mid) {
                count++;
                sum = num;
                if (count > k) return false;
            } else {
                sum += num;
            }
        }
        return true;
    }
}
