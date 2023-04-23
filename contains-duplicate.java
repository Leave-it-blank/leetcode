//https://leetcode.com/problems/contains-duplicate/submissions/938433395/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1){
            return false;
        }
        HashSet<Integer> H = new HashSet<Integer>(nums.length);
        int i=0;
        while(i<nums.length){
                if(H.contains(nums[i])){
                        return true;
                }else {
                     H.add(nums[i]);
                }
                i++;
        }
        return !(H.size() == nums.length);
    }
}
