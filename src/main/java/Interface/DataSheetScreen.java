/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.DataSheetMethods;
/**
 *
 * @author megan
 */
public class DataSheetScreen extends javax.swing.JFrame
{
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

        doneButton.setBackground(new java.awt.Color(255, 255, 204));
        doneButton.setForeground(new java.awt.Color(0, 0, 0));
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 167, -1, -1));

        tornUpPicsInfoButton.setBackground(new java.awt.Color(255, 255, 204));
        tornUpPicsInfoButton.setForeground(new java.awt.Color(0, 0, 0));
        tornUpPicsInfoButton.setText("Torn up Pictures");
        tornUpPicsInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tornUpPicsInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tornUpPicsInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, -1, -1));

        musicBoxInfoButton.setBackground(new java.awt.Color(255, 255, 204));
        musicBoxInfoButton.setForeground(new java.awt.Color(0, 0, 0));
        musicBoxInfoButton.setText("Music box");
        musicBoxInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                musicBoxInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(musicBoxInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 98, -1, -1));

        brokenPicFramesInfoButton.setBackground(new java.awt.Color(255, 255, 204));
        brokenPicFramesInfoButton.setForeground(new java.awt.Color(0, 0, 0));
        brokenPicFramesInfoButton.setText("Broken picture frame");
        brokenPicFramesInfoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brokenPicFramesInfoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(brokenPicFramesInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, -1, -1));

        headingLabel.setFont(new java.awt.Font("Juice ITC", 1, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(0, 0, 0));
        headingLabel.setText("Data:");
        getContentPane().add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 113, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dataSheetBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 210));

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
        DataSheetMethods.game = "tornUpPics";
        this.dispose();
        new InfoScreen().setVisible(true);
    }//GEN-LAST:event_tornUpPicsInfoButtonActionPerformed

    private void musicBoxInfoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_musicBoxInfoButtonActionPerformed
    {//GEN-HEADEREND:event_musicBoxInfoButtonActionPerformed
        //to know what option the user picked and what data to fetch
        DataSheetMethods.game = "musicBox";
        this.dispose();
        new InfoScreen().setVisible(true);
    }//GEN-LAST:event_musicBoxInfoButtonActionPerformed

    private void brokenPicFramesInfoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brokenPicFramesInfoButtonActionPerformed
    {//GEN-HEADEREND:event_brokenPicFramesInfoButtonActionPerformed
        //to know what option the user picked and what data to fetch
        DataSheetMethods.game = "brokenPicFrames";
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
