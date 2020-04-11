import java.util.Map;
import java.util.HashMap;

public class SingleNumber {
  public static void testGetSingleNumber() {
    int[] test1 = new int[] { 2, 2, 1 };
    assert singleNumber(test1) == 1;

    int[] test2 = new int[] { 4, 1, 2, 1, 2 };
    assert singleNumber(test2) == 4;
  }

  public static int singleNumber(int[] nums) {
    Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (!frequency.containsKey(nums[i])) {
        frequency.put(nums[i], 1);
        continue;
      }
      //System.out.println("Before: " + frequency.toString());
      frequency.remove(nums[i]);
      //System.out.println("After: " + frequency.toString());
    }
    //System.out.println(frequency);
    for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return -1;
  }

  public static void main(String[] args) {

    testGetSingleNumber();
    
  }
  
}
