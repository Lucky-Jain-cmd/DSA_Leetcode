class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        char ch [] = ss.toCharArray();
        String sss = "";
        for(int i=0;i<ch.length;i++){
            // if((ch[i] == ' ') || (ch[i] ==',') || (ch[i]=='!') || (ch[i]==':') || (ch[i]==';')|| (ch[i]=='.') || ch[i]=='?'){
            //  continue;
            // }
            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='0' && ch[i]<='9') ){
            sss += ch[i];}
            else{
                continue;
            }
        }
        String sst = new StringBuilder(sss).reverse().toString();
        if(sst.equals(sss)){
            return true;
        }
        return false;
    }
}