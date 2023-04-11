//https://leetcode.com/problems/removing-stars-from-a-string/


class Solution {
    public String removeStars(String s) {

        Stack<Character> stc = new Stack<Character>();

        char [] chr = s.toCharArray();
        int i =0;
        for( i=0; i< chr.length; i++){
            if(chr[i] == '*'){
                if(stc.empty()){
                    return "";
                }
                stc.pop();
            }
            else {
                stc.push(chr[i]);
            }
        }
        s = stc.stream().map(x -> x.toString()).collect(Collectors.joining(""));
        return s;

        
    }
}
