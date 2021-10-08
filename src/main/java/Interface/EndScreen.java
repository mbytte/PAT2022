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
public class EndScreen extends javax.swing.JFrame
{
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
        replayButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbcLabel.setFont(new java.awt.Font("Juice ITC", 1, 36)); // NOI18N
        tbcLabel.setForeground(new java.awt.Color(0, 0, 0));
        tbcLabel.setText("To be continued...");
        getContentPane().add(tbcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 60));

        exitButton.setBackground(new java.awt.Color(255, 204, 153));
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        replayButton.setBackground(new java.awt.Color(255, 204, 153));
        replayButton.setForeground(new java.awt.Color(0, 0, 0));
        replayButton.setText("Replay");
        replayButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                replayButtonActionPerformed(evt);
            }
        });
        getContentPane().add(replayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //disposes this screen
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_exitButtonActionPerformed
    {//GEN-HEADEREND:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    //closes this screen and then resets everything; opens back at the options screen
    private void replayButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_replayButtonActionPerformed
    {//GEN-HEADEREND:event_replayButtonActionPerformed
        this.dispose();
        DataSheetMethods.reset();
        new OptionsScreen().setVisible(true);
    }//GEN-LAST:event_replayButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton replayButton;
    private javax.swing.JLabel tbcLabel;
    // End of variables declaration//GEN-END:variables
}
