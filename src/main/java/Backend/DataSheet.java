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
    private static boolean completedBrokenPicFrames;
    private static boolean completedMusicBox ;
    private static boolean completedTornPics;
    private static String game = "";

    
    
    //constructor
    public DataSheet(User currentUser)
    {
        //setting the variables to be whatever data is saved
        boolean isCompletedBrokenPicFrames = currentUser.isCompletedBrokenPicFrames();
        boolean isCompletedMusicBox = currentUser.isCompletedMusicBox();
        boolean isCompletedTornPics = currentUser.isCompletedTornPics();
        completedBrokenPicFrames = isCompletedBrokenPicFrames;
        completedMusicBox = isCompletedMusicBox;
        completedTornPics = isCompletedTornPics;     
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
    public void setGame(String game)
    {
        this.game = game;
    }
    
    
    
    //gets the data from the text file only if the game task is complete
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
            if(game.equals("brokenPicFrames")&&currentUser.isCompletedBrokenPicFrames())
            {
                for(int i = 0; i < 2; i++)
                {     
                    info = lineScanner.next();
                }
            }
            //getting info for music box
            else if(game.equals("musicBox")&&currentUser.isCompletedMusicBox())
            {  
                info = lineScanner.next();
            }
            //getting info for torn up pictures
            else if(game.equals("tornUpPics")&&currentUser.isCompletedTornPics())
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
