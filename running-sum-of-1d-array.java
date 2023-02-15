//https://leetcode.com/problems/running-sum-of-1d-array 

class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        ArrayList<Integer> sum  = new ArrayList<Integer>();
        int constant = 0;
        for(int i =0; i < nums.length; i++)
        {
             sum.add(nums[i] + constant );
             constant = constant + nums[i];
        }
       int[] values = new int[sum.size()];
        Arrays.setAll(values, sum::get);
      
        return values;
    }
}
