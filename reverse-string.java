//https://leetcode.com/problems/reverse-string/submissions/931414576/?envType=study-plan&id=algorithm-i

class Solution {
    public void reverseString(char[] s) {

        for(int i=0 , j= s.length - 1 ; i< (s.length/2) && j>0; i++ , j--){
         
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        
    }
}
