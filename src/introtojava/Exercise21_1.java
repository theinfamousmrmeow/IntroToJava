/*
L20405356
Alexander Macey
 */
package introtojava;
import java.util.*;

/**
(Perform set operations on hash sets)
* Create two linked hash sets {"George","Jim", "John", "Blake", "Kevin", "Michael"} and {"George", "Katie",
"Kevin", "Michelle", "Ryan"} and find their union, difference, and intersection.
* (You can clone the sets to preserve the original sets from being changed by
these set methods.)  

 */
public class Exercise21_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashSet<String> hashSetOne = new LinkedHashSet<>();
        LinkedHashSet<String> hashSetTwo = new LinkedHashSet<>();
        //Add elements to first HashSet
        hashSetOne.add("George");
        hashSetOne.add("Jim");
        hashSetOne.add("John");
        hashSetOne.add("Blake");
        hashSetOne.add("Kevin");
        hashSetOne.add("Michael");
        //Add elements to second HashSet
        hashSetTwo.add("George");
        hashSetTwo.add("Katie");
        hashSetTwo.add("Kevin");   
        hashSetTwo.add("Michelle");        
        hashSetTwo.add("Ryan");
        //Perform a Union
        LinkedHashSet<String> unionHashSet = (LinkedHashSet)hashSetOne.clone();
        unionHashSet.addAll(hashSetTwo);
        //Difference
        LinkedHashSet<String> differenceHashSet = (LinkedHashSet)hashSetOne.clone();
        differenceHashSet.removeAll(hashSetTwo);
        //Intersection
        LinkedHashSet<String> intersectionHashSet = (LinkedHashSet)hashSetOne.clone();
        intersectionHashSet.retainAll(hashSetTwo);
        //
        //Display
        
        System.out.println("Set One: " + hashSetOne.toString());
        System.out.println("Set Two: " + hashSetTwo.toString());
        System.out.println("Union: " + unionHashSet.toString());
        System.out.println("Difference: " + differenceHashSet.toString());
        System.out.println("Intersection: " + intersectionHashSet.toString());
        
        
    }
    
}
