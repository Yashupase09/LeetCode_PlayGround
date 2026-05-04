/*Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.*/

class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int a=0, b=1;
        for(int i=2; i<=n; i++){
            int temp = a+b;
            a = b;
            b= temp;
        }
        return b;
    }
}
