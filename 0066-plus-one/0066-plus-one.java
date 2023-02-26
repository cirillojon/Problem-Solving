import java.math.BigInteger; // Import the BigInteger class from the Java math library

class Solution {
    public int[] plusOne(int[] digits) { // Define a method called plusOne that takes an array of integers as input and returns an array of integers as output
        int val = 0; // Initialize an integer variable called val with a value of 0

        StringBuilder s = new StringBuilder(); // Create a new StringBuilder object called s

        for(int i = 0; i < digits.length; i++) // Loop through each digit in the input array
        {
            s.append(digits[i]); // Append the current digit to the StringBuilder object s
        }


        BigInteger num = new BigInteger(s.toString()); // Create a new BigInteger object called num by parsing the contents of the StringBuilder object s as a string
        num = num.add(BigInteger.ONE); // Add one to the BigInteger object num


        int[] res = new int[(String.valueOf(num)).length()]; // Create a new integer array called res with a length equal to the length of the string representation of the BigInteger object num


        for(int i = 0; i < res.length; i++) // Loop through each element of the res array
            res[i] = Integer.parseInt(    String.valueOf((String.valueOf(num)).charAt(i))  , 10 ) ; // Parse the character at the current index of the string representation of the BigInteger object num as an integer and store it in the current element of the res array
        
        return res; // Return the res array
    }
}
