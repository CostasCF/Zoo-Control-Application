//μετρητής που αυξάνεται καθε φορα με την δημιούργια ενος νεου αντικειμένου της κλασης Counter
class Counter {
    static int count = 0; //δημιουργια static μεταβλητης "counter"
    Counter(){
        count ++;
    }
    public void getCount() {
        System.out.println(count);
    }
    public static void main( String args[] ) {
        Counter c1 = new Counter(); //δημιουργια 1ου αντικειμένου
        c1.getCount();
        Counter c2 = new Counter(); //δημιουργια 2ου αντικειμένου
        c2.getCount();
        Counter c3 = new Counter(); //δημιουργια 3ου αντικειμένου
        c3.getCount();
    }
}