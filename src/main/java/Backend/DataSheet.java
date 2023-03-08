/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author megan
 */
public class DataSheet
{
    //variables
    // CHANGE VARIABLE NAMES TO BE THE NAMES OF THE GAMES RATHER THAN THE NAMES OF THE PLACES WHERE IT HAPPENS (e.g. hangman)
    private static boolean completedBrokenPicFrames;
    private static boolean completedMusicBox ;
    private static boolean completedTornPics;
    private static String game = "";

    
    
    //constructor
    public DataSheet(User currentUser)
    {
        //setting the variables to what the useer has been completed and what hasn't been completed
        completedBrokenPicFrames = currentUser.isCompletedBrokenPicFrames();
        completedMusicBox = currentUser.isCompletedMusicBox();
        completedTornPics = currentUser.isCompletedTornPics();
    }

    
    
    //setters
    public void setCompletedBrokenPicFrames(boolean completedBrokenPicFrames)
    {
        this.completedBrokenPicFrames = completedBrokenPicFrames;
    }
    public void setCompletedMusicBox(boolean completedMusicBox)
    {
        this.completedMusicBox = completedMusicBox;
    }
    public void setCompletedTornPics(boolean completedTornPics)
    {
        this.completedTornPics = completedTornPics;
    }
    public void setGame(String game) //sets the game variable to be whatever part of the game the user wants to get data for
    {
        this.game = game;
    }
    
    
    
    //gets the data from the text file only if the game task is complete
    //THIS WILL HAVE TO CHANGE TO THE DATABASE WAY OF COLLECTING THIS DATA
    public String getCompletedGameData(User currentUser)
    {
        //variables
        String output = "";
        String filepath = "data\\completedTasksInfo.txt";
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filepath);
                
                
            //making a scanner to scan through each line
            Scanner lineScanner = new Scanner(textfile).useDelimiter("#");
            
            //getting to the position where the required information is in the file
            String info = "";
            //getting info for broken picture frames
            if(game.equals("brokenPicFrames")&&completedBrokenPicFrames)
            {
                for(int i = 0; i < 2; i++)
                {     
                    info = lineScanner.next();
                }
            }
            //getting info for music box
            else if(game.equals("musicBox")&&completedMusicBox)
            {  
                info = lineScanner.next();
            }
            //getting info for torn up pictures
            else if(game.equals("tornUpPics")&&completedTornPics)
            {
                for(int i = 0; i < 3; i++)
                {     
                    info = lineScanner.next();
                }
            }
            
            //adding the information to the output
            output += info + "\n";

            lineScanner.close();   
        } 
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        return output;
    }
}
