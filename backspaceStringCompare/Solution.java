// for each character starting from end
//  if char is #, increment toSkip
//  else if toSkip > 0, continue
//  else, 
//
import java.util.Stack;
public class Solution {
  public boolean backspaceCompare(String S, String T) {
    return build(S).equals(build(T));
  }
  public String build(String str) {
    Stack<Character> result = new Stack();
    for (char val : str.toCharArray()) {
      if (val != '#') {
        result.push(val);
      }else if (!result.empty()) {
        result.pop();
      }
    }
    return String.valueOf(result);
  }
  public static void main(String[] args) {
    Solution tool = new Solution();

    String[] test1 = {"ab#c", "ad#c"};
    boolean sol1 = true;
    assert tool.backspaceCompare(test1[0], test1[1]) == true;

    String[] test2 = {"a##c", "#a#c"};
    boolean sol2 = true;
    assert tool.backspaceCompare(test2[0], test2[1]) == true;
      
  }
}
