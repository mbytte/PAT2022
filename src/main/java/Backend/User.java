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
    private final String username;
    private boolean completedBrokenPicFrames;
    private boolean completedMusicBox;
    private boolean completedTornPics;
    private boolean completedDoor;
    
    //variables
    private static int currentUserIndex;
    
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
    public static void setCurrentUserIndex(int index)
    {
        currentUserIndex = index;
    }
    
    
    //gettters
    public String getUsername()
    {
        return username;
    }
    public static int getCurrentUserIndex()
    {
        return currentUserIndex;
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
