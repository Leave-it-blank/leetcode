//https://leetcode.com/problems/is-subsequence 

class Solution {
    public boolean isSubsequence(String s, String t) {
      int lastIndex = -1;
      boolean fal = true;
       for(int i=0; i< s.length(); i++){
         boolean notContains = true;
         for(int n=0; n< t.length(); n++){
           if(s.charAt(i) == t.charAt(n)){
             notContains = false;
             if(lastIndex < n){
              lastIndex = n;
              fal = true;
              }
              else {
                fal = false;
              } 
            }
       
          
         }
         if(notContains){
           return false;
         }
          if(!fal){
           return false;
         }
       } 
       return true;
    }
}
