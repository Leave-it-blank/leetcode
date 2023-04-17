//https://leetcode.com/problems/sqrtx/submissions/935306282/

class Solution {
    public int mySqrt(int x) {

        int right =x, left=0;

        while(left <=right){
           double mid =(left+right) /2;
            double midsq = mid*mid;
            if(midsq == x){
                return (int) mid;
            }
            if(midsq<x){
                left = (int) mid +1;
                continue;
            }
            if(midsq >x){
                right = (int)mid -1;
            
            }
        }
        
        return (int) right;
    }
}
