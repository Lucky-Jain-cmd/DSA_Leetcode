class Solution {
    public int countDigits(int num) {
        int c=0;
        int copy=num;
        while(num>0){
            int rem = num%10;
            num = num/10;
            if(copy%rem==0) c++;
        }
        return c;
    }
}