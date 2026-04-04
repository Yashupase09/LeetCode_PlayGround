class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers: one at the start and one at the end of the array
        int start = 0;
        int end = s.length - 1;

        // Continue swapping characters until the two pointers meet or cross
        while (start <= end) {
            // Temporarily store the character at the start index
            char temp = s[start];

            // Swap the characters at start and end
            s[start] = s[end];
            s[end] = temp;

            // Move the start pointer forward and the end pointer backward
            start++;
            end--;
        }
        // At this point, the array 's' has been reversed in place
    }
}
