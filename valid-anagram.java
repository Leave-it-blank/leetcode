//https://leetcode.com/problems/valid-anagram/description/

//approach 1
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        if(s.length() == 1 && t.length() == 1 ){
            if(s.charAt(0) != t.charAt(0)){
                return false;
            }else {
                return true;
            }
            
        } 

        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
        
    }
}

//apporach 2

