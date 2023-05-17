

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, mid = -1, end = n;
        while(guess(mid) != 0){
            mid = start + (end - start) / 2;
            if(guess(mid) == -1) end = mid;
            else start = mid + 1;
        }
        return mid;
    }
}