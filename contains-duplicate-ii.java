//https://leetcode.com/problems/contains-duplicate-ii/submissions/939547314/
//O(N)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value) && i - map.get(value) <= k)
                return true;
            map.put(value, i);
        }
        return false;

    }
}

//O(N^2)

class Solution2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        for(int i=0; i<nums.length; i++){
           for(int L=i +1; L<nums.length; L++){
               if(nums[i] == nums[L]){
                    if(!result){
                        result = (Math.abs((i-L)) <=k); 
                    }
                    else {
                        return result;
                    }
               }
           }
       }  

       return  result;

    }
}
