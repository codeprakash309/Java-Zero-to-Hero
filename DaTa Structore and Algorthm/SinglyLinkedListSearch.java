public class SinglyLinkedListSearch{
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
    public void insertNode(int value)
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
    public boolean searchElement(int searchKey)
    {
        ListNode current=head;
        while(current!=null)
        {
            if(current.data==searchKey)
            {
                return true;
            }
            current=current.next;
        }
        return false;
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
        SinglyLinkedListSearch sll=new SinglyLinkedListSearch();
        sll.insertNode(10);
        sll.insertNode(20);
        sll.insertNode(30);
        sll.insertNode(40);
        sll.insertNode(50);
        sll.display();
        boolean b=sll.searchElement(60);
        if(b==true)
        {
            System.out.println("Element found in the SinglyLinkedList");
        }
        else{
            System.out.println("Element Not found in the SinglyLinkedList");
        }
    }
}