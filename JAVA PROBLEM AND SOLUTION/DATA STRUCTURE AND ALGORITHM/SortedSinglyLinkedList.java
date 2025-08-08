import java.util.spi.CurrencyNameProvider;

public class SortedSinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertNode(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
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
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println(current);
    }
    public ListNode insertSortedNode(int value)
    {
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            return newNode;
        }
      ListNode current=head;
      ListNode temp=null;
      while(current!=null&& current.data<newNode.data){
        temp=current;
        current=current.next;        
      }
      newNode.next=current;
      temp.next=newNode;
      return head;
    }
    public static void main(String[] args) {
        SortedSinglyLinkedList sll=new SortedSinglyLinkedList();
        sll.insertNode(1);
        sll.insertNode(2);
        sll.insertNode(3);
        sll.insertNode(5);
        sll.display();
        sll.insertSortedNode(4);
        sll.display();
    }
}
