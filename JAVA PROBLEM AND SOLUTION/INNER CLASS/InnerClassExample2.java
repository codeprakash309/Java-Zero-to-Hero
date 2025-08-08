//Accessing inner class code from static area of outer class
public class InnerClassExample2 {
    class Inner{
        public void M1(){
            System.out.println("Inner class Method.......");
        }
    }
    public static void main(String[] args) {
        InnerClassExample2 outer=new InnerClassExample2();
        InnerClassExample2.Inner inner=outer.new Inner();
        inner.M1();
    }
}
