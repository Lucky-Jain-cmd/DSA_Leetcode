class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(i+1);
        }
        int c=0;
        while(al.size()!=1){
            c=(c+(k-1))%al.size();
            al.remove(al.get(c));

        }
    return al.get(0);
    }
}