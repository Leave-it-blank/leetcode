//https://leetcode.com/problems/remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        int index_count = 0;
        int i=0;

        while(i < nums.length){
              if(nums[i++] != val){
                  nums[index_count++] = nums[i-1];
              }
        }

        return index_count;
    } 
    
}
