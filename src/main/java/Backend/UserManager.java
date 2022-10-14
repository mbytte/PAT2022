/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class UserManager
{
    //variables
    private static String  filepath = "data\\users.txt";
    
    
    //gets all the information in the file path
    public static String getFileData()
    {
         //variables
        File userFile = new File(filepath);
        String allData = "";
        try
        {
            Scanner lineScanner = new Scanner(userFile);
            //going through each line and adding them to the output
            while(lineScanner.hasNextLine())
            {
                allData+=lineScanner.nextLine();
            }
         
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        
        return allData;
    }
    
    
    //creates a user and sets all game variables to their default values
    public static void createUser(User user)
    {
        //retrieves the name that was entered and names a section of the text file
        try 
        {
            //making the writers
            FileWriter userFileWriter = new FileWriter(filepath, true);
            PrintWriter addUser = new PrintWriter(userFileWriter);
            
            //adding the information to the file
            addUser.println(user.toString());   //order is username#brokenPictureFramesOption#tornUpPicturesOption#musicBoxOption#doorOption

            //closing the writers
            addUser.close();
            userFileWriter.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("File not found");
        }     
    }
    
    
    //saves the user's progress to a text file for their specific game
    public static void saveProgress()
    {
        //saving the right information to the right place
        //**need to learn how to replace information in a textfile
    }
    
    

    
    //loads the user that was selected's profile
    //**need to learn how to get to a right part of tthe textfile based on something like a keyword(i.e. username)
    public static Boolean openGame()
    {
        //gets to the right profile first


        return null;
    }
    

}
