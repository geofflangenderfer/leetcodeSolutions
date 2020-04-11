import java.util.Map;
import java.util.HashMap;

public class Solution {
  public int countElements(int[] arr) {
    int count = 0;
    Map<Integer, Boolean> incIsPresent = new HashMap<Integer, Boolean>(); 
    for (int val : arr) {
      if (incIsPresent.containsKey(val)) {
        continue;
      }
      incIsPresent.put(val-1, true);
    }
    for (int val : arr) {
      if (incIsPresent.containsKey(val)) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    Solution obj = new Solution();

    int[] test1 = {1,2,3};
    int sol1 = 2;

    int[] test1 = {1,3,2,3,5,0};
    int sol1 = 3;
    Map<Integer[], Integer> tests = new HashMap<Integer[], Integer>() {
      {
        put(test1, sol1);
        put(test2, sol2);
      }
    };
    for (Map.Entry<Integer[], Integer> test : tests) {
      assert obj.countElements(test.getKey()) == test.getValue()
        : String.format("test failed for %s", (String) test.getKey());
    }
      
  }
}
