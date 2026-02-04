class Solution {
    public double myPow(double x, int n) {
        double ans =1;
        if(n>0){
        for(int i=1;i<=n;i++){
            ans = ans*x;}
        }
        else{
            n = Math.abs(n);
        for(int i=1;i<=n;i++){
            ans = ans*x;}
            ans = 1/ans;
            }
        
        return ans;
    }
}