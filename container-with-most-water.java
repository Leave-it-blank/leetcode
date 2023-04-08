//https://leetcode.com/problems/container-with-most-water/description/

//need to fix time complixity

class Solution {
    public int maxArea(int[] height) {
        
        int len = height.length;
        int max =0 , i, j, x;
        for( i=0; i< len -1 ; i++){
            for( j=i +1; j< len; j++ ){
                if(height[i] < height[j]){
                    x = height[i] * (j-i);
                   }
                   else {
                     x = (height[j] * (j-i));
                    }
                  if(max < x ){
                    max = x;
                    }
               
            }
        }

        return max;

    }
}
