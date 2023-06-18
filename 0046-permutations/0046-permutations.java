class Solution { 
    // Method to get all permutations of the input array nums
    public List<List<Integer>> permute(int[] nums) { 
        // Initialize an empty list to hold all permutations
        List<List<Integer>> res = new ArrayList<>();
        // If input array nums is null or its length is 0, return the empty list
        if(nums.length == 0 || nums == null) return res;
        // Call the helper method with initial parameters. It starts the recursive process of finding all permutations.
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        // Return the list of all permutations 
        return res;
    }

    // Recursive helper method to find all permutations
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> list, boolean[] used){
        
        // If the size of the current list equals the length of the input array, a permutation is found.
       if(list.size() == nums.length){
           res.add(new ArrayList<>(list));
           return;
       }
        
        // Loop through the input array
        for(int i = 0; i < nums.length; i++) {
            // If the current number is already used in this branch of recursion, skip to the next iteration
            if(used[i] == true) continue;
            // Add the current number to the list and mark it as used
            list.add(nums[i]); used[i] = true;
            // Continue the recursion with the updated list and used array
            helper(res, nums, list, used);
            // After the recursion, remove the last number from the list and mark it as unused.
            list.remove(list.size() - 1); used[i] = false;
            // This is backtracking - it undoes the changes for the next branch of recursion.
            
        }
        // End the current recursive call
        return;
    }
}
