class First{

    public final void finalMethod(){ //δημιουργια final method
        System.out.print("First");
    }

}
/*

class Second extends First{
    public final void finalMethod() { //Μια final method δεν μπορεί να υποσκελιστεί (override)
                                      // από μια τάξη κληρονόμο (sub class) (υπό τάξη)
        System.out.print("Second"); 
    }
}

*/