 class PalindromeNo{
    public static void main(String[] args) {
        int n=1221;
        int rem,rev=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        System.out.println(+temp+"  is palindrome number");
        else
        System.out.println(+temp+"   not a palindrome number");
    }
}