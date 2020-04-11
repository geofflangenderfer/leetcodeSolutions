public class LinkedList {
  public ListNode head;
  public class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x) { val = x; }
  }
  public LinkedList() {}
  public LinkedList(int[] values) {
    for (int value : values) {
      appendNode(value);
    }
  }
  public ListNode middleNode(ListNode head) {
    ListNode A = head;
    ListNode B = head;
    while (B != null) {
      B = B.next;
      if (B == null) {
        return A;
      }
      A = A.next;
      B = B.next;
    }
    return A;
  }
  public int getSize() {
    int size = 0;
    ListNode current = this.head;
    while (current != null) {
      size++;
      current = current.next;
    }
    return size;
  }
  public void appendNode(int value) {
    if (this.head == null) {
      this.head = new ListNode(value);
    }else {
      ListNode current = this.head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = new ListNode(value);
    }
  }
  public void printList(ListNode node) {
    String values = "";
    while (node != null) {
      values += Integer.toString(node.val) + " ";
      node = node.next;
    }
    System.out.println("Nodes: " + values);
  }

  public static void main(String[] args) {
    int[] test1 = {1,2,3,4,5,6};
    LinkedList tool = new LinkedList(test1);
    ListNode sol1 = tool.middleNode(tool.head);
    assert sol1.val == 4;
    tool.printList(sol1);
    

  }
}
