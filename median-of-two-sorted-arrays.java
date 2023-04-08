#https://leetcode.com/problems/median-of-two-sorted-arrays/description/

import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] arr = new int[nums1.length+nums2.length];
        int i=0;
        for( i=0; i< nums1.length; i++){
            arr[i] = nums1[i];
        }
        int j=i;
        for( i=0; i< nums2.length; i++){
            arr[j] =  nums2[i];
            j++;
        }
        Arrays.sort(arr);
        int len = arr.length;
        
        if(len %2 ==0){
           return (double) ((double)(arr[(len/2)-1] + arr[len/2]) /2);
        }
        return arr[(len)/2];

        
    }
}
