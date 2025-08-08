public class SingleyLinkedListDeleteLast {
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
    //insert the elements into the  singly linked list
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
    //display the elements of singly linked list
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
    //delete the last node of the singly linked list
    public ListNode deleteLast()
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;

    }
    public static void main(String[] args) {
        SingleyLinkedListDeleteLast slld=new SingleyLinkedListDeleteLast();
        slld.insertLast(10);
        slld.insertLast(20);
        slld.insertLast(30);
        slld.insertLast(40);
        slld.insertLast(50);
        System.out.println("Before delete singly linked list elements are : ");
        slld.display();
        System.out.println("\n After deletion singly linked list elements are : ");
        slld.deleteLast();
        slld.display();
    }
}
