class OuterClass {
    static String xString = "Hello World!";
    static class InnerClass {
      static void getString(){
        System.out.println( xString );
      }
    }
/*Σε αυτη την περιπτωση οπου υπαρχουν 2 static κλασεις η μία μεσα στην αλλη(nested classes),
μπορουμε να αποκτήσουμε προσβαση στην εσωτερικη κλάση απο την main(), χωρις την αναγκη
δημιουργίας αντικειμένου της εξωτερικής κλασης.
*/

    public static void main( String args[] ) {
      OuterClass.InnerClass.getString();

    }
}