import java.util.Scanner;
 class swaping {
  public static void main(String[] args) {
    int x,y,temp;
    System.out.println("Enter X and Y ");
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    y=sc.nextInt();
    System.out.println("before Swapping Number is    "  +x+ "  And  " +y);
    temp=x;
    x=y;
    y=temp;
    System.out.println("After swapping number are   "+x+ "  And   " +y);
  }  
}