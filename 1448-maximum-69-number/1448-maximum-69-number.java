class Solution {
    public int maximum69Number (int num) {

// Convert to String
String s = Integer.toString(num);

// Create an int array with length equal to number of characters
int[] arr = new int[s.length()];

// Iterate and convert each character to integer
for (int i = 0; i < s.length(); i++) {
    arr[i] = s.charAt(i)-'0';
    
}
for(int i=0;i<arr.length;i++){
    if(arr[i]==6){
        arr[i]=9;
        break;
    }
}
int number = 0;
for (int digit : arr) {
    number = number * 10 + digit;
}
return number;

    }
}