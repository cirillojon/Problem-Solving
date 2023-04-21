import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // Part 1 - Push each val into a stack
        // This will allow us to grab the val from each node, in the correct order
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val); 
            l1 = l1.next;
        }
        
        while(l2 != null) {
            s2.push(l2.val); 
            l2 = l2.next;
        }
        
        // Part 2 - Add each character to a StringBuilder object by popping from stack
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        while(!s1.isEmpty()){
            str1.append(s1.pop());
        }
        while(!s2.isEmpty()){
            str2.append(s2.pop());
        }
        
        // Part 3 - Convert the StringBuilder objects to strings, and then BigIntegers
        BigInteger num1 = new BigInteger(str1.toString());
        BigInteger num2 = new BigInteger(str2.toString());

        // Part 4 - Calculate the sum, convert back to string and reverse it
        BigInteger sum = num1.add(num2);
        String strTemp = String.valueOf(sum);
        String str = new StringBuilder(strTemp).reverse().toString();
        

        // Part 5 - Create the Linked list to return
        ListNode res = new ListNode();
        ListNode head = res;

        res.val = Integer.parseInt(String.valueOf(str.charAt(0)));
        for(int i = 1; i < str.length() ; i++){
            ListNode temp = new ListNode();
            temp.val = Integer.parseInt(String.valueOf(str.charAt(i)));
            res.next = temp;
            res = res.next;
            
        }
        // Part 6- Return head reference
        return head;
    }
}