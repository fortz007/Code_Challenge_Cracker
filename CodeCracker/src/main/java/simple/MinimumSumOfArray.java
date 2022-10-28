package simple;

import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumSumOfArray {
    //Task
    //Given an array of integers , Find the minimum sum which is obtained from summing each Two integers product .
    //
    //Notes
    //Array/list will contain positives only .
    //Array/list will always have even size
    //Input >> Output Examples
    //minSum({5,4,2,3}) ==> return (22)
    //Explanation:
    //The minimum sum obtained from summing each two integers product ,  5*2 + 3*4 = 22

    public static int minSum(int[] passed) {
        Arrays.sort(passed);
        int sum =0;
        for (int i = 0; i < passed.length/2; i++)
            sum += passed[i] * passed[passed.length + i -1];

        return sum;
    }
}
