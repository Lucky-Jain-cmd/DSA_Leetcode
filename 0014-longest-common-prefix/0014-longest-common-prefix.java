class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String lowest = strs[0];
        String highest = strs[strs.length-1];
        for(int i=0;i<Math.min(lowest.length(),highest.length());i++){
            if(lowest.charAt(i) != highest.charAt(i)){
                return sb.toString();
            }
            else
                sb.append(lowest.charAt(i));
            
        }
        return sb.toString();
    }
}