/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.DataSheet;
import Backend.Games;
/**
 *
 * @author megan
 */
public class DataSheetScreen extends javax.swing.JFrame
{
    //variables
    Games game = new Games();
    DataSheet dataSheet = new DataSheet(game.getCurrentUser());
    
    
    //creating form
    public DataSheetScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        doneButton = new javax.swing.JButton();
        tornUpPicsInfoButton = new javax.swing.JButton();
        musicBoxInfoButton = new javax.swing.JButton();
        brokenPicFramesInfoButton = new javax.swing.JButton();
        headingLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doneButton.setBackground(new java.awt.Color(48, 39, 39));
        doneButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        doneButton.setForeground(new java.awt.Color(114, 214, 206));
        doneButton.setText("<-");
        doneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        tornUpPicsInfoButton.setBackground(new java.awt.Color(48, 29, 39));
        tornUpPicsInfoButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tornUpPicsInfoButton.setForeground(new java.awt.Color(114, 214, 206));
        tornUpPicsInfoButton.setText("PUZZLE");
        tornUpPicsInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tornUpPicsInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tornUpPicsInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 20));

        musicBoxInfoButton.setBackground(new java.awt.Color(48, 29, 39));
        musicBoxInfoButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        musicBoxInfoButton.setForeground(new java.awt.Color(114, 214, 206));
        musicBoxInfoButton.setText("HANGMAN");
        musicBoxInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                musicBoxInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(musicBoxInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 20));

        brokenPicFramesInfoButton.setBackground(new java.awt.Color(48, 29, 39));
        brokenPicFramesInfoButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        brokenPicFramesInfoButton.setForeground(new java.awt.Color(114, 214, 206));
        brokenPicFramesInfoButton.setText("RIDDLE");
        brokenPicFramesInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brokenPicFramesInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(brokenPicFramesInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 20));

        headingLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(255, 255, 255));
        headingLabel.setText("DATA");
        getContentPane().add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 80, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataSheetScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //closes the screen
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doneButtonActionPerformed
    {//GEN-HEADEREND:event_doneButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    //closes this screen and opens the information screen
    private void tornUpPicsInfoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tornUpPicsInfoButtonActionPerformed
    {//GEN-HEADEREND:event_tornUpPicsInfoButtonActionPerformed
        //to know what option the user picked and what data to fetch
        dataSheet.setGame("tornUpPics");
        this.dispose();
        new InfoScreen().setVisible(true);
    }//GEN-LAST:event_tornUpPicsInfoButtonActionPerformed

    private void musicBoxInfoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_musicBoxInfoButtonActionPerformed
    {//GEN-HEADEREND:event_musicBoxInfoButtonActionPerformed
        //to know what option the user picked and what data to fetch
        dataSheet.setGame("musicBox");
        this.dispose();
        new InfoScreen().setVisible(true);
    }//GEN-LAST:event_musicBoxInfoButtonActionPerformed

    private void brokenPicFramesInfoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brokenPicFramesInfoButtonActionPerformed
    {//GEN-HEADEREND:event_brokenPicFramesInfoButtonActionPerformed
        //to know what option the user picked and what data to fetch
        dataSheet.setGame("brokenPicFrames");
        this.dispose();
        new InfoScreen().setVisible(true);
    }//GEN-LAST:event_brokenPicFramesInfoButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton brokenPicFramesInfoButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton musicBoxInfoButton;
    private javax.swing.JButton tornUpPicsInfoButton;
    // End of variables declaration//GEN-END:variables
}
