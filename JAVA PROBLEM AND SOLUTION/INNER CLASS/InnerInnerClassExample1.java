public class InnerInnerClassExample1 {
    class Inner{
        class InnerInner{
            public void M1(){
                System.out.println("inner class method!......");
            }
        }       
    }
    public static void main(String[] args) {
        InnerInnerClassExample1 outer=new InnerInnerClassExample1();
        InnerInnerClassExample1.Inner i=outer.new Inner();
        InnerInnerClassExample1.Inner.InnerInner i2=i.new InnerInner();
        i2.M1();
    }
}
