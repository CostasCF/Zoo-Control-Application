//creation of the abstract class called Sum
abstract class Sum{
    //creation of the abstract method called NumberSum
   public abstract int NumberSum(int x1, int x2);
   /*Αν μια μέθοδος δηλωθεί abstract τότε 
    *πρέπει να δηλωθεί abstract και η
    *τάξη που την περιέχει που σε αυτη την περιπτωση ειναι η Sum
    */
}
// Regular class extends through Sum class
class Regular extends Sum{
   public int NumberSum(int x1, int x2){
	return x1+x2;
   }

//main
public static void main(String args[]){
    Sum obj = new Regular(); //we create an instance from the "Regular" class that extends itself from 
                             // the abstract class called "Sum"
	System.out.println(obj.NumberSum(1, 2));
   }
}

