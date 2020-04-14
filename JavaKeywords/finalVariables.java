//final variable
class FinalVariable {

    final int x = 50;
    
   //***  x = 60; //This line would give an ERROR because we can't change
            //the value of a variable declared with the "final" keyword

}


//reference variables where something different happens
/*Μπορούμε να αλλάξουμε την τιμη της μεταβλητης ΧΡΗΣΙΜΟΠΟΙΟΝΤΑΣ το αντικειμενο που δηλώθηκε
 *πιο πριν αλλα ΔΕΝ μπορούμε να αλλαξουμε το ιδιο το αντικείμενο με καποιο αλλο μετέπειτα. 
 */
class Reference{
    public int value = 5;
}

class frVariable {
    public static void FinalReference( String args[] ) {

      final Reference example = new Reference(); //Δημιουργια final αντικειμένου
      example.value = 1; // αλλαζουμε την τιμη της μεταβλητης χωρις προβλημα

      //Reference another = new Reference();
      //*** example = another; // Αυτη η γραμμη θα εμφανίσει ERROR διότι δεν μπορούμε να αλλαξουμε το
                         // final αντικειμενο που ορίστηκε πιο πριν.
     
 }
}