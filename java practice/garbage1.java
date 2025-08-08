public class garbage1 {
    public void finalize()
    {
        System.out.println("garbage collection");
    }
    public static void main(String[] args) {
        garbage1 g1=new garbage1();
        garbage1 g2=new garbage1();
        g1=null;
        g2=null;
        System.gc();
    }
}
