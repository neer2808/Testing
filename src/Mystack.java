class Node
{
  Node next;
  int data;

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node(int data) {
    this.data = data;
  }


  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
public class Mystack {

  int size ;
  Node top;

  public Mystack() {
    size =0;
    top = null;

  }
  public boolean isempty()
  {
    boolean response = false;
    if(top ==null)
    {
      response= true;

    }
    return response;

  }
  public void myprint()
  {
    while(top!= null)
    {
      System.out.println(top.getData());
      top= top.next;
    }
  }
  public void push(int element)
  {
    Node node = new Node(element);
    node.next= top;
    top = node;
    size++;

  }
  public Node pop()throws NullPointerException {
    Node response = null;
    if (!isempty()) {
      response = top;
      top = top.next;
      size--;
      return response;
    }
    else
    {
      System.out.println("link list empty");
      return response;
    }

  }
public int getSize() {
  return size;

}
}


