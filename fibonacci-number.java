//https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int a = 1;
        int result = 1;
        for(int i = 1; i<n; i++){
            int temp = a;
            a = result + a;
            result = temp;
        }

        return result;   
    }
}
