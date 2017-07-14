/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introtojava.Exercise18_26;

/**
 *
 * @author Dante
 */
public class levelMap {
    int width;
    int height;
    char grid[][];
    
    levelMap(int _width, int _height){
        width = _width;
        height = _height;
        grid = new char[width][height];
        clearMap();
    }
    
    public void clearMap(){
            for (int col = 0; col < width; col++){
            for (int row = 0; row < height; row++){
                grid[col][row]='.';
            }
        }
    }
    
    public boolean positionInBounds(int _x, int _y){
        if (_x>0 && _x<width && _y>0 && _y<height){return true;}
        else return false;
    }
    
    public int getGridValue(int x, int y){
        return grid[x][y];
    }
    public void setGridValue(int x, int y, char value){
        grid[x][y] = value;
    }
    
    
    public void printMap(){
        
        String colString="";
        
        for (int col = 0; col < width; col++){
            for (int row = 0; row < height; row++){
                colString += grid[col][row];
            }
            System.out.println(colString);
            colString="";
        }
    }
    
    
}
