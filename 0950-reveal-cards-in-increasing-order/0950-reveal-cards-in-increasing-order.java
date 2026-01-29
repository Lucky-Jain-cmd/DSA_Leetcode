class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();
       for(int i=deck.length-1;i>=0;i--){
        if(!dq.isEmpty()){
            dq.addFirst(dq.removeLast());
        }
        dq.addFirst(deck[i]);
       }
       int arr[] = new int[n];
       int i=0;
       for(int num : dq){
        arr[i++]=num;
       }
       return arr;
    }
}