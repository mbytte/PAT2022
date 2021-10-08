/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Meganl
 */
public class TaskCompletedScreen extends javax.swing.JFrame 
{
    //creating form
    public TaskCompletedScreen() 
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        headingLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headingLabel.setFont(new java.awt.Font("Juice ITC", 1, 48)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(204, 102, 0));
        headingLabel.setText("TASK COMPLETE!");
        getContentPane().add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 80));

        nextButton.setBackground(new java.awt.Color(204, 102, 0));
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/taskCompleteBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //opens storyline screen and disposes this screen
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        new StorylineScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
