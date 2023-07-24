class Solution:
    
    def helper(self, amount, coins, dp):
        
        if amount < 0:
            return float('inf')
        
        if amount == 0:
            return 0
        
        if amount in dp:
            return dp[amount]
        
        min_coins = float('inf')
        
        for c in coins:
            curr_min_coins = self.helper(amount - c, coins, dp) + 1
            
            if curr_min_coins < min_coins:
                min_coins = curr_min_coins
        
        dp[amount] = min_coins
        return dp[amount]
        
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = {}
        res = self.helper(amount, coins, dp) 
        return res if res < float('inf') else -1
        