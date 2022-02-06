/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import Interface.*;
import java.util.Arrays;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class HangmanMethods
{
    //variables
    public static String[] completedWordArray = {"b", "u", "t", "t", "e", "r", "f", "l", "y"};
    public static String completedWordStr = "butterfly";
    public static int completedWordLength = completedWordStr.length();
    public static String[] userArray = {"_", "_", "_", "_", "_", "_", "_", "_", "_"};
    public static String wrongAnswers = "";
    public static int numWrongAnswers = 0;
    public static boolean winOrLose = false;
    
    
    
    //resets to original values
    public static void reset()
    {
        //resets everything in the  user array
        for(int arrayPos = 0; arrayPos < 9; arrayPos++)
        {
            userArray[arrayPos] = "_";
        }
 
        //resetting to original values
        numWrongAnswers = 0;
        winOrLose = false;
        wrongAnswers = "";
    }
    
    
    
    //checks if the letter is a part of the word and updates the screen
    public static void letterCheck(String inputLetter, JProgressBar progressBar)
    {
        //variables
        int numRight = 0;
        
        //checks through each postion of the completedWordArray individually
        for(int arrayPos = 0; arrayPos < completedWordLength; arrayPos++)
        {
            //correct letter
            if(completedWordArray[arrayPos].equals(inputLetter))
            {
                userArray[arrayPos] = inputLetter;
                numRight++;
            }
            
        }
        //wrong letter
        if(numRight == 0)
        {
            wrongAnswers+=inputLetter + ", ";
            numWrongAnswers++;
            progressBar.setValue(numWrongAnswers*20);
        }
    }
    
    
    
    //updates all the text areas on the screen
    public static void updateScreen(JTextArea rightAnswersTextArea, JTextArea wrongAnswersTextArea, JTextArea guessingTextArea, JProgressBar progressBar)
    {
        //right answer display being updated
        //variables
        String text = "";
        //adding all the letters from the userArray into a string
        for(int arrayPosition = 0; arrayPosition < 9; arrayPosition++)
        {
           text += userArray[arrayPosition] + " "; 
        }
        //setting the textarea to have new updated text
        rightAnswersTextArea.setText(text);
        
        
        //wrong answer display being updated 
        //setting the textarea to have new updated text
        wrongAnswersTextArea.setText(wrongAnswers);
        
        
        //clearing the guessing text area so the user doesn't have to remove the letter they already inputted
        guessingTextArea.setText("");   
        
        
        //updating the progress bar
        progressBar.repaint();
    }
    
    
    //checks if the user has user up all their chances
    public static void WinLoseCheck()        
    {
        //win
        if(Arrays.equals(completedWordArray, userArray))
        {
            new TaskCompletedScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            DataSheetMethods.completedMusicBox = true;
            //setting the winOrLose variable to true to be used to close the screen
            winOrLose = true;
        }
        
        //lose
        //the user  only gets 5 chances
        if(numWrongAnswers  == 5)
        {
            new TaskFailedScreen().setVisible(true);
            //setting the winOrLose variable to true to be used to close the screen
            winOrLose = true;
        }
    }
}
