/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Meganl
 */
public class PuzzleMethods 
{   
    //CLASS 
    //class variables
    public static String[] currentPicOrder = {"/images/4.jpg", "/images/1.jpg", "/images/0.jpg", "/images/3.jpg", "/images/2.jpg", "/images/5.jpg"};
    public static String[] frameStr = {"frame0", "frame1", "frame2", "frame3", "frame4", "frame5"};
    public static boolean win = false;
    
    //METHODS
    //gets the current picture being presented on a specific jbutton
    public static String getPic(String screenStr)
    {
        //getting the screen number
        int screenNumber = getScreenNumber(screenStr);
        
        //setting the image to screenIcon
        String screenIcon = currentPicOrder[screenNumber];
        
        //returning screenIcon to be able to use the file paths of the images
        return screenIcon;   
    }
    
    
    //screen number 
    public static int getScreenNumber(String screenStr)
    {
        int screenNumber = 0;
        //getting the screen number depending on which screen is in question
        switch (screenStr)
        {
            case "frame1" -> screenNumber = 1;
            case "frame2" -> screenNumber = 2;
            case "frame3" -> screenNumber = 3;
            case "frame4" -> screenNumber = 4;
            case "frame5" -> screenNumber = 5;
            //no default because it will never be used
        }
        return screenNumber;
    }
    
    
    //swaps two buttons' pictures
    public void pictureSwap(JButton button1, JButton button2, String button1Str, String button2Str)
    {    
        //getting the image icons in those current buttons
        String button1Icon = getPic(button1Str);
        String button2Icon = getPic(button2Str);
        
        //setting the icons
        button2.setIcon(new ImageIcon(getClass().getResource(button1Icon)));
        button1.setIcon(new ImageIcon(getClass().getResource(button2Icon)));
        
        //setting the current image array to be updated according to what images are there
        int btn1ScreenNumber = getScreenNumber(button1Str);
        currentPicOrder[btn1ScreenNumber] = button2Icon;
        int btn2ScreenNumber = getScreenNumber(button2Str);
        currentPicOrder[btn2ScreenNumber] = button1Icon;
    }
    
    
    //finds what position the blank picture(pic2) is currently in
    public static int getBlankPicPos()
    {
        //variables
        int blankPicPos = 0;
        String blankPic = "/images/2.jpg";  //the blank picture is saved as "/images/2.jpg"
        
        //looking through all the positions in the ray to find which one is the blank picture
        //loops 6 times because there are 6 positions
        for(int i = 0; i < 6; i++)
        {
            if(blankPic.equals(currentPicOrder[i]))
            {
                blankPicPos = i;
            }
        }    
        return blankPicPos;
    }
    
    
    //swaps the pics depending on which frame they are in
    public static void framePicSwap(int frameNum, int blankPicFrame, JButton frame0, JButton frame1, JButton frame2, JButton frame3, JButton frame4, JButton frame5)
    {
        //making a swappics object
        PuzzleMethods SwapPics;
        SwapPics = new PuzzleMethods();       
        
        //only swapping pics if the blank space is next to frame0 (frame1, frame3)
        if(frameNum == 0)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    SwapPics.pictureSwap(frame0, frame1, frameStr[0], frameStr[1]);
                case 3 -> //swapping the pictures
                    SwapPics.pictureSwap(frame0, frame3, frameStr[0], frameStr[3]);
            }
        }
        
        //only swapping pics if the blank space is next to frame1 (frame0, frame2, frame4)
        if(frameNum == 1)
        {        
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    SwapPics.pictureSwap(frame1, frame0, frameStr[1], frameStr[0]);
                case 2 -> //swapping the pictures
                    SwapPics.pictureSwap(frame1, frame2, frameStr[1], frameStr[2]);
                case 4 -> //swapping the pictures
                    SwapPics.pictureSwap(frame1, frame4, frameStr[1], frameStr[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame2 (frame1, frame5)
        if(frameNum == 2)
        {           
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    SwapPics.pictureSwap(frame2, frame1, frameStr[2], frameStr[1]);
                case 5 -> //swapping the pictures
                    SwapPics.pictureSwap(frame2, frame5, frameStr[2], frameStr[5]);
            }
        }
        
        //only swapping pics if the blank space is next to frame3 (frame0, frame4)
        if(frameNum == 3)
        {            
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    SwapPics.pictureSwap(frame3, frame0, frameStr[3], frameStr[0]);
                case 4 -> //swapping the pictures
                    SwapPics.pictureSwap(frame3, frame4, frameStr[3], frameStr[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame4 (frame1, frame3, frame5)        
        if(frameNum == 4)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    SwapPics.pictureSwap(frame4, frame1, frameStr[4], frameStr[1]);
                case 3 -> //swapping the pictures
                    SwapPics.pictureSwap(frame4, frame3, frameStr[4], frameStr[3]);
                case 5 -> //swapping the pictures
                    SwapPics.pictureSwap(frame4, frame5, frameStr[4], frameStr[5]);
            }        
        }
        
        //only swapping pics if the blank space is next to frame5 (frame2, frame4)
        if(frameNum == 5)
        {
            switch (blankPicFrame)
            {
                case 2 -> //swapping the pictures
                    SwapPics.pictureSwap(frame5, frame2, frameStr[5], frameStr[2]);
                case 4 -> //swapping the pictures
                    SwapPics.pictureSwap(frame5, frame4, frameStr[5], frameStr[4]);
            }
        }
    }
    
    
    //checks if the order that the user has arranged the pictures in is the exact way they are supposed to be arranged
    public static void winCheck()
    {
        //variables
        //the order that the pictures should be arranged in in order for the player to win
        String[] correctOrder = new String[6];
        correctOrder[0] = "/images/0.jpg";
        correctOrder[1] = "/images/1.jpg";
        correctOrder[2] = "/images/2.jpg";
        correctOrder[3] = "/images/3.jpg";
        correctOrder[4] = "/images/4.jpg";
        correctOrder[5] = "/images/5.jpg";
        //changeable variable
        int numCorrectPicPlace = 0;
        
        
        //check to see if everything is the same
        for(int i = 0; i < 6; i++)
        {
            if(currentPicOrder[i].equals(correctOrder[i]))
            {
                numCorrectPicPlace++;
            }
        }
        
        //winning screen displayed if all the pictures were in the same place
        if(numCorrectPicPlace == 6)
        {
            new Interface.TaskCompletedScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            DataSheetMethods.completedTornPics = true;
            //setting the win variable to true to be used to close the screen
            win = true;
        }
    }
    
    
    //resets to original values
    public static void reset()
    {
        //original picture set up
        currentPicOrder[0] = "/images/4.jpg";
        currentPicOrder[1] = "/images/1.jpg";
        currentPicOrder[2] = "/images/0.jpg";
        currentPicOrder[3] = "/images/3.jpg";
        currentPicOrder[4] = "/images/2.jpg";
        currentPicOrder[5] = "/images/5.jpg";
        
        //setting to the win variable to false
        win = false;
    }
}
