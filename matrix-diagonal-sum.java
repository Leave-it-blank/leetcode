//https://leetcode.com/problems/matrix-diagonal-sum 

class Solution {
    public int diagonalSum(int[][] mat) {
        int i=mat.length - 1, j=0;
        int length = mat.length;
        int sum =0;

        for(; j< length; j++, i--){
              sum = sum + mat[j][j] + mat[j][i];
        }
        if (length % 2 == 1) { // if n is odd, subtract central element
            sum = sum - mat[length / 2][length / 2];
        }

        return sum;
    }
}
