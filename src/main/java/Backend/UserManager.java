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
public class UserManager
{
    //variables
    //need to add a variable that keeps track of the amount of user IDs in the DB
    private ArrayList<User> users;
    private static String  filepath = "data\\users.txt";
    private static int currentUserIndex;

    
    
    //constructor
    //creates an array list of users
    // NEED TO FIND OUT HOW TO CREATE AN ARRAY OF THE USERS FROM THE DATABASE
    //so this whole thing is gonna change
    public UserManager()
    {
        //initialising
        users = new  ArrayList<>();  
        
        try
        {
            //scanners
            Scanner fileScanner = new Scanner(new File(filepath));
            
            //scanning through the textfile and adding it to the array list
            while(fileScanner.hasNextLine())
            {
                //making the scanner to scan through the users
                String userInfo = fileScanner.nextLine();
                Scanner lineScanner = new Scanner(userInfo).useDelimiter("#");
                
                //getting the various values of the information stored in the textfile
                String username = lineScanner.next();
                boolean levelCheck = lineScanner.nextBoolean();
                boolean levelCheck2 = lineScanner.nextBoolean();
                boolean levelCheck3 = lineScanner.nextBoolean();
                boolean levelCheck4 = lineScanner.nextBoolean();
                //adding a new user to the userArray
                users.add(new User(username, levelCheck, levelCheck2, levelCheck3, levelCheck4));
                
                //closing scanner
                lineScanner.close();
            }
            
            //closing scanner
            fileScanner.close();
            
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }
    
    
    
    //getters
    public ArrayList<User> getUsers()
    {
        return users;
    }
    public static int getCurrentUserIndex()
    {
        return currentUserIndex;
    }
    public User getSelectedUser(int selectedIndex)
    {
        User currentUser = users.get(selectedIndex);
        return currentUser;
    }

    //setters
    public void setUsers(ArrayList<User> users)
    {
        this.users = users;
    }
    public static void setCurrentUserIndex(int index)
    {
        currentUserIndex = index;
    }
    
    

    //creates a user and adds it to the textfile
    public void createUser(User user)
    {
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
    
    
    
    //creating an arraylist of the names of the objects in the array list
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
    //NEED TO CHANGE THE DB INSTEAD OF THE TEXTFILE
    public void delete(int selectedIndex)
    {
        //using an arrayList function to delete a user from the selected index in the array list
        users.remove(selectedIndex);
        
        //getting a new String of all the user objects in their textfile format in order to overwrite the textfile
        String fileOutput = "";
        for(User user: users)
        {
            fileOutput += user.toString() + "\n";
        }
        
        //overwriting the textfile
        try
        {
            //variables
            FileWriter fileWriter = new FileWriter(filepath, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            //overwriting the old data with the new data
            printWriter.print(fileOutput);
            
            //closing writers
            fileWriter.close();
            printWriter.close();
        } catch (IOException ex)
        {
            System.out.println("File not found");
        }
    }   
    
    
    
    //saves the users new information to the textfile
    //NEED TO CHANGE THE DB INSTEAD OF A STRING
    public void save(int selectedIndex, User currentUser)
    {
        //variables
        Games gameObject = new Games(); //creating an object so that we can access the current user variable in the class
        
        //deleting and adding the current user to the textfiles and list of users
        delete(selectedIndex);
        users.add(selectedIndex, currentUser);
        
        //getting a new String of all the user objects in their textfile format in order to overwrite the textfile
        String fileOutput = "";
        for(User user: users)
        {
            fileOutput += user.toString() + "\n";
        }
        
        //overwriting the textfile
        try
        {
            //variables
            FileWriter fileWriter = new FileWriter(filepath, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            //overwriting the old data with the new data
            printWriter.print(fileOutput);
            
            //closing writers
            fileWriter.close();
            printWriter.close();
        } catch (IOException ex)
        {
            System.out.println("File not found");
        }
    }
}
