 class SinglyLinkedListExample1{
private ListNode head;
private static class ListNode{
   private int data;
   private ListNode next;
   public ListNode(int data)
   {
    this.data=data;
    this.next=null;
   }

}
public void insertLast(int value)
{
ListNode newNode=new ListNode(value);
if(head==null)
{
    head=newNode;
    return ;
}
ListNode current=head;
while(null!=current.next)
{
   current=current.next;
}
current.next=newNode;
}
  public void display()
  {
    ListNode current=head;
    while(current!=null)
    {
        System.out.print(current.data+"--->");
        current=current.next;
    }
    System.out.println(current);
  }
      
          public ListNode deleteFirst()
          {
            if(head==null)
            {
                return null;
            }
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;
          }
public static void main(String[] args) {
    SinglyLinkedListExample1 sl=new SinglyLinkedListExample1();
    sl.insertLast(10);
    sl.insertLast(20);
    sl.insertLast(30);
    sl.insertLast(40);
    sl.insertLast(50);
    System.out.println("Before delete Singly Linked List Elements are : ");
    sl.display();
    System.out.print("\n");
    System.out.println("After delete Singly Linked List Elements are : ");
    sl.deleteFirst();
    sl.display();
}
}