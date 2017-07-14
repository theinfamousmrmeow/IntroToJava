/*
L20405356
Alexander Macey
 */
package cosc2336_ex21_6;
import java.util.Scanner;
import java.util.*;
/**
(Count the occurrences of numbers entered)
Write a program that reads an unspecified number of integers and finds the one 
* that has the most occurrences.
The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
3 3 2 0, the number 3 occurred most often. If not one but several numbers have
the most occurrences, all of them should be reported. For example, since 9 and 3
appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.  

 */

public class COSC2336_ex21_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        //Hashmap
        Map<Integer, Integer> map = new HashMap<>(); 
        //Get input
        System.out.println("Enter some integers.  Input stops if you enter 0: ");
        //
        int inputInt;
        while ((inputInt = input.nextInt())!=0){   
            //If we dont have it, add to map.  If we do, increase the value by one.
            if (!map.containsKey(inputInt)) {map.put(inputInt, 1);}
            else {map.put(inputInt, map.get(inputInt)+1);}
            }
        //Get the max.  Record how many times the most common entry was seen.
        int mode = Collections.max(map.values());
        System.out.println("The integers we have most often are: ");
        //Forloop for life
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            //If the value for time entered is the same as the mode
            if (entry.getValue() == mode){
                System.out.println(entry.getKey());
            }
        }
    
    }
        
}

