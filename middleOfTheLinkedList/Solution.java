public class Solution {
  public ListNode middleNode(ListNode head) {
    double midpoint = getSize(head) / (double) 2; 
    int middleIndex = ( midpoint % 1 == 0 )
      ? (int) Math.ceil(midpoint)
      : (int) midpoint;
    
    for (int i = 0; i < middleIndex; i++) {
      head = head.next;
    }
    return head;
  }
  public int getSize(ListNode node) {
    int size = 0;
    while (node != null) {
      size++;
      node = node.next;
    }
    return size;
  }
}
