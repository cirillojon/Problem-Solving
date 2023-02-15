import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    
        ArrayList<Integer> res = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < num.length; i++)
            sb.append(num[i]);
        
        BigInteger val = new BigInteger(sb.toString());
        BigInteger kbig = BigInteger.valueOf(k);
        BigInteger sum = val.add(kbig);
        String str = String.valueOf(sum);
  
       
        for(int i = 0; i < str.length(); i++)
            res.add(Integer.parseInt(str.substring(i,i+1)));
        return res;
    }
}