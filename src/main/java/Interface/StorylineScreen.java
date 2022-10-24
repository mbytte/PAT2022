/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.ChangingScreenMethods;
/**
 *
 * @author Meganl
 */
public class StorylineScreen extends javax.swing.JFrame 
{
    //creating form
    public StorylineScreen() 
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting text to the information text area
        ChangingScreenMethods screenMethods = new ChangingScreenMethods();
        String storyline = screenMethods.getStoryline();
        storylineTextArea.setText(storyline);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jButton3 = new javax.swing.JButton();
        storylineScrollPane = new javax.swing.JScrollPane();
        storylineTextArea = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storylineTextArea.setEditable(false);
        storylineTextArea.setBackground(new java.awt.Color(48, 29, 39));
        storylineTextArea.setColumns(20);
        storylineTextArea.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        storylineTextArea.setForeground(new java.awt.Color(114, 214, 206));
        storylineTextArea.setLineWrap(true);
        storylineTextArea.setRows(5);
        storylineTextArea.setWrapStyleWord(true);
        storylineScrollPane.setViewportView(storylineTextArea);

        getContentPane().add(storylineScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 180));

        nextButton.setBackground(new java.awt.Color(48, 29, 39));
        nextButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(114, 214, 206));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataDisplayScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //takes user back to the options screen
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        this.dispose();
        ChangingScreenMethods screenMethods = new ChangingScreenMethods();
        screenMethods.openNextScreen();
        screenMethods.resetOptionVariables();
    }//GEN-LAST:event_nextButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton nextButton;
    private javax.swing.JScrollPane storylineScrollPane;
    private javax.swing.JTextArea storylineTextArea;
    // End of variables declaration//GEN-END:variables
}
