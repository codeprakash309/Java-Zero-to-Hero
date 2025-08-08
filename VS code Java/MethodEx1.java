 class MethodEx1{
    int Sum(int x, int y){
        int a,b,c;
        a=x;
        b=y;
        c=a+b;
        return c;
    }
    static int Sub(int x,int y){
        int a,b,c;
        a=x;
        b=y;
        c=a-b;
        return c;
    }
    public static void main(String[] args) {
        MethodEx1 obj=new MethodEx1();
       int x= obj.Sum(12,23);
       System.out.println("Sum of two number is : "+x);
       System.out.println("Substraction of two number is : "+MethodEx1.Sub(120,78));
    }
}
