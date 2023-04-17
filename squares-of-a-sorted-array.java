//https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        while(i<nums.length){
              nums[i] = nums[i] * nums[i];
              i++;
        }
    
        Arrays.sort(nums);
        return nums;
        
    }
}
