public class InnerClassExample5 {
    int x=10;
    class Inner{
        int y=20;
        public void M1(){
            System.out.println("Sum of two number is : "+(x+y));
            
        }
    }
    public static void main(String[] args) {
        InnerClassExample5 outer =new InnerClassExample5();
        InnerClassExample5.Inner i=outer.new Inner();
        i.M1();
    }
}
