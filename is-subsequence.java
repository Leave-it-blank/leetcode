//https://leetcode.com/problems/is-subsequence/submissions/932051274/

//approach 1

class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length()<1)
        return true;
        int i =0;
          for(int j = 0; j<t.length(); j++){
              if(s.charAt(i) == t.charAt(j)){
                  i++;
              }
              if(i == s.length()){
                  return true;
              }
          }
      return false;
    }
}

//approach2
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p = t.length(), r = s.length();
       if(r<1){
            return true;
       }
        
        int i =0 , j=0;
       
        while(j < p ){
           
              if(s.charAt(i) == t.charAt(j)){
                  i++;
              }
              if(i == s.length()){
                  return true;
              }
              j++;
          }
      return false;
    }
}
