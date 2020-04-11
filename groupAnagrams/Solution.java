public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

  }
  public static void main(String[] args) {
    Solution tool = new Solution();

    String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[][] sol1 = {
      {"ate","eat","tea"},
      {"nat","tan"},
      {"bat"}
    };

    String[] test2 = {"bra", "bar", "arb"};
    String[][] sol2= {
      {"bra", "bar", "arb"}
    };
    String[] test3 = {"boob", "poop"};
    String[][] sol3 = {
      {"boob"},
      {"poop"}
    };
    String[] test4  = {};
    String[][] sol4 = {};

    Map<> tests = new HashMap<>() {
      put(test1, sol1);
      put(test2, sol2);
      put(test3, sol3);
      put(test4, sol4);
    };
  }
}
