class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        // Initialize variables
        int[] res = new int[nums.length];
        int index = 0; 
        int count = 0;
        boolean flag = false; 
        
        // Loop through each element
        for(int i = 0; i < nums.length; i++){
            index = i + 1; // Search index always starts at element directly after
            
            // Loop circularly until either we have searched all numbers (except start) or found larger 
            while(count != nums.length-1 && flag == false){
                if(index == nums.length) index = 0; // Wrap around to start
                
                // If larger number is found, assign it to res[i]
                if(nums[index] > nums[i]){
                    res[i] = nums[index];
                    flag = true;
                } 
                
                // Iterate values
                index++; count++;
            }
            

            if(flag == false) 
                res[i] = -1;
            
            count = 0; 
            flag = false;
        }
        return res;
    }
}