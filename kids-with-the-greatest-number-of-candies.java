//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max= candies[0];
        for(int i=0; i<candies.length; i++){
            if(max< candies[i]){
                max = candies[i];
            }
        }

        List<Boolean> arr = new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                arr.add(true);
            }
            else {
                arr.add(false);
            }
        }
        return arr;
        
    }
}
