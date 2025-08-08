//Accessing inner class code from outside of outer class
class Test{
    class Inner{
        public void M1(){
            System.out.println("Inner class method!......");
        }
    }
}
public class InnerClassExample4 {
    public static void main(String[] args) {
        Test outer=new Test();
        Test.Inner i=outer.new Inner();
    i.M1();
    }    
}