package otherProblems.recycleRover;

import java.util.*;
import java.io.*;
import java.math.*;

public class recycleRover {

    /**
     * if input is P = 5
     * <p>
     * 1 0 1 1 1
     * <p>
     * output = 3?
     * <p>
     * if input is P = 4
     * <p>
     * 0 1 1 0
     * <p>
     * output 2?
     */


// see certain distance?
// if not left or right, wont move
// if unsure, will continue to check till sure

// Solution?: count all 1s from position goin left and right till 0

/*  Initial solution thoughts

checking which way to go, left or right (the one with more is the direction)
    count the 1s till 0 and return it

    */

    class Outcome {

        /*
         * Implement method/function with name 'solve' below.
         * The function accepts following as parameters.
         *  1. P is of type int.
         *  2. a is of type List<Integer>.
         * return int.
         */

        public static int solve(int P, List<Integer> a) {
            int ARRSIZE = a.size();
            int recycled = 0;

            //checks current position
            if (a.get(P) == 1) recycled++;

            //checks 1s going right
            for (int i = P + 1; i < a.size(); i++) {
                if (a.get(i) == 1) recycled++;
                if (a.get(i) == 0) break;
            }

            //checks ones going left
            for (int i = P - 1; i > 0; i--) {
                if (a.get(i) == 1) recycled++;
                if (a.get(i) == 0) break;
            }

            return recycled;
        }
    }
}