package BigOFuncExs;

import static randomGenerator.arrays.randArrOfInts;
import static BigOFuncExs.Examples.*;

public class main {
    public static void main(String[] args) {

        int[] intArr = randArrOfInts();

        bigO1Func(intArr);
        logNFunc(200);
        nLogNFunc(180);
        nFunc(intArr);
        nSquaredFunc(intArr);
        nCubedFunc(intArr);
        nExponentialFunc(4);
        nFactorialFunc(3);
    }
}
