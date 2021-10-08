/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import Interface.TaskCompletedScreen;
import Interface.TaskFailedScreen;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class RiddleMethods
{
    //variables
    public static int lives = 3;
    public static boolean winOrLose = false;
    
    
    
    //resetes variables to their original values
    public static void reset()
    {
        lives = 3;
        winOrLose = false;
    }
    
    
    //gets input from the text area
    public static String getInput(JTextArea inputTextArea)
    {
        String input = inputTextArea.getText();
        return input;
    }
    
    
    //checks if the answer is right
    public static void rightWrongCheck(String userInput, JTextArea inputTextArea)
    {
        //right answer
        if(userInput.equals("seven")||userInput.equals("Seven")||userInput.equals("7"))
        {
            new TaskCompletedScreen().setVisible(true);
            //setting the completed variable to true (for data sheet)
            DataSheetMethods.completedBrokenPicFrames = true;
            //setting the winOrLose variable to true to be used to close the screen
            winOrLose = true;
        }
        
        //wrong answer
        else
        {
            //clearing the inputTextArea for the user to try again with
            inputTextArea.setText("");
            //subtracting from number of lives
            lives--;
            //check if the user has lost the game
            if(lives == 0)
            {
                new TaskFailedScreen().setVisible(true);
                //setting the winOrLose variable to true to be used to close the screen
                winOrLose = true;
            }
        }
    }
}
