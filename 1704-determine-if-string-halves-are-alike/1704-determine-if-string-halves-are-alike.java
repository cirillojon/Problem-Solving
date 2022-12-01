class Solution {
    public boolean halvesAreAlike(String s) {

        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        s = s.toLowerCase();

        String str = s.substring(s.length()/2,s.length());
        s = s.substring(0,s.length()/2);

        int count1 = 0; int count2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(list.contains(s.charAt(i)))
                count1++;

            if(list.contains(str.charAt(i)))
                count2++;
        }
        
        if(count1 == count2)
        return true;

        return false;
        
    }
}