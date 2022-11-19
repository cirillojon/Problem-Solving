class Solution {
    public int maximum69Number (int num) {

        int res = num;

        String s = String.valueOf(num);

        
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '6')
            {
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0,i));
                sb.append('9');
                System.out.println(s.substring(i+1,s.length()));
                sb.append(s.substring(i+1,s.length()));
                String ans = sb.toString();
                res = Integer.valueOf(ans);
                break;
            } 
        }
        


        return res;

        
    }
}