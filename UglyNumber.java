class Solution {
    public boolean isUgly(int n) {
        
        // Ugly numbers are positive numbers whose prime factors are limited to 2, 3, and 5.
        // Step 1: If n is less than or equal to 0, it's not an ugly number.
        if (n <= 0) return false;

        // Step 2: Continuously divide n by 2 as long as it is divisible by 2.
        while (n % 2 == 0) n /= 2;

        // Step 3: Continuously divide n by 3 as long as it is divisible by 3.
        while (n % 3 == 0) n /= 3;

        // Step 4: Continuously divide n by 5 as long as it is divisible by 5.
        while (n % 5 == 0) n /= 5;

        // Step 5: If after removing all factors of 2, 3, and 5, n becomes 1,
        // then it is an ugly number. Otherwise, it has other prime factors.
        return n == 1;

        /*
        Alternative approach using an array of primes:
        if (n <= 0) {
            return false;
        }
        int[] primes = {2, 3, 5};
        for (int p : primes) {
            while (n % p == 0) {
                n = n / p;
            }
        }
        return n == 1;
        */
    }
}
