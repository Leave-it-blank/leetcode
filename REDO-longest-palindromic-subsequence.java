//https://leetcode.com/problems/longest-palindromic-subsequence/description/


class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int i = len -1, j;

        int [] arr = new int[len];

        for (  i = len - 1; i >= 0; i--) {
            int[] arr2 = new int[len];
            arr2[i] = 1;
            for (  j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    arr2[j] = 2 + arr[j-1];
                } else {
                    arr2[j] = Math.max(arr[j], arr2[j-1]);
                }
            }
            arr = arr2;
        }
        return arr[len-1];
    }
}
