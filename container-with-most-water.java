//https://leetcode.com/problems/container-with-most-water/description/

//time complixity of o(n)
class Solution {
    public int maxArea(int[] height) {
        
        // int len = height.length;
        // int max =0 , i, j, x;
        // for( i=0; i< len -1 ; i++){
        //     for( j=i +1; j< len ; j++ ){
        //         if(height[i] < height[j]){
        //             x = height[i] * (j-i);
        //            }
        //            else {
        //              x = (height[j] * (j-i));
        //             }
        //           if(max < x ){
        //             max = x;
        //             }
               
        //     }
        // }

        // return max;

        int len = height.length -1;
        int max=0, left =0, right = len;

        while(right> left){
                int h = Math.min(height[left] , height[right]);
                int w = right-left;
                int area = w*h;
                max = Math.max(area, max);

                if(height[right]> height[left]){
                    left ++;
                }else {
                    right --;
                }
        }

        return max;

    }
}
