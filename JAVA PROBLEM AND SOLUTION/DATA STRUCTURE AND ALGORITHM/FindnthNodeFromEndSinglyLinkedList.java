public class FindnthNodeFromEndSinglyLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertNode(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
            return ;
        }
        ListNode current=head;
        while(null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }
    public ListNode findNthNode(int n){
        if(head==null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value : n ="+n);
        }
        ListNode mainPtr=head;
        ListNode refPtr=head;
        int count=0;
        while(count<n){
            if(refPtr==null){
                throw new IllegalArgumentException(n+"is greater than the number of nodes in list");
            }
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr;
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println(current);
    }
    public static void main(String[] args) {
        FindnthNodeFromEndSinglyLinkedList ll=new FindnthNodeFromEndSinglyLinkedList();
        ll.insertNode(10);
        ll.insertNode(20);
        ll.insertNode(30);
        ll.insertNode(40);
        ll.insertNode(50);
        ll.display();
        ListNode getNode=ll.findNthNode(3);
        //ListNode getNode=ll.findNthNode(6); RE
        //ListNode getNode=ll.findNthNode(-1); RE
        System.out.println("nth node from the end is : "+getNode.data);
    }
}
