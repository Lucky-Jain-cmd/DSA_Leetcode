class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = 1008;
        while(n>0){
            int lastBit = n%2;
            n = n/2;
            if(prev==1008){
                prev = lastBit;
            }
            else{
                if(lastBit==prev) {
                return false;
            }
            prev = lastBit;
            }
        }
        return true;
    }
}