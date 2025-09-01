class Solution {
    public boolean isThree(int n) {
    //     int c=0;
    //     for(int i=1;i<=n;i++){
    //         if(n%i==0) c++;
    //     }
    //  return c==3 ? true:false;

    //               More OPTIMIZED
    int sqrt = (int)Math.sqrt(n);
    if(sqrt*sqrt!=n) return false;
    if(sqrt<2) return false;
    for(int i=2;i<=Math.sqrt(sqrt);i++){
        if(sqrt%i==0) return false;
    }
    return true;
    }
}