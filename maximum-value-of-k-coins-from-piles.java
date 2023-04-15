//https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/
class Solution {
   private Integer max[][];
    private int getCoins(List<List<Integer>> piles, int currentPile, int coinsLeft){
        if(currentPile<0 || coinsLeft == 0) {return 0;}
        if(max[currentPile][coinsLeft]!=null){
            return max[currentPile][coinsLeft];
        }

        int coinsPickLimit = Math.min(coinsLeft, piles.get(currentPile).size());
        int excludeCurrentPile = getCoins(piles, currentPile-1, coinsLeft);
        
        int includeCurentPile=0;
        for(int j=0, sum=0; j<coinsPickLimit ; j++){
            sum+= piles.get(currentPile).get(j);
            includeCurentPile = Math.max(sum + getCoins(piles, currentPile-1, coinsLeft-(j+1)), includeCurentPile);
        }
        
        int result = Math.max(includeCurentPile, excludeCurrentPile);
        max[currentPile][coinsLeft] = result;
        return result;

    } 

    public int maxValueOfCoins(List<List<Integer>> piles, int K) {
        int n = piles.size();
        max = new Integer[n + 1][K + 1];
        return getCoins(piles, n-1, K);
    }
    
}
