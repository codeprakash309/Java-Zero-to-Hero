 class Switch22 {
    public static void main(String[] args) {
        byte b=10;
        switch(b+1){
          case 10:
          System.out.println(10);
          break;
          case 100:
          System.out.println(100);
          case 1000:
          System.out.println(1000);
          break;
          default:
          System.out.println("def");
          break;
        }
    }
}
