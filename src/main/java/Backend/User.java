/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class User
{
    //object properties
    private String username;
    private boolean completedBrokenPicFrames;
    private boolean completedMusicBox;
    private boolean completedTornPics;
    private boolean completedDoor;
    
    public User(String username, boolean completedBrokenPicFrames, boolean completedMusicBox, boolean completedTornPics, boolean completedDoor)
    {
        this.username = username;
        this.completedBrokenPicFrames = completedBrokenPicFrames;
        this.completedMusicBox = completedMusicBox;
        this.completedTornPics = completedTornPics;
        this.completedDoor = completedDoor;
    }
    
    //changes the booleans
    public void setBrokenPicFramesTrue()
    {
        completedBrokenPicFrames = true;
    }
    public void setMusicBoxTrue()
    {
        completedMusicBox = true;
    }
    public void setTornPicsTrue()
    {
        completedTornPics = true;
    }
    public void setDoorTrue()
    {
        completedDoor= true;
    }
    
    
    //gets the username
    public String getUsername()
    {
        return username;
    }
    
    
    //puts all the properties of the object into a String
    public String getUser(String username)
    {
        String userProps = username + "#" + completedBrokenPicFrames + "#" + completedTornPics + "#" + completedMusicBox + "#" + completedDoor;
        return userProps;
    }

    @Override
    public String toString()
    {
       String output = username + "#" + completedBrokenPicFrames + "#" + completedTornPics + "#" + completedMusicBox + "#" + completedDoor;
       return output;
    }
    
    
}
