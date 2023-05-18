//https://leetcode.com/problems/climbing-stairs 
class Solution {
 
    public int climbStairs(int M) {
     int dp[] = new int[M+1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= M; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[M];
    }
}
