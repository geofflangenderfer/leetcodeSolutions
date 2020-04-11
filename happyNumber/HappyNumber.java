import java.util.Map;
import java.util.HashMap;

public class HappyNumber {
  public static void testIsHappyNumber() {
    assert isHappyNumber(19) == true;
    assert isHappyNumber(1) == true;
  }
  public static boolean isHappy(int n) {
    // total = 0
    // while total != 1
    //  convert to string 
    //  for each character
    //   convert to int, square, add to total
    //  total == 1 ? return true : total = 0
    int total = 0;
    Map<Integer, Integer> totalFrequencies = new HashMap<Integer, Integer>();
    while (total != 1) {
      String asString = Integer.toString(n);
      for (int i = 0; i < asString.length(); i++) {
        int asInt = asString.charAt(i) - '0';
        total += asInt * asInt;
      }
      if (total == 1) {
        return true;
      }
      if (!totalFrequencies.containsKey(total)) {
        totalFrequencies.put(total, 1);
      }else {
        return false;
      }
      System.out.println("n: " + Integer.toString(n) + " total: " + total);
      n = total;
      total = 0;
    }
    return false;
    
  }
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      assert isHappyNumber(Integer.parseInt(args[i])) == true : args[i] + " is unhappy";
    }
    //String asString = Integer.toString(19);
    //for (int i = 0; i < asString.length(); i++ ) {
    //  System.out.println(asString.charAt(i) - '0' - 19);
      
    //}
    
  }
}
