//https://leetcode.com/problems/reverse-integer 

class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x<0){
            flag = true;
            x = -x;
        }
        int y =0;
        while(x != 0){
            int a = x % 10;
            if (y > (Integer.MAX_VALUE-a)/10) {return 0;}
            y=y*10+a;  
            x=x/10; 
        }

        return flag ? - y : y;

    }
}
