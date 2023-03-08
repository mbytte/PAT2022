/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author megan
 */
public class User
{
    //object properties
    //CHANGE THE VARIABLE NAMES TO BE BASED ON THE TYPE OF GAME (e.g. hangman)
    //need to add an ID number here to be referenced in the database
    private final String username;
    private boolean completedBrokenPicFrames;
    private boolean completedMusicBox;
    private boolean completedTornPics;
    private boolean completedDoor;
    
    
    //constructor
    public User(String username, boolean completedBrokenPicFrames, boolean completedTornPics , boolean completedMusicBox, boolean completedDoor)
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
    
    
    
    //gettters
    public String getUsername()
    {
        return username;
    }
    public boolean isCompletedBrokenPicFrames()
    {
        return completedBrokenPicFrames;
    }
    public boolean isCompletedMusicBox()
    {
        return completedMusicBox;
    }
    public boolean isCompletedTornPics()
    {
        return completedTornPics;
    }
    public boolean isCompletedDoor()
    {
        return completedDoor;
    }
    
    
    
    @Override
    public String toString()
    {
       String output = username + "#" + completedBrokenPicFrames + "#" + completedTornPics + "#" + completedMusicBox + "#" + completedDoor;
       return output;
    }
}
