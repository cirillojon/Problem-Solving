class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
         int max = 0; int res = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);  

                if(map.get(nums[i]) > max)
                {
                   max = map.get(nums[i]);
                   res = nums[i];
                }     
            }
            else
            {
                map.put(nums[i],1);
            }    
        }

        System.out.println(map);

        return res;

    }
}