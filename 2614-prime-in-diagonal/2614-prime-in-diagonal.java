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

// This method implements the Sieve of Eratosthenes algorithm to find all prime numbers up to a given integer n.
public boolean[] sieve(int n) {
    // Create a boolean array of size n+1 to represent whether each integer from 0 to n is prime.
    boolean prime[] = new boolean[n + 1];

    // Initialize all elements of the array to true, since initially we assume all integers are prime.
    for (int i = 0; i <= n; i++) {
        prime[i] = true;
    }

    // Loop through all prime numbers up to the square root of n.
    for (int p = 2; p * p <= n; p++) {
        // If p is prime (i.e., prime[p] is true), then mark all multiples of p as composite (i.e., prime[p*i] = false)
        if (prime[p] == true) {
            for (int i = p * p; i <= n; i += p) {
                prime[i] = false;
            }
        }
    }

    // Return the boolean array, where each element represents whether the corresponding integer is prime.
    return prime;
}

}