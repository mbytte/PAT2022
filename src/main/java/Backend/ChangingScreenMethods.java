/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import Interface.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Megan
 */
public class ChangingScreenMethods
{
    //variables to know what part of the game the user is going on 
    public static boolean brokenPictureFramesOption = false;
    public static boolean tornUpPicturesOption = false;
    public static boolean musicBoxOption = false;
    public static boolean doorOption = false;
    
    //variables
    //file path to the text file
    public static String filePath = getTextfileFilepath();
    
    
    
    
    //resets all the variables to false
    public static void resetOptionVariables()
    {
        brokenPictureFramesOption = false;
        tornUpPicturesOption = false;
        musicBoxOption = false;
        doorOption = false;    
    }
    
    
    
    
    //fetching the textfile that goes with the screen
    public static String getTextfileFilepath()
    {
        //variables
        String textfileFilePath = "";
                
        //checks what option was picked to get the textfile associated with it
        if(brokenPictureFramesOption == true)
        {
            textfileFilePath = "data\\brokenPicFramesInfo.txt";
        }
        else if(tornUpPicturesOption == true)
        {
            textfileFilePath = "data\\tornPicsInfo.txt";
        }
        else if(musicBoxOption == true)
        {
            textfileFilePath = "data\\musicBoxInfo.txt";
        }
        else
        {
            textfileFilePath = "data\\doorInfo.txt";
        }
                
        return textfileFilePath;
    }
 
    
    
    
    
    //only gets the area information in the text file
    public static String getAreaInfo()
    {
        //variables
        String output = "";
        filePath = getTextfileFilepath();
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filePath);

            try (Scanner fileScanner = new Scanner(textfile)) 
            {
                //variables
                String line = fileScanner.nextLine();

                //making a scanner to scan the first line
                Scanner lineScanner = new Scanner(line).useDelimiter("#");
                String areaInfo = lineScanner.next();

                //adding the information to the output
                output += areaInfo + "\n";

                lineScanner.close();
            }
        }        
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        return output;
    }
    
    
    
    
    //gets the how to play from the text file
    public static String getHowToPlay()
    {
        //variables
        String output = "";
        filePath = getTextfileFilepath();
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filePath);
                
                
            //making a scanner to scan through each line
            Scanner lineScanner = new Scanner(textfile).useDelimiter("#");
            
            //getting to the position where the required information is in the file
            String htp = "";
            for(int i = 0; i < 2; i++)
            {     
                htp = lineScanner.next();
            }
            
            //adding the information to the output
            output += htp + "\n";

            lineScanner.close();   
        } 
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        return output;
    }

    
    
    
    //gets the information in the text file and returns it as a string
    public static String getStoryline()
    {
        //variables
        String output = "";
        filePath = getTextfileFilepath();
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filePath);
                   
            //scanner to scan through each line
            Scanner lineScanner = new Scanner(textfile).useDelimiter("#");
            
            //getting to the position where the storyline is in the file
            String storyline = "";
            for(int i = 0; i < 3; i++)
            {     
                storyline = lineScanner.next();
            }
            
            //adding the information to the output
            output += storyline + "\n";

            lineScanner.close();
        } 
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        
        return output;
    }
    
    
    
    
    //opens the game screen from the area that the user has selected
    public static void openGame()
    {
        //checks which options the user has selected and opens the associated screen
        if(brokenPictureFramesOption == true)
        {
            new BrknPicFrameScreen().setVisible(true);
        }
        
        else if(tornUpPicturesOption == true)
        {
            new TornPictureScreen().setVisible(true);
        }
        
        else if(musicBoxOption == true)
        {
            new MusicBoxScreen().setVisible(true);
        }
        
        else
        {
            new DoorScreen().setVisible(true);
        }     
    }
    
    
    
    
    //opens the screen that is needed
    public static void openPreviousGame()
    {
        //will only ever be needed for these two options (only games that the user can fail)
        if(brokenPictureFramesOption == true)
        {
            new BrknPicFrameScreen().setVisible(true);
        }
        
        else if(musicBoxOption == true)
        {
            new MusicBoxScreen().setVisible(true);
        }       
    }
    
    
    
    //opens the screen that is needed
    public static void openNextScreen()
    {
        //opens a screen thats only for the door option
        if(doorOption)
        {
            new EndScreen().setVisible(true);
        }
        
        //opens the home screen for all the other options
        else
        {
            new OptionsScreen().setVisible(true);
        }
    }
}
