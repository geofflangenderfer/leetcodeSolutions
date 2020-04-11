public class MinStack {
  private int n;
  private Node first;

  private class Node {
    private int value;
    private Node next = null;
  }
  public MinStack() {
    this.n = 0;
    this.first = null;
  }
  public void push(int x) {
    if (this.first == null) {
      Node newNode = new Node();
      newNode.value = x;
      this.first = newNode;
    }else {
      Node newNode = new Node();
      newNode.value = x;
      newNode.next = first;
      this.first = newNode;
    }
  }
  public void pop() {
    this.first = this.first.next;
  }
  public int top() {
    return this.first.value;
  }
  public int getMin() {
    int min = 2147483647;
    Node current = this.first;
    while (current != null) {
      if (current.value < min) {
        min = current.value;
      }
      current = current.next;
    }
    return min;
  }
  public void printStack() {
    Node current = this.first;
    String repr = "";
    while (current != null) {
      
      repr += current.value + " ";
      current = current.next;
    }
    System.out.println(repr);
  }
  public static void main(String[] args) {
    MinStack obj = new MinStack();
    int[] test1 = {-2,0,-3};
    for (int val : test1) {
      obj.push(val);
    }

    assert obj.getMin() == -3;
    obj.pop();
    assert obj.top() == 0;
    assert obj.getMin() == -2;
  }
}
