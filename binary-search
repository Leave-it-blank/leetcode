//https://leetcode.com/problems/binary-search/submissions/931379378/


//approach 1
class Solution {
    public int search(int[] nums, int target) {

        if(nums[0] == target){
            return 0;
        }
        
        for(int i=0, j= nums.length -1; i<=nums.length && j>0;){
            if(nums[i] == target){
                return i;  
            }
            if(nums[j] == target){
                return j;
            }
            i++;
            j--;
        }

        return -1;
    }
}

//appoarch 2

class Solution2 {
    public int search(int[] nums, int target) {

      
        int left =0;
        int right = nums.length -1;
       int mid ;
         
        while(left <= right){
           mid  = left + (right -left)/2;

             if(nums[mid] == target){
                 return mid;
             }
             if(nums[mid]< target){
                 left = mid + 1;
             }
            if(nums[mid]> target){
                right = mid -1;
            }
            
        }

        return -1;
    }
}
