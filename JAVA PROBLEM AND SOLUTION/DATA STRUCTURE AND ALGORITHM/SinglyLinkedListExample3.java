//Insert node at the end of a singly linked list in java
class SinglyLinkedListExample3 
{
	private ListNode head;
	public static class ListNode
	{
		private int data;         //can be a generic type
		private ListNode next;      //reference to next ListNode to list
	    public ListNode(int data)   //constructor
	     {
          this.data=data;
		  this.next=null;
	     }
   }
	public int length()
	{
       if(head==null)
		{
          return 0;
		}
		int count=0;
		ListNode current =head;
		while(current!=null)
		{
           count++;
		   current=current.next;
		}
		return count;
	}
//insert node at end of the singly linked list
   public void insertLast(int value)
	{
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
  //insert node at the first of the singly linked list
  public void insertFirst(int value)
	{
         ListNode newNode=new ListNode(value);
		 newNode.next=head;
		 head=newNode;
	}

	//display the singly linked list
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
	public static void main(String[] args) 
	{
		SinglyLinkedListExample3  sll=new SinglyLinkedListExample3();
		sll.insertLast(12);
		sll.insertLast(10);
		sll.insertLast(2);
		sll.insertFirst(5);
		sll.display();
		System.out.println("length of the singly linked list is : "+sll.length());
	}
}
