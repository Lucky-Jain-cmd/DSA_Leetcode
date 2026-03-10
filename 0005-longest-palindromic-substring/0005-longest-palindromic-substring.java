class Solution {
    private boolean ispalin(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            String str = s.substring(i,j+1);
            if(ispalin(str) && str.length()>ans.length()){
                ans = str;
            } 
            }
            }
        return ans;
    }
}