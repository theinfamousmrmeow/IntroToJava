/*
COSC2336
L20405356
Alexander Macey
 */


/**
19.2
(Implement GenericStack using inheritance)
 In Listing 19.1, GenericStack is implemented using composition. Define a new stack class that extends ArrayList.
 * Draw the UML diagram for the classes and then implement GenericStack.
Write a test program that prompts the user to enter five strings and displays them in reverse order.  
*/


public class NewStack<E> extends java.util.ArrayList<E>{

    public int getSize() {
        return size();
    }

     public void push(E o) {
        add(o);
     }

     public E peek(){
         return get(size()-1);
     }
    //Not sure this is right.  Needs to be an E rather than a Object.  Primitives wouldn't work here?
     public E pop() {
        E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
     }

     @Override
     public String toString() {
        return "Newstack: " + toString();
     }

    
}
