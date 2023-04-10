//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/


//not optimized
class Solution {
    public String reverseWords(String s) {
        String n = "";
      for(int i = s.length() -1; i>=0 ; i--){
            n = n + s.charAt(i);
      }
       String [] arr = n.split(" ");
       String T = "";

       for(int i=arr.length - 1; i>=0; i--){
         T = T + arr[i] + " ";
        //System.out.print(arr[i] + " , ");
       }
    
        return T.trim();
        
    }
}
