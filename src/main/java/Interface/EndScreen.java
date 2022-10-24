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
public class EndScreen extends javax.swing.JFrame
{
    //variables
    Games game = new Games();
    DataSheet dataSheet = new DataSheet(game.getCurrentUser());
    
    
    //creating form
    public EndScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        tbcLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbcLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        tbcLabel.setForeground(new java.awt.Color(255, 255, 255));
        tbcLabel.setText("To be continued...");
        getContentPane().add(tbcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 230, 60));

        exitButton.setBackground(new java.awt.Color(48, 29, 39));
        exitButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(114, 214, 206));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, -1));

        homeButton.setBackground(new java.awt.Color(48, 29, 39));
        homeButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(114, 214, 206));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EndScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //disposes this screen
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    //closes this screen and then resets everything; opens back at the options screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new UserScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel tbcLabel;
    // End of variables declaration//GEN-END:variables
}
