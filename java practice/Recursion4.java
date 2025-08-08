public class Recursion4 {
    public static void main(String[] args) {
        int res=sum(5);
        System.out.println("result : "+res);
    }
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sum(n-1);
    } 
}
