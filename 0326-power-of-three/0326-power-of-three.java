class Solution {
    public boolean isPowerOfThree(int n) {
        int curr=1;
        if(n<=0) return false;
        double ans = Math.log10(n)/Math.log10(3);
        return ans==(int)ans;
    }
}