class Solution { //We create a char arr to remove each occurence of c, so that the 
    public int[] shortestToChar(String s, char c) { //indexOf function returns next c
        int[] answer = new int[s.length()]; char[] arr = s.toCharArray();
        int distance = s.indexOf(c); int recentCIndex = distance; //recentCIndex -> 
        boolean reachedLastC = false;      //stores the index of the previous c found
        for(int i = 0; i < s.length(); i++){
            if(distance == 0){ //If we are at an occurence of c
                recentCIndex = i; answer[i] = 0; arr[i] = 0; //Removes c from arr
                if(String.valueOf(arr).indexOf(c) == -1){ //If no more c in arr
                        reachedLastC = true;                  
                        distance = 1;
                        continue;
                } //Stores the distance from the current index to the next c
                distance = String.valueOf(arr).indexOf(c) - i - 1; 
                continue; 
            }
            if(reachedLastC == true){ //If there are no more occurences of c,
                answer[i] = distance; //The distance will just slowly grow by 1
                distance++;           //Until we reach the end of the string
                continue; 
            } //If the previous c is closer than the next c
            if((Math.abs(i - recentCIndex)) < distance)
            answer[i] = (Math.abs(i - recentCIndex));
            else //If the next c is closer than the previous c
            answer[i] = distance;
            distance--; //We get 1 step closer to next c after each iteration
        }
        return answer; 
    }
}