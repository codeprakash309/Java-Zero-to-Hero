public class MainMethod {
    public static void main(String[] args) {
        M1(1);
    }
    static void M1(int i)
    {
        //System.out.println(i);
        if(i>10)
        {
            return ;
        }
       
       // System.out.println(i);
        M1(i+1);
        System.out.println(i);
    }
}
