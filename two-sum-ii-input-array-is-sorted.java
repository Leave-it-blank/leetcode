//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i


//apporach 1 o(n^2)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       for(int i=0; i < numbers.length; i++){
           for(int k=i +1; k< numbers.length; k++){
               if(numbers[i] + numbers[k] == target){
                  
                   return new int[] {i +1, k +1};
               }
           }
       }
       return new int[] {0, 0};
    }       
}


//apporach 2 

class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int left , right;
        int [] arr = new int[2];
     
       for( left = 0,  right = numbers.length -1; left< numbers.length && right>0; ){
            if(numbers[left] + numbers[right] == target){
                   arr[0] = left + 1;
                   arr[1] = right + 1;
                   break;
            }
            if(numbers[left] + numbers[right] > target){
             right--;
             continue;
            }
             if(numbers[left] + numbers[right] < target){
             left++;
             continue;
            }
          
       }

       return arr;
    }       
}
