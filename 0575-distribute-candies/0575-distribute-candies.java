class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> hs = new HashSet<>();
        int maxCandy=n/2;
        for(int i=0;i<n;i++){
            hs.add(candyType[i]);
        }
        if(hs.size()<=maxCandy){
            return hs.size();
        }
        return maxCandy;
    }
}