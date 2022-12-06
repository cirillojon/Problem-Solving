class Solution {
    public int romanToInt(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'I')
                count += 1;
            if(s.charAt(i) == 'V')
                count += 5;
            if(s.charAt(i) == 'X')
                count += 10;
            if(s.charAt(i) == 'L')
                count += 50;
            if(s.charAt(i) == 'C')
                count += 100;
            if(s.charAt(i) == 'D')
                count += 500;
            if(s.charAt(i) == 'M')
                count += 1000;
            
            
            if(i > 0)
            {
                if(s.charAt(i-1) == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X'))
                count-= 2;
                   
                if(s.charAt(i-1) == 'X' && (s.charAt(i) == 'L' || s.charAt(i) == 'C'))
                count-= 20;
                   
                if(s.charAt(i-1) == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M'))
                count-= 200;
            }
            
        }
                   return count;
        
    }
}