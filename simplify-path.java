//https://leetcode.com/problems/simplify-path/description/

class Solution {
    public String simplifyPath(String path) {
            String [] arr = path.split("/");
            Stack<String> sr = new Stack<String>();
      
            if(arr.length ==0){
                    return "/";
            }
            
            for(int i=0; i<arr.length; i++){
                if(arr[i].equals("") || arr[i].equals(".")){continue;}
                if(arr[i].equals("..")){
                    if(!sr.empty()){
                        sr.pop();
                    } 
                }
                else {
                        sr.push(arr[i]);
                }
            }

            if(sr.empty()){
                    return "/";
            }


       // String stStr = sr.stream().map(s -> s.toString()).collect(Collectors.joining("/"));


     return "/"+ String.join("/", sr);
    }
}
