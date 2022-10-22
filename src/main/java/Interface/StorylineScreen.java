/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.ChangingScreens;
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
        ChangingScreens screenMethods = new ChangingScreens();
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
        storylineTextArea.setBackground(new java.awt.Color(51, 51, 51));
        storylineTextArea.setColumns(20);
        storylineTextArea.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        storylineTextArea.setForeground(new java.awt.Color(0, 0, 0));
        storylineTextArea.setLineWrap(true);
        storylineTextArea.setRows(5);
        storylineTextArea.setWrapStyleWord(true);
        storylineScrollPane.setViewportView(storylineTextArea);

        getContentPane().add(storylineScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 381, 138));

        nextButton.setBackground(new java.awt.Color(51, 51, 51));
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 168, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/storylineBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //takes user back to the options screen
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        this.dispose();
        ChangingScreens screenMethods = new ChangingScreens();
        screenMethods.openNextScreen();
    }//GEN-LAST:event_nextButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton nextButton;
    private javax.swing.JScrollPane storylineScrollPane;
    private javax.swing.JTextArea storylineTextArea;
    // End of variables declaration//GEN-END:variables
}
