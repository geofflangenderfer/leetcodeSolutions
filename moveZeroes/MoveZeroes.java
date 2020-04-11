import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
  public void moveZeroes(int[] nums) {
    int[] nonZeroes = IntStream.range(0, nums.length)
      .filter(i -> nums[i] != 0)
      .map(i -> nums[i])
      .toArray();
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nonZeroes.length; j++) {
        nums[j] = nonZeroes[j];
      }
      for (int k = nonZeroes.length; k < nums.length; k++) {
        nums[k] = 0;
      }
    }
  }
  public static void main(String[] args) {
    //Solution test1 = new Solution(new int[] {0,1,0,3,12});
    //int[] solution1 = {1,3,12,0,0};
    //test1.moveZeroes();
    //assert Arrays.equals(test1.nums, solution1) : "test1 failed";


    Solution test2 = new Solution();
    int[] input2 = {0,1};
    int[] solution2 = {1,0};
    test2.moveZeroes(input2);
    assert Arrays.equals(input2, solution2) : "input2 failed";

    //Solution test3 = new Solution(new int[] {0,0,1});
    //int[] solution3 = {1,0,0};
    //test3.moveZeroes();
    //assert Arrays.equals(test3.nums, solution3) : "test3 failed";

  }
}
