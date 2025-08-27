class Solution {
    public boolean selfDividingNumbers_helper(int number){
        int copy = number;
        while(number>0){
            int rem = number%10;
            number = number/10;
            if(rem==0) return false;
            if(rem!=0 && copy%rem!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
         ArrayList<Integer> al = new ArrayList<>();
        for(int i=left;i<=right;i++){
           
            if(selfDividingNumbers_helper(i)){
                al.add(i);
            }
        }
        return al;
    }
}