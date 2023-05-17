class Solution {
    public int pairSum(ListNode head) {
        int arr[] = new int[100000]; int index = 0; int res = Integer.MIN_VALUE;
        while(head != null){arr[index++] = head.val; head = head.next;}
        for(int i = 0 ; i < index/2; i++) if(arr[i] + arr[index-i-1] > res) 
        res = arr[i] + arr[index-i-1]; return res; 
    }
}