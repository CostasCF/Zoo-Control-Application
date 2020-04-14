class interfaces {
    static int a;

    static {  //static interfaces that are by default declared as static
      a = 2;
    }
    
    public static void main( String args[] ) {
        System.out.println(interfaces.a);    //accessing static variable only in a static way
    }
}