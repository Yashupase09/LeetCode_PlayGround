class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 
      //OR we can sort this by any sorting algorithm sudch as Bubble Sort, Selectio  sort, Insertion Sort etc.
        return nums[nums.length-k];
    }
}
