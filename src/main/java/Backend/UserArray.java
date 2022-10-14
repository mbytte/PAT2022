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

/**
 *
 * @author megan
 */
public class UserArray
{
    //variables
    private ArrayList<User> users;
    private int size;

    public UserArray()
    {
        users = new  ArrayList<>();  
        
        try
        {
            //initialising the fields
            
            //scanners
            Scanner fileScanner = new Scanner(new File("data\\users.txt"));
            
            while(fileScanner.hasNextLine())
            {
                //making the scanner to scan through the users
                String userInfo = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(userInfo).useDelimiter("#");
                
                String username = lineScanner.next();
                boolean levelCheck = lineScanner.nextBoolean();
                boolean levelCheck2 = lineScanner.nextBoolean();
                boolean levelCheck3 = lineScanner.nextBoolean();
                boolean levelCheck4 = lineScanner.nextBoolean();
                //adding a new user to the userArray
                users.add(new User(username, levelCheck, levelCheck2, levelCheck3, levelCheck4));
                
                //closing the scanner
                lineScanner.close();
            }
            
            //closing the scanners
            fileScanner.close();
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }
    
    
    public ArrayList<String> getListNames()
    {
        //creating a list of the names
        ArrayList<String> names = new ArrayList<>();
               
        //adding the list of names to the array list
        for(User user : users)
        {
            names.add(user.getUsername());
        }
        
        return names;
    }
    
    
    
    //deletes a user profile
    public void delete(int selectedIndex)
    {
        users.remove(selectedIndex);
        
        String fileOutput = "";
        for(User user: users)
        {
            fileOutput += user.toString() + "\n";
        }
        
        try
        {
            //variables
            FileWriter fileWriter = new FileWriter("data\\users.txt", false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(fileOutput);
            printWriter.close();
        } catch (IOException ex)
        {
            System.out.println("File not found");
        }
    }   
}
