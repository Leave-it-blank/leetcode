 
//https://leetcode.com/problems/isomorphic-strings/ 

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
          HashMap<Character, Character> H3 = new HashMap<Character, Character>();
          int[] marked = new int[256];
          if(s.length() != t.length()){
            return false;
          }

          for(int i=0; i< s.length(); i++){
            if(H3.get(s.charAt(i)) == null)
              {
                H3.put(s.charAt(i), t.charAt(i));

              if(marked[t.charAt(i)] == 1){
                return false;
              }else {
                  marked[t.charAt(i)] = 1;
              }     
              }
            else 
            {
              if(H3.get(s.charAt(i)) != t.charAt(i) )
              {
                return false;
              }
            }
         }  
         return true;
     }
}
