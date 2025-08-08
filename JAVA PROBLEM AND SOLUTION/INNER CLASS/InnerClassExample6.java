public class InnerClassExample6 {
    int x=10;
    int y=20;
   class Inner{
    public void M1(){
        System.out.println("Sumof two Number is : "+(x+y));
    }
   } 
   public static void main(String[] args) {
        InnerClassExample6 outer =new InnerClassExample6();
        InnerClassExample6.Inner i=outer.new Inner();
        i.M1(); 
   }
}
