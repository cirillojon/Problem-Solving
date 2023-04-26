class Solution {
    public int addDigits(int num) {
        Stack<Integer> st = new Stack<Integer>();
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        String val =(sb.reverse().toString());
        for(int i = 0; i < val.length(); i++) 
        st.push(Character.getNumericValue(val.charAt(i)));
        while(!st.isEmpty() && st.size() > 1) {
            num = st.pop() + st.pop();
            for(int i = String.valueOf(num).length()-1; i >= 0; i--)
            st.push(Character.getNumericValue(String.valueOf(num).charAt(i)));
        }
        return num;
    }
}