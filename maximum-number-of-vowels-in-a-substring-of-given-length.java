//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/

class Solution {
    public int maxVowels(String s, int k) {
      HashSet <Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int max_count = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= k && vowels.contains(s.charAt(i-k))) {
                count--;
            }
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;
    }
}
