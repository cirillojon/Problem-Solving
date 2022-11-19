class Solution {
    public int removeDuplicates(int[] nums) {
        
        
    int counter = 0;
        

    HashMap<Integer, Integer> hash = new HashMap<>();


        for (int i = 0; i < nums.length; i++)
        {
            if (!hash.containsValue(nums[i]))
            {

                hash.put(counter,nums[i]);

                counter++;

            }


        }
        
        
        for(int j = 0; j < counter; j++)
        {
            nums[j] = hash.get(j);
        }
        
        
        System.out.println(counter);
        return counter;
        
   
    }

    
}