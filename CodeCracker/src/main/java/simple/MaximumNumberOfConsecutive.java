package simple;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumberOfConsecutive {
    public static int binaryCounter(int[] nums) {

        int temp = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp += 1;
            } else {
                temp = 0;
            }
            if (result < temp) {
                result = temp;
            }
        }

        return result;
    }

    // Second solution to the problem
    public  int getMaxRepeatingOnes(int[] nums){
        int count = 0;
        int sum = 0;
        for(int num : nums){
            if(num ==0){
                count = 0;
            }else{
                count++;
                sum = Math.max(sum, count);
            }
        }
        return sum;
    }
}
