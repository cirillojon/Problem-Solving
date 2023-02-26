import java.math.BigInteger; 
class Solution {
    public int[] plusOne(int[] digits) {
        int val = 0;
        
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < digits.length; i++)
        {
            s.append(digits[i]);
        }

        //System.out.println(s.toString());
        BigInteger num = new BigInteger(s.toString());
        num = num.add(BigInteger.ONE);

        //System.out.println(num.toString());
        int[] res = new int[(String.valueOf(num)).length()];
        //System.out.println(res.length);

        for(int i = 0; i < res.length; i++)
            res[i] = Integer.parseInt(    String.valueOf((String.valueOf(num)).charAt(i))  , 10 ) ;
        
        return res;
    }
}