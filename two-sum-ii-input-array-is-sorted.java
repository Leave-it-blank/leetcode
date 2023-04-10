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
