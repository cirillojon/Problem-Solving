class KthLargest {
    int[] temp; int num;
    public KthLargest(int k, int[] nums) {
        temp = nums; num = k;
    }
    
    public int add(int val) {
        int[] arr = new int[temp.length+1];
        for(int i = 0; i < temp.length; i++)
            arr[i] = temp[i]; arr[arr.length-1] = val;
        Arrays.sort(arr); 
        temp = arr;
        return arr[arr.length-num];
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */