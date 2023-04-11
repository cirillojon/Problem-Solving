class Solution {
    public String removeStars(String s) {

        StringBuilder res = new StringBuilder(); int starCount = 0;

        for(int i = (s.length()-1); i >= 0; i--){
            if(s.charAt(i) == '*'){
                starCount++;
                continue;
            }
            if(s.charAt(i) != '*' && starCount > 0)
                starCount--;

            else
                res.append(s.charAt(i));
        }
        return res.reverse().toString();
    }
}