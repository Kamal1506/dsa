import java.util.*;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = sc.nextInt();

    Node head = null;
    Node tail = null;

    System.out.print("Enter Elements : ");
    for(int i = 0; i<n; i++){
      int data = sc.nextInt();
      Node newNode = new Node(data);

      if(head == null){
        head = newNode;
        tail = newNode;
      }
      else{
        tail.next = newNode;
        tail = newNode;
      }
    }

    //sum of linked list Elements

    // int sum = 0;
    int count = 0;
    Node temp = head;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    System.out.print(count);

    // System.out.print(sum);
  }
}
