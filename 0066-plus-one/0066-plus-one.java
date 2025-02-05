class Solution {
public int[] plusOne(int[] digits) {
    if (digits == null) return null;

    int length = digits.length - 1;
    int carryOver = 1;


    while (length >= 0) {
        digits[length] += carryOver;
        if (digits[length] == 10) {
            digits[length] = 0;
            carryOver = 1; 
        } else {
            carryOver = 0; 
            break;
        }
        length--; 
    }

    // If carry-over is still 1, that means we need to add a new digit at the front
    if (carryOver == 1) {
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        System.arraycopy(digits, 0, result, 1, digits.length); 
        return result;
    }

    return digits;


        // int length = digits.length - 1;

        // int result = 0;

        // int multiplier = 10;

        // for(int i = length; i > 0; i--){
        //     length = i;
        //     while(length != 0){
        //         multiplier *= multiplier;
        //         length--;
        //     }
        //     result += digits[i] * (i * multiplier);
        //     //reset multiplier
        //     multiplier = 10;
        // }
        // result += digits[0] + 1;

        // return result;
    }
}