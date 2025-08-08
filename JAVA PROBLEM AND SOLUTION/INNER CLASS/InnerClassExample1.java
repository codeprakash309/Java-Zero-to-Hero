class InnerClassExample1{
    class Inner{
        public static void main(String[] args) {
            //if compile the inner class then we have to write  InnerClassExample$Inner the enter in command prompt
            System.out.println("Inner class main method......");
        }
    }
    public static void main(String[] args) {
        System.out.println("outer class main method.........");
    }
    
}