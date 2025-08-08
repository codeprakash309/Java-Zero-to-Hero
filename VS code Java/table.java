class Demo{
    int n;
    void setdata(int x){
       n=x;
    }
    void Operation(){
        for(int i=1;i<=10;i++){
            int result=n*i;
            System.out.println(+n+"*"+i+"=" +result);
        }
    }
}

class table {
    public static void main(String[] args) {
        Demo t= new Demo();
        t.setdata(4);
        t.Operation();
    }
}
