public class RemoveDuplicateFromSinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public void insertNode(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }

    public void display(){
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println(current);
    }
    //Remove duplicate from th singly linked list
    public void removeDuplicateNode()
    {
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
       RemoveDuplicateFromSinglyLinkedList sll=new RemoveDuplicateFromSinglyLinkedList();
       sll.insertNode(10);
       sll.insertNode(20);
       sll.insertNode(30);
       sll.insertNode(30);
       sll.insertNode(40);
       sll.display();
       sll.removeDuplicateNode();
       sll.display();
    }
}
