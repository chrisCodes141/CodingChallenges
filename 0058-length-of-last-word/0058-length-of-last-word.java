class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim().toString();
        int length = 0;

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' ') break;
            length++;
        }

        return length;
    }
}