class Solution {
    public boolean isVowel(char ch){
        if(ch=='A' || ch=='E' ||ch=='U' || ch=='O' || ch=='I' ||ch=='i' || ch=='e' || ch=='a' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        char[] arr = s.toCharArray(); 
        int i=0,j=n-1;
        while(i<j){
            if(!isVowel(s.charAt(i))){
                i++;
            }
            else if(!isVowel(s.charAt(j))){
                j--;
            }
            else{
                 char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
        
    }
}