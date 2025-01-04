package otherProblems.recycleRover;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        List nums = new ArrayList();

        nums.add(0);
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(0);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(0);
        nums.add(0);
        nums.add(1);
        nums.add(0);
        nums.add(1);
        nums.add(1);

        System.out.println(nums);
        System.out.println(recycleRover.Outcome.solve(11,nums));


    }
}