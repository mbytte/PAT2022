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

        taskFailedLabel.setFont(new java.awt.Font("Juice ITC", 1, 48)); // NOI18N
        taskFailedLabel.setForeground(new java.awt.Color(153, 153, 153));
        taskFailedLabel.setText("TASK FAILED");
        getContentPane().add(taskFailedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 191, 63));

        retryButton.setBackground(new java.awt.Color(51, 51, 51));
        retryButton.setForeground(new java.awt.Color(0, 0, 0));
        retryButton.setText("Retry");
        retryButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                retryButtonActionPerformed(evt);
            }
        });
        getContentPane().add(retryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 110, -1, -1));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setForeground(new java.awt.Color(0, 0, 0));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/taskFailedBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 160));

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
        ChangingScreenMethods.openPreviousGame();
    }//GEN-LAST:event_retryButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JLabel taskFailedLabel;
    // End of variables declaration//GEN-END:variables
}
