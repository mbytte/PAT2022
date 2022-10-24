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
public class TaskFailedScreen extends javax.swing.JFrame
{
    //creating form
    public TaskFailedScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        taskFailedLabel = new javax.swing.JLabel();
        retryButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taskFailedLabel.setBackground(new java.awt.Color(48, 29, 39));
        taskFailedLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        taskFailedLabel.setForeground(new java.awt.Color(151, 36, 80));
        taskFailedLabel.setText("TASK FAILED");
        taskFailedLabel.setOpaque(true);
        getContentPane().add(taskFailedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        retryButton.setBackground(new java.awt.Color(48, 29, 39));
        retryButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        retryButton.setForeground(new java.awt.Color(151, 36, 80));
        retryButton.setText("RETRY");
        retryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                retryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(retryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        homeButton.setBackground(new java.awt.Color(48, 29, 39));
        homeButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(151, 36, 80));
        homeButton.setText("HOME");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TaskFailedScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //takes you back to options screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_retryButtonActionPerformed
    {//GEN-HEADEREND:event_retryButtonActionPerformed
        this.dispose();
        ChangingScreenMethods screenMethods = new ChangingScreenMethods();
        screenMethods.openPreviousGame();
    }//GEN-LAST:event_retryButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JLabel taskFailedLabel;
    // End of variables declaration//GEN-END:variables
}
