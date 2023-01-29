class Solution {
    public boolean isAnagram(String s, String t) {
        //Convert to Arrays
        char[] arr1 = s.toCharArray(); char[] arr2 = t.toCharArray();
        //Sort each array
        Arrays.sort(arr1); Arrays.sort(arr2);
        //If the words are anagrams, they will be equal after sorting
        if(Arrays.equals(arr1,arr2)) return true; return false;        
    }
}