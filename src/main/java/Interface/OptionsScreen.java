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
    //creating form
    public OptionsScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting all the option variables to false (variables in Screenmethods)
        ChangingScreenMethods.resetOptionVariables();          
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        screenTitle = new javax.swing.JLabel();
        dataSheetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        tornUpPicturesOption = new javax.swing.JButton();
        musicBoxOption = new javax.swing.JButton();
        doorOption = new javax.swing.JButton();
        brokenPictureFramesOption = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screenTitle.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        screenTitle.setForeground(new java.awt.Color(255, 255, 255));
        screenTitle.setText("Pick what you would like to investigate");
        getContentPane().add(screenTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dataSheetButton.setBackground(new java.awt.Color(102, 102, 102));
        dataSheetButton.setText("Data sheet");
        dataSheetButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                dataSheetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dataSheetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        exitButton.setBackground(new java.awt.Color(102, 102, 102));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        tornUpPicturesOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tornUpPicturesOption.setContentAreaFilled(false);
        tornUpPicturesOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tornUpPicturesOptionActionPerformed(evt);
            }
        });
        getContentPane().add(tornUpPicturesOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 160, 40));

        musicBoxOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musicBox.png"))); // NOI18N
        musicBoxOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        musicBoxOption.setContentAreaFilled(false);
        musicBoxOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                musicBoxOptionActionPerformed(evt);
            }
        });
        getContentPane().add(musicBoxOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 80, 80));

        doorOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        doorOption.setContentAreaFilled(false);
        doorOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doorOptionActionPerformed(evt);
            }
        });
        getContentPane().add(doorOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 80, 170));

        brokenPictureFramesOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brokenPictureFrame.jpg"))); // NOI18N
        brokenPictureFramesOption.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brokenPictureFramesOption.setContentAreaFilled(false);
        brokenPictureFramesOption.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brokenPictureFramesOptionActionPerformed(evt);
            }
        });
        getContentPane().add(brokenPictureFramesOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 70, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brokenDownRoom.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //button pressed actions
    //game buttons
    //opens the data sheet
    private void dataSheetButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_dataSheetButtonActionPerformed
    {//GEN-HEADEREND:event_dataSheetButtonActionPerformed
        new DataSheetScreen().setVisible(true);
    }//GEN-LAST:event_dataSheetButtonActionPerformed

    //closes this screen and exits the game
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    
    //options
    private void tornUpPicturesOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tornUpPicturesOptionActionPerformed
    {//GEN-HEADEREND:event_tornUpPicturesOptionActionPerformed
        //setting the tornUpPicturesOption variable to true
        ChangingScreenMethods.tornUpPicturesOption = true;
        //opening and disposing screens
        new AreaInformationScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tornUpPicturesOptionActionPerformed

    private void musicBoxOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_musicBoxOptionActionPerformed
    {//GEN-HEADEREND:event_musicBoxOptionActionPerformed
        //setting the musicBoxOption variable to true
        ChangingScreenMethods.musicBoxOption = true;
        //opening and disposing screens
        new AreaInformationScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_musicBoxOptionActionPerformed

    private void doorOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doorOptionActionPerformed
    {//GEN-HEADEREND:event_doorOptionActionPerformed
        //setting the door variable to true
        ChangingScreenMethods.doorOption = true;
        //opening and disposing screens
        new AreaInformationScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doorOptionActionPerformed

    private void brokenPictureFramesOptionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brokenPictureFramesOptionActionPerformed
    {//GEN-HEADEREND:event_brokenPictureFramesOptionActionPerformed
        //setting the brokenPictureFrame variable to true
        ChangingScreenMethods.brokenPictureFramesOption = true;
        //opening and disposing screens
        new AreaInformationScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brokenPictureFramesOptionActionPerformed

    
    
    //main method
    public static void main(String args[])
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new OptionsScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton brokenPictureFramesOption;
    private javax.swing.JButton dataSheetButton;
    private javax.swing.JButton doorOption;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton musicBoxOption;
    private javax.swing.JLabel screenTitle;
    private javax.swing.JButton tornUpPicturesOption;
    // End of variables declaration//GEN-END:variables
}
