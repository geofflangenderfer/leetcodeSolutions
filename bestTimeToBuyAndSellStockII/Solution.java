import java.util.Arrays;
import java.util.Collections;

public class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int index = 0; index < prices.length - 1; index++) {
      if (prices[index+1] > prices[index]) {
        profit += prices[index+1] - prices[index];
      }
    }
    return profit;
  }
  public static void main(String[] args) {
    
    Solution testObject = new Solution();

    Integer[] test1 = {7,1,5,3,6,4};
    Integer sol1 = 7;
    System.out.println(testObject.maxProfit(test1));

    Integer[] test2 = {0, 1};
    Integer sol2 = 1;

    Integer[] test3 = {0, 1, 2};
    Integer sol3 = 2;


    Integer[] test4 = {2, 1, 0};
    Integer sol4 = 0;

    Integer[] test5 = {2, 0, 1};
    Integer sol5 = 1;

    Integer[] test6 = {2, 0, 1, 0, 1};
    Integer sol6 = 2;

    Integer[] test7 = {7,1,5,3,4,6};
    Integer sol7 = 7;

    assert testObject.maxProfit(test1) == 7 : "sol: " + Integer.toString(testObject.maxProfit(test1)) + " test1 failed";
    assert testObject.maxProfit(test2) == 1 : "sol: " + Integer.toString(testObject.maxProfit(test2)) + " test2 failed";
    assert testObject.maxProfit(test3) == 2 : "sol: " + Integer.toString(testObject.maxProfit(test3)) + " test3 failed";

    //assert testObject.maxProfit(test4) == 0 : "sol: " + Integer.toString(testObject.maxProfit(test4)) + " test4 failed";
    assert testObject.maxProfit(test5) == 1 : "sol: " + Integer.toString(testObject.maxProfit(test5)) + " test5 failed";
    //assert testObject.maxProfit(test6) == 2 : "sol: " + Integer.toString(testObject.maxProfit(test6)) + " test6 failed";
    //assert testObject.maxProfit(test7) == 7 : "sol: " + Integer.toString(testObject.maxProfit(test7)) + " test7 failed";
  }
}
