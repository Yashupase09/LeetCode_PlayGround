//Problem numbber: 3658. GCD of Odd and Even Sums
// Example 1:

// Input: n = 4

// Output: 4

// Explanation:

// Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
// Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20
// Hence, GCD(sumOdd, sumEven) = GCD(16, 20) = 4.

class Solution {
    public int gcdOfOddEvenSums(int n) {
       int oddSum = n*n;
       int evenSum = n*(n+1);

       while(oddSum >0 && evenSum >0){
        if(oddSum > evenSum){
            oddSum = oddSum % evenSum;
        }else{
            evenSum = evenSum % oddSum;
        }
       }
       if(oddSum == 0) return evenSum;

       return oddSum;
    }
}
