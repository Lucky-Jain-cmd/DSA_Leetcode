class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
       long curr =1;
       while(curr<n){
        curr = curr*4;
       if(curr==n)
                return true;
            }
        
        return false;
    }
}