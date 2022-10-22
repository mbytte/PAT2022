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
public class ChangingScreens
{
    //variables 
    //static so they can be shared by all the instances of the object
    private static boolean brokenPictureFramesOption = false;
    private static boolean tornUpPicturesOption = false;
    private static boolean musicBoxOption= false;
    private static boolean doorOption = false;
    public String filePath = getTextfileFilepath();
    
    
    
    //setters
    public void setBrokenPictureFramesOption(boolean brokenPictureFramesOption)    
    {
        this.brokenPictureFramesOption = brokenPictureFramesOption;
    }
    public void setTornUpPicturesOption(boolean tornUpPicturesOption)
    {
        this.tornUpPicturesOption = tornUpPicturesOption;
    }
    public void setMusicBoxOption(boolean musicBoxOption)
    {
        this.musicBoxOption = musicBoxOption;
    }
    public void setDoorOption(boolean doorOption)    
    {
        this.doorOption = doorOption;
    }

    
    
    
    //resets all the variables to false
    public void resetOptionVariables()
    {
        brokenPictureFramesOption = false;
        tornUpPicturesOption = false;
        musicBoxOption = false;
        doorOption = false;    
    }    
    
    
    
    
    //fetching the textfile that goes with the screen
    public String getTextfileFilepath()
    {
        //variables
        String textfileFilePath = "";
                
        //checks what option was picked to get the textfile associated with it
        if(brokenPictureFramesOption)
        {
            textfileFilePath = "data\\brokenPicFramesInfo.txt";
        }
        else if(tornUpPicturesOption)
        {
            textfileFilePath = "data\\tornPicsInfo.txt";
        }
        else if(musicBoxOption)
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
    public String getAreaInfo()
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
    public String getHowToPlay()
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
    public String getStoryline()
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
    public void openGame()
    {
        //checks which options the user has selected and opens the associated screen
        if(brokenPictureFramesOption)
        {
            new RiddleScreen().setVisible(true);
        }
        
        else if(tornUpPicturesOption)
        {
            new PuzzleScreen().setVisible(true);
        }
        
        else if(musicBoxOption)
        {
            new HangmanScreen().setVisible(true);
        }
        
        else
        {
            new DoorCodeScreen().setVisible(true);
        }     
    }
    
    
    
    
    //opens the screen that is needed
    public void openPreviousGame()
    {
        //will only ever be needed for these two options (only games that the user can fail)
        if(brokenPictureFramesOption)
        {
            new RiddleScreen().setVisible(true);
        }
        
        else if(musicBoxOption)
        {
            new HangmanScreen().setVisible(true);
        }       
    }
    
    
    
    //opens the screen that is needed
    public void openNextScreen()
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
