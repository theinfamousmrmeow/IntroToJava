package introtojava.Exercise18_26;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dante
 */

public class Point implements Comparable{
    int x;
    int y;

    Point(int myX, int myY){
        x= myX;
        y= myY;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    @Override
    public String toString(){
        return (getX()+ "," + getY());
    }
    
    public int compareTo(Point otherPoint){
        if (getX() == otherPoint.getX() && getY() == otherPoint.getY()){
            return 1;
        }
        else return 0;
    }
    @Override
    public int compareTo(Object otherPoint){
        if (toString()==otherPoint.toString()){
            return 1;
        }
        else return 0;
    }
    
}
