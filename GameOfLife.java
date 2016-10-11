/*
GAME OF LIFE
NEWTON - YAPP OOP
Giovanni Palusa
Giovanni@palusa.se
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GameOfLife {

    
    public static void main(String[]arg) throws IOException, InterruptedException{
        BufferedReader input = new BufferedReader
                            (new InputStreamReader(System.in));

        String SizeXString;
        String SizeYString;
        int sizeX = 0;
        int sizeY = 0;
        int cells[][] = new int[0][0];
        String readFile;
        String fileName;
        String fileEndsWith;
        boolean error;
        int speed = 0;
        
        Texts.welcome();
        
        // Ask the user if they wish to load a game
            do {
        Texts.readFile();
        readFile = input.readLine();
        readFile = readFile.toLowerCase();
            } while (!"y".equals(readFile) && ! "n".equals(readFile));
        

            // If the user has answered yes, ask for a file to load
        if ("y".equals(readFile)) {
            do {
            Texts.askForFileName();
            fileName = input.readLine();
            fileName = fileName.toLowerCase();
            fileEndsWith = fileName.substring(fileName.length()-4);
                if (".gol".equals(fileEndsWith) || ".txt".equals(fileEndsWith))
                    try {
                        Path pathToFile = Paths.get(fileName);
                        cells = Cells.loadPreviousField(pathToFile);
                        sizeX = cells[0].length;
                        sizeY = cells.length;
                        }
                        catch (Exception e) {
                        Texts.error();
                        fileEndsWith = null;
                        }
                else
                Texts.error();
                        
            } while (!".gol".equals(fileEndsWith) && !".txt".equals(fileEndsWith));
        }    
            // If the user has answered no, create a random new field
        if (!"y".equals(readFile)) {
            
            do {
                try{
                    error = false;

            Texts.width();
            SizeXString = input.readLine();
            Texts.height();
            SizeYString = input.readLine();
            sizeX = Integer.parseInt(SizeXString);
            sizeY = Integer.parseInt(SizeYString);
            
                }
                catch (NumberFormatException e){
                    error = true;
                }
            } while (error == true);
            
            cells = new int [sizeY] [sizeX];
            

            // Randomize the table between 0-1
            cells = Cells.randomCells(cells);

        }
        
        // Ask the user about speed
        
                    do {
                try{
                    error = false;
                Texts.speed();
                String speedString = input.readLine();
                speed = Integer.parseInt(speedString);
            
                }
                catch (NumberFormatException e){
                    error = true;
                }
            } while (error == true);
        
        System.out.flush();         
        
        
        // Show the creators name (a short break is added, for readability)
        Texts.cred();
        Cells.speed(10);

       
        
        // Do an infinite loop that counts if the cells should be alive and prints it
        // The only way for the user to stop this is to close the console
        while (true) {  
            Cells.printArray(cells);
            Cells.controlIfAlive(cells, sizeX, sizeY);   
            Cells.speed(speed);
        }
        
    } 


}
