/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Interface.TaskCompletedScreen;
import Interface.TaskFailedScreen;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author megan
 */
public class Games
{
    //all game variables and objects
    private UserManager userManager = new UserManager();
    private ArrayList <User> currentArrayList = userManager.getUsers();
    private int currentUserIndex = UserManager.getCurrentUserIndex();
    private User currentUser = userManager.getSelectedUser(currentUserIndex);
    private DataSheet dataSheet = new DataSheet(currentUser);

    //getters
    public  User getCurrentUser()
    {
        return currentUser;
    }
    
    //updates the current array list to comply with the new info
    private void updateCurrentArrayList()
    {
        currentArrayList.remove(currentUserIndex);
        currentArrayList.add(currentUserIndex, currentUser);
    }
    
    
    
    
    
    
    //HANGMAN
    //variables
    private final String[] correctWordArray = {"b", "u", "t", "t", "e", "r", "f", "l", "y"};
    private final String correctWordString = "butterfly";
    private final int correctWordLength = correctWordString.length();
    private String[] usersWordArray = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
    private String wrongAnswers = "";
    private int numWrongAnswers = 0;
    private int progressBarValue = 0;
    private static boolean hangmanWin = false;

    
    
    //getters
    //converts the userArray into a string and returns that string
    public String getDisplayString()
    {
        //variables
        String displayString = "";
        //adding all the letters from the userArray into a string
        for(int arrayPosition = 0; arrayPosition < 9; arrayPosition++)
        {
           displayString += usersWordArray[arrayPosition] + " "; 
        }
        
        return displayString;
    }
    public String getWrongAnswers()
    {
        return wrongAnswers;
    }
    public boolean isHangmanWin()
    {
        return hangmanWin;
    }
    public int getProgressBarValue()
    {
        return progressBarValue;
    }
    
    
    
    //resets to original values
    public void resetHangman()
    {
        //resets everything in the  user array
        for(int arrayPos = 0; arrayPos < 9; arrayPos++)
        {
            usersWordArray[arrayPos] = "_";
        }
 
        //resetting to original values
        numWrongAnswers = 0;
        hangmanWin = false;
        wrongAnswers = "";
    }
    
    
    
    //checks if the letter is a part of the word and updates the screen
    public void letterCheck(String inputLetter)
    {
        //variables
        int numRight = 0;
        
        //checks through each postion of the completedWordArray individually
        for(int arrayPos = 0; arrayPos < correctWordLength; arrayPos++)
        {
            //correct letter
            if(correctWordArray[arrayPos].equals(inputLetter))
            {
                usersWordArray[arrayPos] = inputLetter;
                numRight++;
            }
            
        }
        //wrong letter
        if(numRight == 0)
        {
            wrongAnswers+=inputLetter + ", ";
            numWrongAnswers++;
            progressBarValue = numWrongAnswers*20;
        }
    }
    
    
    
    //checks if the user has user up all their chances
    public void hangmanWinCheck()        
    {
        //win
        if(Arrays.equals(correctWordArray, usersWordArray))
        {
            new TaskCompletedScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            dataSheet.setCompletedMusicBox(true);
            //setting the winOrLose variable to true to be used to close the screen
            hangmanWin = true;
            
            //sets the user objects variable to be true and changes the information
            currentUser.setMusicBoxTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
        
        //lose
        //the user only gets 5 chances
        if(numWrongAnswers  == 5)
        {
            new TaskFailedScreen().setVisible(true);
            //setting the winOrLose variable to true to be used to close the screen
            hangmanWin = true;
        }
    }
    
    
    
    
    
    //PUZZLE
    //class variables
    private static String[] currentPicOrder = {"/images/4.jpg", "/images/1.jpg", "/images/0.jpg", "/images/3.jpg", "/images/2.jpg", "/images/5.jpg"};
    private static String[] frameStr = {"frame0", "frame1", "frame2", "frame3", "frame4", "frame5"};
    private boolean puzzleWin = false;
    
    
    
    //gets the current picture being presented on a specific jbutton
    public String getPic(String screenStr)
    {
        //getting the screen number
        int screenNumber = getScreenNumber(screenStr);
        
        //setting the image to screenIcon
        String screenIcon = currentPicOrder[screenNumber];
        
        //returning screenIcon to be able to use the file paths of the images
        return screenIcon;   
    }
    
    //gets the value of 'win'
    public boolean isPuzzleWin()
    {
        return puzzleWin;
    }
    
    //screen number 
    public int getScreenNumber(String screenStr)
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

    //gets the current picture order
    public String[] getCurrentPicOrder()
    {
        return currentPicOrder;
    }   
    
    //finds what position the blank picture(pic2) is currently in
    public int getBlankPicPos()
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
    
    
    //swaps two buttons' pictures
    //helper method to framePicSwap
    private void pictureSwap(JButton button1, JButton button2, String button1Str, String button2Str)
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
    
    
    //swaps the pics depending on which frame they are in
    public void framePicSwap(int frameNum, int blankPicFrame, JButton frame0, JButton frame1, JButton frame2, JButton frame3, JButton frame4, JButton frame5)
    {
        //making a swappics object
        Games swapPics = new Games();       
        
        //only swapping pics if the blank space is next to frame0 (frame1, frame3)
        if(frameNum == 0)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame0, frame1, frameStr[0], frameStr[1]);
                case 3 -> //swapping the pictures
                    swapPics.pictureSwap(frame0, frame3, frameStr[0], frameStr[3]);
            }
        }
        
        //only swapping pics if the blank space is next to frame1 (frame0, frame2, frame4)
        if(frameNum == 1)
        {        
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame0, frameStr[1], frameStr[0]);
                case 2 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame2, frameStr[1], frameStr[2]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame1, frame4, frameStr[1], frameStr[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame2 (frame1, frame5)
        if(frameNum == 2)
        {           
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame2, frame1, frameStr[2], frameStr[1]);
                case 5 -> //swapping the pictures
                    swapPics.pictureSwap(frame2, frame5, frameStr[2], frameStr[5]);
            }
        }
        
        //only swapping pics if the blank space is next to frame3 (frame0, frame4)
        if(frameNum == 3)
        {            
            switch (blankPicFrame)
            {
                case 0 -> //swapping the pictures
                    swapPics.pictureSwap(frame3, frame0, frameStr[3], frameStr[0]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame3, frame4, frameStr[3], frameStr[4]);
            }
        }
        
        //only swapping pics if the blank space is next to frame4 (frame1, frame3, frame5)        
        if(frameNum == 4)
        {
            switch (blankPicFrame)
            {
                case 1 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame1, frameStr[4], frameStr[1]);
                case 3 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame3, frameStr[4], frameStr[3]);
                case 5 -> //swapping the pictures
                    swapPics.pictureSwap(frame4, frame5, frameStr[4], frameStr[5]);
            }        
        }
        
        //only swapping pics if the blank space is next to frame5 (frame2, frame4)
        if(frameNum == 5)
        {
            switch (blankPicFrame)
            {
                case 2 -> //swapping the pictures
                    swapPics.pictureSwap(frame5, frame2, frameStr[5], frameStr[2]);
                case 4 -> //swapping the pictures
                    swapPics.pictureSwap(frame5, frame4, frameStr[5], frameStr[4]);
            }
        }
    }
    
    
    //checks if the order that the user has arranged the pictures in is the exact way they are supposed to be arranged
    public void puzzleWinCheck()
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
            dataSheet.setCompletedTornPics(true);
            //setting the win variable to true to be used to close the screen
            puzzleWin = true;
            //sets the user objects variable to be true
            currentUser.setTornPicsTrue();
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
    }
    
    
    //resets to original values
    public void resetPuzzle()
    {
        //original picture set up
        currentPicOrder[0] = "/images/4.jpg";
        currentPicOrder[1] = "/images/1.jpg";
        currentPicOrder[2] = "/images/0.jpg";
        currentPicOrder[3] = "/images/3.jpg";
        currentPicOrder[4] = "/images/2.jpg";
        currentPicOrder[5] = "/images/5.jpg";
        
        //setting to the win variable to false
        puzzleWin = false;
    }
    
    
    
    
    
    
    //RIDDLE
    //variables
    private static int lives = 3;
    private boolean riddleWin = false;
    
    
    //getters
    public boolean isRiddleWin()
    {
        return riddleWin;
    }

    
    //resetes variables to their original values
    public void resetRiddle()
    {
        lives = 3;
        riddleWin = false;
    }
    
    
    //checks if the answer is right
    public void rightWrongCheck(String userInput)
    {
        //right answer
        if(userInput.equals("seven")||userInput.equals("Seven")||userInput.equals("7"))
        {
            new TaskCompletedScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            dataSheet.setCompletedBrokenPicFrames(true);
            //setting the winOrLose variable to true to be used to close the screen
            riddleWin = true;
            //sets the user objects variable to be true
            currentUser.setBrokenPicFramesTrue();
            updateCurrentArrayList();
            userManager.setUsers(currentArrayList);
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
        
        //wrong answer
        else
        {
            //subtracting from number of lives
            lives--;
            //check if the user has lost the game
            if(lives == 0)
            {
                new TaskFailedScreen().setVisible(true);
                //setting the riddleWin variable to true to be used to close the screen
                riddleWin = true;
            }
        }
    }
    
    
    
    //DOORCODE
    //variables
    private String[] userCode = {"", "", ""};
    private final String[] correctCode = {"7", "9", "6"}; //in the order of longest word length to shortest wordlength
    private boolean doorCodeWin = false;
    
    
    //getters
    public String[] getUserCode()
    {
        return userCode;
    }
    public boolean isDoorCodeWin()
    {
        return doorCodeWin;
    }
    
    
    //adds to the user code depending on the button that was pressed
    public void addNumber(int buttonPressed)
    {
        //only adds the number if the array position is empty
        for(int arrayPos = 0; arrayPos < 3; arrayPos++)
        {
            if(userCode[arrayPos].equals(""))
            {
                userCode[arrayPos] = buttonPressed + "";
                break;
            }
        } 
    }
    
    
    //resets everything
    public void resetDoorCode()
    {
        for(int arrayPos = 0; arrayPos < 3; arrayPos++)
        {
            userCode[arrayPos] = "";
        }
    }
    
    
    
    //checks if the answer is right ot wrong
    public void riddleWinCheck()
    {
        //variables
        int numCorrect = 0;
        
        //goes through all positions in the arrays and sees if they are the same
        for(int arrayPos = 0; arrayPos < 3; arrayPos++)
        {
            if(userCode[arrayPos].equals(correctCode[arrayPos]))
            {
                numCorrect++;
            }           
        }
        
        //win
        if(numCorrect == 3)
        {
            new TaskCompletedScreen().setVisible(true);
            //setting the win variable to true to be used to close the screen
            doorCodeWin = true;
            //sets the user objects variable to be true
            currentUser.setDoorTrue();
            userManager.save(UserManager.getCurrentUserIndex(), currentUser);
        }
        //lose
        else
        {
            resetDoorCode();
        }
    }
}
