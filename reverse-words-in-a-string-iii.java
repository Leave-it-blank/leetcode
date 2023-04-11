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

//optimized with string builder
class Solution2 {
    public String reverseWords(String s) {
 

        String [] str=s.split(" ");
        
        StringBuilder rev=new StringBuilder();

        for(String temp:str)
        {
            rev.append(new StringBuilder(temp).reverse().toString());
            rev.append(" ");
        }
        return rev.toString().trim();
        
    }
}

//optimized without string builder

class Solution3 {
    public String reverseWords(String s) {
   
        String [] str=s.split(" ");
        
        s = "";

        for(String temp:str)
        {
            s = s + reverse(temp) + " ";
            
             
        }
        return s.trim();
        
    }

    public String reverse(String s){
        char [] arr = s.toCharArray();
        int i=0;
        for(int j=arr.length-1;j>i;j--){
            char temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;

        }
        s = String.valueOf(arr);
         return s;
    }
}
