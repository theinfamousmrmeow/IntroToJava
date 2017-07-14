/*
COSC2336
L20405356
Alexander Macey
 */

/**
19.2
(Implement GenericStack using inheritance)
 In Listing 19.1, GenericStack is implemented using composition. 
 * Define a new stack class that extends ArrayList.
 * Draw the UML diagram for the classes and then implement GenericStack.
Write a test program that prompts the user to enter five strings and displays them in reverse order.  
*/
import java.util.Scanner; 

public class driver {

    public static void main(String[] args ) {    
        //Build the stack.
        NewStack<String> stack1 = new NewStack<>();
        //User input
        Scanner s = new Scanner(System.in);
        System.out.println("We're going to input 5 strings.");
        //Get user input loop.
        for (int i=0;i<5;i++){
            System.out.println("Enter string No. "+ (i+1) +" please: ");
            stack1.push(s.nextLine());
        }
        //Pop them back out!   
        System.out.println("Here's what you gave me, in reverse: ");
        while (stack1.getSize() > 0){
            System.out.println(stack1.pop());
        }
        
    }
}


