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
public class DataSheetMethods
{
    //game completed variables (public so they can be used by other classes)
    public static boolean completedBrokenPicFrames = false;
    public static boolean completedMusicBox = false;
    public static boolean completedTornPics = false;
    //variables
    public static String game = "";
    
    
    
    //resets the variables to false(replaying the game)
    public static void reset()
    {
        completedBrokenPicFrames = false;
        completedMusicBox = false;
        completedTornPics = false;
    }
    
    
    
    //gets the data from the text file only if the game task is complete
    public static String getCompletedGameData()
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
