class Solution {

    private  int reverseRecursively(int x, int reversed){
        if(x == 0) return reversed;
        int remainder = x % 10;

        //int overflow check
        if (reversed > (Integer.MAX_VALUE - remainder) / 10) {
           return 0;  
        }

        reversed = reversed * 10 + remainder;
        return reverseRecursively(x / 10, reversed);

    }

    public  int reverse(int x) {
        int reversedResult = 0;
        boolean negative = false;

        if(x < 0) negative = true;

        x = Math.abs(x);

        if(negative) return -reverseRecursively(x, 0);;
        return reverseRecursively(x, 0);
    }
}