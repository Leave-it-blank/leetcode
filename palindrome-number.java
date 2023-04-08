//#https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
           int [] arr = {0,x};
           while (x>0){
               arr[0] = arr[0]*10 + x%10;
               x = x/10;
           }
           return arr[0]== arr[1];
    }
}
