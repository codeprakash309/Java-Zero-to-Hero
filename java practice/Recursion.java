public class Recursion {
    public static void main(String[] args) {
        M1(1);
    }
    public static void M1(int i) {
        
        System.out.println("i= "+i);
        if(i>=3)
        {            
            System.out.println("hello");
            return ;
        }
        int b=i;
        System.out.println("b= "+b);
        M1(++i);
        int a=i;
       System.out.println("a= "+a);
       
    }
}
