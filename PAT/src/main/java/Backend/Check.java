/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author jilly
 */
public class Check
{
    public static void main(String[] args)
    {
        ScreenMethods.brokenPictureFramesOption = true;
        System.out.println(ScreenMethods.getStorylineFilepath());
        String storyline =ScreenMethods.getStoryline();
        System.out.println("test " + storyline);
        
        ScreenMethods.brokenPictureFramesOption = true;       
        String text = ScreenMethods.getStoryline();
        System.out.println(text);
    }
}
