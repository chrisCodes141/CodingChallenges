class Solution {
    public int myAtoi(String s) {
        if(s == null || s.trim().isEmpty()) return 0;

        s = s.trim();

        boolean negative = false;

        int startIndex = 0;

        //check for sign
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            negative = (s.charAt(0) == '-') ? true : false;
            startIndex++;
        }

        StringBuilder strB = new StringBuilder();

        for(int i = startIndex; i < s.length(); i++){
            char c = s.charAt(i);
            //nondigit encountered
            if(Character.isDigit(c)) strB.append(c);
            else break;
        }

        //if no valid number was found
        if (strB.length() == 0) return 0;

        try{
            int res = Integer.parseInt(strB.toString());
            return negative ? -res : res;
        } catch (NumberFormatException e){
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}