class SinglyLinkedList 
{
	private ListNode head;
	public static class  ListNode
	{
		private int data;   //generic
		private ListNode next;
		public ListNode(int data)
		{
          this.data=data;
		  this.next=null;
		}
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
	public static void main(String[] args) 
	{
		SinglyLinkedList sll=new SinglyLinkedList();
	          	  sll.head=new ListNode(10);
			      ListNode  second=new ListNode(1);
				  ListNode  third =new ListNode(8);
				  ListNode  fourth=new ListNode(11);
		//now we will connect them together to form a chain
		sll.head.next=second;
		second.next=third;
		third.next=fourth;

		sll.display();
		System.out.println();
	}
}
