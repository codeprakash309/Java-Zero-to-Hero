class SinglyLinkedListReverse {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public void insertNode(int value){
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
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    public void display(ListNode head)
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"---->");
            current=current.next;
        }
        System.out.println(current);
    }
    public static void main(String[] args) {
        //10-->20-->30-->40
        //10 as a head node of linked list
        ListNode head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        
        //attach them together to form a list
        head.next=second;  //10-->20
        second.next=third;  //10-->20-->30
        third.next=fourth;  //10-->20-->30-->40

        SinglyLinkedListReverse sll=new SinglyLinkedListReverse();
        sll.display(head);
        ListNode reverseList=sll.reverse(head);
        sll.display(reverseList);
        
    }
}