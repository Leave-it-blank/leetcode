//https://leetcode.com/problems/find-pivot-index/submissions/

class Solution {
    public int pivotIndex(int[] nums) {
      return   isPivot(nums, 0);
    }
    public static int isPivot(int [] nums, int Z){
       int sum_1 =0, sum_2 =0; 
       int i; //define it here so its saves memory and helps get u in top 5 % on leetcode
        for(i=0; i < Z; i++)
        {
          sum_1 = sum_1 + nums[i];
        }
        
         for(i= nums.length -1; i> Z  ; i--)
        {
          sum_2 = sum_2 + nums[i];
        }
      // System.out.println(sum_1 + " " + sum_2 + " " + Z);
        if(sum_1 == sum_2 && Z != nums.length ){
          return Z;
        }else {
          if(Z == nums.length){
            return -1;
          }
          return isPivot(nums, Z+1);
        }
         
    }
   
}
