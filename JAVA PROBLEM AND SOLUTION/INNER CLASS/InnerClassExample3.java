//Accessing inner class code from Instance area of outer class
public class InnerClassExample3 {
    class Inner{
        public void M1(){
            System.out.println("Inner class method!.......");
        }
    }
    public void M2(){
        Inner i=new Inner();
        i.M1();
    }
    public static void main(String[] args) {
        InnerClassExample3 outer =new InnerClassExample3();
        outer.M2();
    }
}
