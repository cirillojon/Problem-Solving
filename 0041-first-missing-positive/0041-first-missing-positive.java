class Solution {
    public int firstMissingPositive(int[] nums) {

        int small = Integer.MAX_VALUE;
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                if(nums[i] < small)
                small = nums[i];

                map.put(nums[i], i);
            }
              
        }

       System.out.println(map);

       if(small > 1)
       return 1;

       int num = 2;
       for(int i = 0; i < nums.length; i++)
       {
           if(map.containsKey(num))
              num++;

              else
              return num;
       }

        return small;

        
    }
}