class Solution {
    public int diagonalPrime(int[][] nums) {

        boolean[] primes = sieve(4000000);

        int leftMax = Integer.MIN_VALUE; int leftTemp;
        int rightMax = Integer.MIN_VALUE; int rightTemp;
        
        for(int i = 0; i < nums.length; i++)
        {
             leftTemp = nums[i][i];
             rightTemp = nums[i][nums.length-i-1];

             if(primes[leftTemp] && leftTemp > leftMax)
             leftMax = leftTemp;

             if(primes[rightTemp] && rightTemp > rightMax)
             rightMax = rightTemp;
        }

        if(leftMax == Integer.MIN_VALUE && rightMax == Integer.MIN_VALUE)
        return 0;

        if(leftMax <= 1 && rightMax <= 1)
        return 0;

        return Math.max(leftMax,rightMax);
    }

    // Implements the Sieve of Eratosthenes algorithm
    public boolean[] sieve(int n) {
        // Creates a boolean array to contain whether or not an int 0-n is prime
        boolean prime[] = new boolean[n + 1];

        // Initialize all elements of the array to true
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        // Loop through all prime numbers up to the square root of n
        for (int p = 2; p * p <= n; p++) {
            // If p is prime, then mark all multiples of p as false 
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }
}