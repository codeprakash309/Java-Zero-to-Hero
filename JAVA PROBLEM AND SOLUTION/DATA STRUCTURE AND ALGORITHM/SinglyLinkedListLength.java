//find the length of the singly Linked List 
class SinglyLinkedListLength 
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
	public int findLength()
	{
     if(head==null)
		{
		 return 0;
		}
		int count =0;
		ListNode current=head;
		while(current!=null)
			{
                 count++;
				 current=current.next;
			}		
		return count;
	}
	public static void main(String[] args) 
	{
		SinglyLinkedListLength slll=new SinglyLinkedListLength();
	          	  slll.head=new ListNode(10);
			      ListNode  second=new ListNode(1);
				  ListNode  third =new ListNode(8);
				  ListNode  fourth=new ListNode(11);
		//now we will connect them together to form a chain
		slll.head.next=second;
		second.next=third;
		third.next=fourth;

		slll.display();
		System.out.println();
		System.out.println("Length of the singlyLinkedList is  : "+slll.findLength());
	}
}
