//https://leetcode.com/problems/validate-stack-sequences/submissions/933219762/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       if(pushed.length < popped.length){
           return false; // Stack underflow
       } 
       Stack<Integer> stc = new Stack<Integer>();
       
        int j=0 , i=0;
        for(  i=0; i< pushed.length; i++){

            stc.push(pushed[i]);

            while(!stc.empty() && stc.peek() == popped[j]){
                stc.pop();
                j++;
            }

        }   
        
        return stc.empty();

    }
}
