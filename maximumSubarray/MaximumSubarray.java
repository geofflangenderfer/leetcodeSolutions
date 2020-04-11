import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    double currentSum = Double.NEGATIVE_INFINITY;
    double bestSum = Double.NEGATIVE_INFINITY;
    for (int num : nums) {
      currentSum = Math.max(num, currentSum + num);
      bestSum = Math.max(currentSum, bestSum);
    }
    return (int) bestSum;
  }
  public static void main(String[] args) {
    MaximumSubarray tool = new MaximumSubarray();

    int[] test1 = {-2,1,-3,4,-1,2,1,-5,4};
    int sol1 = 6;

    int[] test2 = {0,1};
    int sol2 = 1;
    int[] test3 = {0,-1,1};
    int sol3 = 1;
    int[] test4 = {0,-1,1,1};
    int sol4 = 2;
    int[] test5 = {-1,0,1};
    int sol5 = 1;
    int[] test6 = {-1,-1,-1};
    int sol6 = -1;
    //int[] test2 = {};
    //int sol2 = ;

    int[] sols = {
      sol1,
      sol2,
      sol3,
      sol4,
      sol5,
      sol6,
    };
    int[][] tests = {
      test1,
      test2,
      test3,
      test4,
      test5,
      test6,
    };
    for (int i = 0; i < 1; i++) {
      int actual = tool.maxSubArray(tests[i]);
      assert actual == sols[i] 
        : "actual: " 
          + Integer.toString(actual) 
          + String.format(", test%s failed",i+1);
    }
  }
}
