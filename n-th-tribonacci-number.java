//https://leetcode.com/problems/n-th-tribonacci-number/description/
class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        if(n==0) return a;
        if(n==1) return b;
        if(n==2) return c;
        for(int i=3;i<=n;i++)
            {
            int sum =a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return c;
    }
}
