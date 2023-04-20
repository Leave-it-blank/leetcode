//https://leetcode.com/problems/happy-number 

class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7){
            return true;
        }
        if(n<10)
               { return false;}
        String [] arr = String.valueOf(n).split("");
        int d=0 , i=0;
        for(i=0; i< arr.length; i++){
            int p = Integer.valueOf(arr[i]) * Integer.valueOf(arr[i]);
            d = p + d;
        }
        return isHappy(d);       
    }
}
