//https://leetcode.com/problems/sign-of-the-product-of-an-array 
class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i=0; i < nums.length; i++){
            if(nums[i]<0){
               product = product * (-1);
               continue; 
            }
             if(nums[i]==0){
              return 0;
            }
        }
        return product;
    }
}
