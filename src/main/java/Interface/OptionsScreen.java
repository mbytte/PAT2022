/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.*;
/**
 *
 * @author megan
 */
public class OptionsScreen extends javax.swing.JFrame
{
    //variables
    ChangingScreenMethods screenMethods = new ChangingScreenMethods();
    
    //creating form
    public OptionsScreen()
    {
        initComponents();
        setLocationRelativeTo (null);    
        
        //making sure all the destinantion variables are set to false so the correct screens will be presented
        screenMethods.resetOptionVariables();
    }

    
   
     //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        homeButton = new javax.swing.JButton();
        dataSheetButton = new javax.swing.JButton();
        tornUpPicturesOption = new javax.swing.JButton();
        musicBoxOption = new javax.swing.JButton();
        doorOption = new javax.swing.JButton();
        brokenPictureFramesOption = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setBackground(new java.awt.Color(48, 29, 39));
        homeButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        homeButton.setForeground(new java.awt.Color(114, 214, 206));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 80, 30));

        dataSheetButton.setBackground(new java.awt.Color(48, 29, 39));
        dataSheetButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dataSheetButton.setForeground(new java.awt.Color(114, 214, 206));
        dataSheetButton.setText("DATA SHEET");
        dataSheetButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dataSheetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dataSheetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 10, 120, 30));

        tornUpPicturesOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tornUpPicturesOption.setContentAreaFilled(false);
        tornUpPicturesOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tornUpPicturesOptionActionPerformed(evt);
            }
        });
        getContentPane().add(tornUpPicturesOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 190, 190));

        musicBoxOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musicBoxOption.setContentAreaFilled(false);
        musicBoxOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                musicBoxOptionActionPerformed(evt);
            }
        });
        getContentPane().add(musicBoxOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 80, 80));

        doorOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doorOption.setContentAreaFilled(false);
        doorOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doorOptionActionPerformed(evt);
            }
        });
        getContentPane().add(doorOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 90, 100));

        brokenPictureFramesOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brokenPictureFramesOption.setContentAreaFilled(false);
        brokenPictureFramesOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brokenPictureFramesOptionActionPerformed(evt);
            }
        });
        getContentPane().add(brokenPictureFramesOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 130));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OptionsScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //button pressed actions
    //game buttons
    //opens the data sheet
    private void dataSheetButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dataSheetButtonActionPerformed
    {//GEN-HEADEREND:event_dataSheetButtonActionPerformed
        new DataSheetScreen().setVisible(true);
    }//GEN-LAST:event_dataSheetButtonActionPerformed

    
    
    //options
    private void tornUpPicturesOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tornUpPicturesOptionActionPerformed
    {//GEN-HEADEREND:event_tornUpPicturesOptionActionPerformed
        //setting the tornUpPicturesOption variable to true
        screenMethods.setTornPicsOption(true);
        //opening and disposing screens
        new AreaInfoScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tornUpPicturesOptionActionPerformed

    private void musicBoxOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_musicBoxOptionActionPerformed
    {//GEN-HEADEREND:event_musicBoxOptionActionPerformed
        //setting the musicBoxOption variable to true
        screenMethods.setMusicBoxOption(true);
        //opening and disposing screens
        new AreaInfoScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_musicBoxOptionActionPerformed

    private void doorOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doorOptionActionPerformed
    {//GEN-HEADEREND:event_doorOptionActionPerformed
        //setting the door variable to true
        screenMethods.setDoorOption(true);
        //opening and disposing screens
        new AreaInfoScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doorOptionActionPerformed

    private void brokenPictureFramesOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brokenPictureFramesOptionActionPerformed
    {//GEN-HEADEREND:event_brokenPictureFramesOptionActionPerformed
        //setting the brokenPictureFrame variable to true
        screenMethods.setBrokenPicFramesOption(true);
        //opening and disposing screens
        new AreaInfoScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brokenPictureFramesOptionActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        //closing this screen and opening the home screen
        new UserScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton brokenPictureFramesOption;
    private javax.swing.JButton dataSheetButton;
    private javax.swing.JButton doorOption;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton musicBoxOption;
    private javax.swing.JButton tornUpPicturesOption;
    // End of variables declaration//GEN-END:variables
}
