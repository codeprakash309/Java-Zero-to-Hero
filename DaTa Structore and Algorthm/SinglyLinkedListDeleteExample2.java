public class SinglyLinkedListDeleteExample2 {
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
            return;
        }
        ListNode current=head;
        while(null!=current.next)
        {
            current=current.next;
        }
        current.next=newNode;
    }
   public ListNode deleteNode(int position)
    {
        if(position==1)
        {
            head=head.next;
        }
        ListNode previous=head;
        int count=1;
        while(count<position-1)
        {
            previous=previous.next;
            count++;
        }
        ListNode current=previous.next;
        previous.next=current.next;
        
        return current;

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
    public static void main(String[] args) {
        SinglyLinkedListDeleteExample2 sll=new SinglyLinkedListDeleteExample2();
        sll.insertLast(10);
        sll.insertLast(20);
        sll.insertLast(30);
        sll.insertLast(40);
        System.out.println("Inserted elements are : ");
        sll.display();
        System.out.println("delete the node at specified position : ");
        sll.deleteNode(2);
         sll.display();
    }
}
