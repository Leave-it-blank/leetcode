//https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {

        int value =0;
         for(int i=0; i<nums.length; i++){
            value ^= nums[i]; 
        }

        return value;
        
    }
}
