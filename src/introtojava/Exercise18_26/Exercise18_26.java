/*
**18.26 (Create a maze) Write a program that will find a path in a maze, as shown in
Figure 18.13a. The maze is represented by an 8 * 8 board. The path must meet
the following conditions:
■ The path is between the upper-left corner cell and the lower-right corner cell
in the maze.
FIGURE 18.13 The program finds a path from the upper-left corner to the bottom-right corner.
(a) Correct path (b) Illegal pathProgramming Exercises 733
■ The program enables the user to place or remove a mark on a cell. A path
consists of adjacent unmarked cells. Two cells are said to be adjacent if they
are horizontal or vertical neighbors, but not if they are diagonal neighbors.
■ The path does not contain cells that form a square. The path in Figure 18.13b,
for example, does not meet this condition. (The condition makes a path easy
to identify on the board.)
 */
package introtojava.Exercise18_26;
import java.util.*;
/**
 *
 * @author Dante
 */
public class Exercise18_26 {
   
    //GRID VALUES
    //0 = free space
    //1 = I tried already
    //8 = wall
    static final char BARRIER = 'X';
    static final char EXIT = 'E';
    static final char TRIED = '*';
    static final char FREE = '.';
    public static levelMap theMap = new levelMap(10,10);
    public static Inventory inventory = new Inventory();
    
    static Point currentPoint = new Point(1,1);

    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        char[][] levelOne = {
        {'.','.','.','.','.','X','.','.','.','.'},
        {'.','.','.','.','.','X','.','.','.','.'},
        {'X','X','X','.','.','X','.','.','X','.'},
        {'.','.','.','.','.','X','.','.','X','.'},
        {'.','.','X','.','.','.','.','.','X','.'},
        {'.','.','.','X','X','.','.','X','.','.'},
        {'.','.','.','X','X','X','X','X','.','.'},
        {'.','.','.','.','.','.','X','X','.','.'},
        {'.','.','.','.','.','.','X','.','.','.'},
        {'.','.','.','.','.','.','.','.','.','.'},       
        };
        
        theMap.grid = levelOne;
        
        theMap.printMap();
        Point exit = new Point(theMap.width-1,theMap.height-1);
        //theMap.setGridValue(exit.x,exit.y,EXIT);
        solveMaze(exit);
        theMap.printMap();
        
        inventory.add("Sword");
        inventory.add("Sword");
        inventory.add("Gold Coins");
        inventory.printInventory();
    }
    
    
    
    public boolean positionIsFree(Point thisPosition){
        
        if (!theMap.positionInBounds(thisPosition.getX(), thisPosition.getY())){return false;}
        if (theMap.getGridValue(thisPosition.getX(),thisPosition.getY()) == FREE ||
            theMap.getGridValue(thisPosition.getX(),thisPosition.getY()) == EXIT    ){
            return true;
        }
        else {return false;}
    }
        public static boolean positionIsFree(int thisX, int thisY){
        if (!theMap.positionInBounds(thisX, thisY)){return false;}
        if (theMap.getGridValue(thisX,thisY) == FREE){
            return true;
        }
        else {return false;}
    }
    

    public static boolean availableMove(Point position){
        if (positionIsFree(position.getX()-1,position.getY())
           ||positionIsFree(position.getX()+1,position.getY())
           ||positionIsFree(position.getX(),position.getY()+1)
           ||positionIsFree(position.getX(),position.getY()-1))
        {
            return true;
        }
        
        else return false;
    }
    
    public static boolean solveMaze(Point targetPoint){
        
        int xmove=0;
        int ymove=0;
        boolean moved=false;
        
        theMap.setGridValue(currentPoint.getX(),currentPoint.getY(),TRIED);
        if (!availableMove(currentPoint)){
            
            System.out.println("No Solution.");
            return false;}//Exit case.
        if (currentPoint.x == targetPoint.getX() && currentPoint.y == targetPoint.getX() ){ 
            theMap.setGridValue(currentPoint.getX(),currentPoint.getY(),'!');
            return false;}//Other exit case      
        
        if (positionIsFree(currentPoint.getX(),currentPoint.getY()+1)){ymove=1;}
        else if (positionIsFree(currentPoint.getX()+1,currentPoint.getY())){xmove=1;}
        else if (positionIsFree(currentPoint.getX()-1,currentPoint.getY())){xmove=-1;} 
        else if (positionIsFree(currentPoint.getX(),currentPoint.getY()-1)){ymove=-1;}
        
        currentPoint.x+=xmove;
        currentPoint.y+=ymove;
        theMap.printMap();
        //Recursion
        solveMaze(targetPoint);
        
        return false;
    }
    
}
