class Bank {
    static String origin;
    Bank() {
        origin = "Greece";
    }
    public static void setOrigin(String c) { //creation of the static method called setOrigin
        origin = c;
    }
    public void getOrigin() { //creation of the regular method calld getOrigin
        System.out.printf("Current origin: %s \n", origin);
    }


    public static void main( String args[] ) {
        Bank c1 = new Bank(); //creation of the object called c1
        c1.getOrigin();;
        Bank.setOrigin("UK");
        c1.getOrigin();
    }
}