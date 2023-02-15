//incomplete
//https://leetcode.com/problems/isomorphic-strings/ 

import java.util.*;
class Solution {
    public boolean isIsomorphic(String s, String t) {
     int len = s.length();
     int len2 = t.length();   
      HashSet<Character> h1 = new HashSet<Character>();
      HashSet<Character> h2 = new HashSet<Character>();
      HashMap<Character, Character> H3 = new HashMap<Character, Character>();
      HashMap<Character, Character> H4 = new HashMap<Character, Character>();
     if(len != len2){
       return true;
     }
     int L;

      for(L =0; L<len; L++ ){
          h1.add(s.charAt(L));
          h2.add(t.charAt(L));
      }
      if(h1.size() != h2.size()){
        return false;
      }
      char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      h1.addAll(h2);
      List<Character> list = new ArrayList<Character>(h1);
     
      for(L=0; L <h1.size(); L++ ){
        H3.put(list.get(L), alphabet[L]);
      }
     System.out.println(H3 + t+" " + s);
     boolean result = true;;
      for(L=0; L< len; L++){
     System.out.println(s.charAt(L)+ " " +H3.get(s.charAt(L))  +" " +t.charAt(L)+ " " + H3.get(t.charAt(L)));
       if( s.charAt(L) ==  t.charAt(L))
       {   
         if(s.equals(t)){    
            result = true;
          }
        else if( H3.get(s.charAt(L)) == H3.get(t.charAt(L))   ){
          result = false;
         }  
       } 
        
      }

      for(L=0; L<len; L++){
        if(H4.get(s.charAt(L)) == null){
            H4.put(s.charAt(L), t.charAt(L));
        }else {
          if(H4.get(s.charAt(L)) != t.charAt(L)){
              result = false;
          }
        }
        
      }

      for(L=0; L<len; L++){
        
      }
      return result;
    }
}
