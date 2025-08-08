class ReverseOfString{
    public static void main(String[] args) {
        String str="prakash";
        char [] C=str.toCharArray(); //converted to character array and printed in reverse order
        for(int i=C.length-1;i>=0;i--){
             System.out.print(C[i]);
        } 
    }
}