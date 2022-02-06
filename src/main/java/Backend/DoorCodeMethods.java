/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;
import javax.swing.JTextField;
import Interface.TaskCompletedScreen;
/**
 *
 * @author megan
 */
public class DoorCodeMethods
{
    //variables
    public static String[] userCode = {"", "", ""};
    public static String[] correctCode = {"7", "9", "6"}; //in the order of longest word length to shortest wordlength
    public static boolean win = false;
    
    
    //adds to the user code depending on the button that was pressed
    public static void addNumber(int buttonPressed)
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
    
    
    //displays the output
    public static void updateDisplay(JTextField num1Display, JTextField num2Display, JTextField num3Display)
    {
        num1Display.setText(userCode[0]);
        num2Display.setText(userCode[1]);
        num3Display.setText(userCode[2]);
    }
    
    
    //resets everything
    public static void reset()
    {
        for(int arrayPos = 0; arrayPos < 3; arrayPos++)
        {
            userCode[arrayPos] = "";
        }
    }
    
    
    
    //checks if the answer is right ot wrong
    public static void winLoseCheck()
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
            win = true;
        }
        //lose
        else
        {
            reset();
        }
    }
}
