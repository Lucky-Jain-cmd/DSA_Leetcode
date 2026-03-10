class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<s.length();j++){
            if(hm.get(s.charAt(j))==1) return j;
        }
        return -1;
    }
}