public class MethodLocalInnerClassExample1 {
    public void M1(){
        class Inner{
            public void sum(int x, int y){
                System.out.println("The sum is : "+(x+y));
            }
        }
        Inner i=new Inner();
        i.sum(10,20);
    }
    public static void main(String[] args){
         MethodLocalInnerClassExample1 obj=new  MethodLocalInnerClassExample1();
        obj.M1();
    }
}
