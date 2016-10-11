/*
GAME OF LIFE
NEWTON - YAPP OOP
Giovanni Palusa
Giovanni@palusa.se
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;


public class Cells {
    
    // Load file and create an array based on what's in this file (requires java 8+)
    public static int[][] loadPreviousField (Path fileName) throws IOException {
      return Files.lines(fileName)
      .map((l)->l.trim().split("\\s+"))
      .map((sa)->Stream.of(sa).mapToInt(Integer::parseInt).toArray())
      .toArray(int[][]::new);
    }
            
    // Randomize the incoming array and send it back
    public static int[][] randomCells (int[][] cells) {
            for (int[] cell : cells) {
            for (int j = 0; j < cell.length - 1; j++) {
                cell[j] = (int)(Math.random()*2);
            }
        }
        return cells;
    }
    
    // Control if a cell is alive or dead, based on it's "neighbours"
    // The value sent back is in a new array
    public static int[][] controlIfAlive (int[][] cells, int sizeOfTableX, int sizeOfTableY) {
        
        // Count how many positions the array has, and save those values
        // This is needed to stop the calculations from going out of the array
        int xMaxIndex = cells[0].length-1;
        int yMaxIndex = cells.length-1; 

        
    // Create a copy of the array
        int cellsTemp [][] = new int [sizeOfTableY][sizeOfTableX];
            for (int i = 0; i<cells.length; i++) {
            System.arraycopy(cells[i], 0, cellsTemp[i], 0, cells[i].length);
        }
        
        // Check it's neighbours
        for (int y = 0; y<cells.length; y++) {
            for (int x = 0; x<cells[0].length ; x++){
            
            // At every new loop, set neighbours to 0
            int neighbours = 0;
                
            // Check all eight cells around the "active" cell
            // "Don't check outside the array" is being controlled at every if statement
            
            // First row - checks to the right
            
            
            if ((x-1>-1 && y-1>-1)) {           
                if (cells[y-1][x-1] == 1)
                    neighbours++;
            }
            
            if (y-1>-1){ 
                if (cells[y-1][x] == 1)
                    neighbours++;
            }
            
            if (x+1<=xMaxIndex && y-1>-1) {
                if (cells[y-1][x+1] == 1)
                    neighbours++;
            }
                        
            // Second row and counts to the right (not the hosting cell)
            if (x-1>-1){
                if (cells[y][x-1] == 1)
                    neighbours++;
            }
            if (x+1<=xMaxIndex){
                if (cells[y][x+1] == 1)
                    neighbours++; 
            }
            
            // Third row and checks to the right
            if (x-1>-1 && y+1<= yMaxIndex){
                if (cells[y+1][x-1] == 1)
                    neighbours++;
            }
            if (y+1<= yMaxIndex) {
                if (cells[y+1][x] == 1)
                    neighbours++;
            }
            if (x+1 <= xMaxIndex && y+1 <= yMaxIndex){
                if (cells[y+1][x+1] == 1)
                    neighbours++;
            }
            
            // Print the desicions to the temporary array
                if (neighbours == 3)
                     cellsTemp[y][x] = 1;
                else if (neighbours == 2)
                     cellsTemp[y][x] = cells[y][x];
                else if (neighbours >3 || neighbours <2)
                    cellsTemp[y][x] = 0;
                else
                    cellsTemp[y][x] = 0;

            }    
        }
            for (int q = 0; q<cells.length; q++) {
            System.arraycopy(cellsTemp[q], 0, cells[q], 0, cells[q].length);
            }
        return cells;
    }
    
    public static String printArray (int[][] cells) {
                for (int i = 0; i <=cells.length; i++)
            System.out.println();
            
            // Print the whole array, cell by cell
            for (int[] cell : cells) {
                for (int j = 0; j < cell.length; j++) {
                    if (cell[j] == 1)
                        System.out.print("\u25C9" + " ");
                    if (cell[j] == 0)
                        System.out.print(" " + " ");
                }
                System.out.println();
            }
                System.out.flush();
        return("");
    }
    
    public static int speed (int speed) throws InterruptedException{
            // The speed is 30 times what the user writes
            // This is to get milliseconds
                    Thread.sleep(30*speed);
     return speed;
    }
    
}
