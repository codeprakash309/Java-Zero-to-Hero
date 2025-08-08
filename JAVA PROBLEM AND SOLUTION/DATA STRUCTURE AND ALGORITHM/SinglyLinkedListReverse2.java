class SinglyLinkedListReverse2 {
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
            return ;
        }
        ListNode current=head;
        while(null!=current.next)
        {
            current=current.next;
        }
        current.next=newNode;
        
    }
    public void reverse()
    {
        if(head==null)
        {
            return ;
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
        head=previous;
    }
    public void display()
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
        
        SinglyLinkedListReverse2 sll=new SinglyLinkedListReverse2();
        sll.insertNode(10);
        sll.insertNode(20);
        sll.insertNode(30);
        sll.insertNode(40);
        sll.insertNode(50);
        sll.display();
        sll.reverse();
        sll.display();
        
        
    }
}