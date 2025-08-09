class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;  // pointer for string a
        int j = b.length() - 1;  // pointer for string b
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // convert '0'/'1' to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);  // bit to append
            carry = sum / 2;     // carry for next iteration
        }

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString(); // reverse because we added from LSB to MSB
    }
}
