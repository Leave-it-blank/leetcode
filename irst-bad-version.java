//https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i


public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int left=0,right=n,ans=n;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(isBadVersion(mid))
            {
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
                }
        }
        return ans;
       
    }
}
