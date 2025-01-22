class Solution {
    public int myAtoi(String s) {
        int sum = 0, sign = 1, i = 0, n = s.length();
        
        // Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign if exists
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Convert numerical digits (including leading zeros)
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            // Check for overflow before adding digit
            if (sum > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            sum = sum * 10 + digit;
            i++;
        }

        return sign * sum;

        //** DIFFERENT APPROACH */

        // if(s == null || s.trim().isEmpty()) return 0;
        // s = s.trim();

        // boolean negative = false;
        // int startIndex = 0;
        // StringBuilder strB = new StringBuilder();

        // //check for sign, skip first char if so
        // if(s.charAt(0) == '-' || s.charAt(0) == '+'){
        //     negative = (s.charAt(0) == '-') ? true : false;
        //     startIndex++;
        // }

        // for(int i = startIndex; i < s.length(); i++){
        //     char c = s.charAt(i);
            
        //     if(Character.isDigit(c)) strB.append(c);
        //     //nondigit encountered
        //     else break;
        // }

        // //if no valid number was found
        // if (strB.length() == 0) return 0;

        // try{
        //     int res = Integer.parseInt(strB.toString());
        //     return negative ? -res : res;
        // } catch (NumberFormatException e){
        //     return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        // }
    }
}