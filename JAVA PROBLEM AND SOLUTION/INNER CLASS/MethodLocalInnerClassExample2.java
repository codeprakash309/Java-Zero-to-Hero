public class MethodLocalInnerClassExample2 {
    static int x=10;
    static int y=20;
    public static void M1(){
        class Inner{
            public void M2(){
                System.out.println("Value of X : "+x);
                System.out.println("Value of Y : "+y);
            }
        }
        Inner i=new Inner();
        i.M2();
    }
    public static void main(String[] args) {
        MethodLocalInnerClassExample2 outer=new MethodLocalInnerClassExample2();
        outer.M1();
    }
}
