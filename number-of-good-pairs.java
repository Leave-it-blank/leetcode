//https://leetcode.com/problems/number-of-good-pairs/description/

//approach 1

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int result = 0;

        for(int i=0; i< nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }

        return result;
        
    }
}
// 2 optimized for memory
class Solution2 {
    public int numIdenticalPairs(int[] nums) {

        int result = 0;
        int i =0, j =i+1;
        int len = nums.length;

        for(  i=0; i< len; i++){
            for(  j = i+1; j<len; j++){
                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }
        
        

        return result;
        
    }
}
