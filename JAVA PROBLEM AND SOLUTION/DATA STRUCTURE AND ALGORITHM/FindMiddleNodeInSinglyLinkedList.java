class FindMiddleNodeInSinglyLinkedList{
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
    public void insertNode(int value){
        ListNode newNode=new ListNode(value);
        if(head==null)
        {
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;

    }
    public ListNode findMiddleNode(){
        if(head==null){
            return null;
        }
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while (fastPtr!=null&&fastPtr.next!=null) {
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;            
        }
        return slowPtr;
    }
    public void display(){
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"--->");
            current=current.next;
        }
        System.out.println(current);
    }
    public static void main(String[] args) {
        FindMiddleNodeInSinglyLinkedList sll=new FindMiddleNodeInSinglyLinkedList();
        sll.insertNode(10);
        sll.insertNode(20);
        sll.insertNode(30);
        sll.insertNode(40);
        //sll.insertNode(50);
        sll.display();
        ListNode middleNode=sll.findMiddleNode();
        System.out.println("Middle node is  : "+middleNode.data);
        
    }
}