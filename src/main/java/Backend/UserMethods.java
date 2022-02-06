/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author megan
 */
public class UserMethods
{
    //variables
    public static String  filepath = "data\\users.txt";
    
    //creates a user and sets all game variables to their default values
    public static void createUser(String username)
    {
        //retrieves the name that was entered and names a section of the text file
        try 
        {
            FileWriter fw = new FileWriter(filepath);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.println(username + "#" + "false" + "#" + "false" + "#" + "false" + "#" + "false");   //order is username#brokenPictureFramesOption#tornUpPicturesOption#musicBoxOption#doorOption
            pw.close();
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
    
    
    //deletes the user profile
    //**need to learn how to delete information in a textfile
    
    
    //loads the user that was selected's profile
    //**need to learn how to get to a right part of tthe textfile based on something like a keyword(i.e. username)
    public static Boolean openGame()
    {
        //gets to the right profile first
        
        
    }
}
