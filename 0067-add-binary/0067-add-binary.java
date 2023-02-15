import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {

        BigInteger bin1 = new BigInteger(a,2);
        BigInteger bin2 = new BigInteger(b,2);
        BigInteger res = bin1.add(bin2);

        return res.toString(2);
        
    }
}