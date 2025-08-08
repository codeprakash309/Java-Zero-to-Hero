public class Recusion3 {
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
        M1(i+1);
        int a=i;
        System.out.println("a= "+a);
        M1(i+1);
        int b=i;
        System.out.println("b= "+b);
       
    }
}
