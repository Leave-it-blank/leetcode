//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> H = new LinkedHashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            H.add(nums[i]);
        }
        int i=0;
        for(int x : H){
            nums[i] = x;
            i++;
        }
        

        return H.size();
        
    }
}
