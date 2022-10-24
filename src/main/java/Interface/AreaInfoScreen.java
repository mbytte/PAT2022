/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.ChangingScreenMethods;

/**
 *
 * @author megan
 */
public class AreaInfoScreen extends javax.swing.JFrame
{
    //variables
    ChangingScreenMethods screenMethods = new ChangingScreenMethods();
    
    //creating form
    public AreaInfoScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting text to the text area
        String areaInfo = screenMethods.getAreaInfo();
        infoDisplay.setText(areaInfo);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        infoScrollPane = new javax.swing.JScrollPane();
        infoDisplay = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoScrollPane.setBackground(new java.awt.Color(51, 51, 51));

        infoDisplay.setEditable(false);
        infoDisplay.setBackground(new java.awt.Color(48, 29, 39));
        infoDisplay.setColumns(20);
        infoDisplay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        infoDisplay.setForeground(new java.awt.Color(114, 214, 206));
        infoDisplay.setLineWrap(true);
        infoDisplay.setRows(5);
        infoDisplay.setWrapStyleWord(true);
        infoScrollPane.setViewportView(infoDisplay);

        getContentPane().add(infoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 320, 180));

        nextButton.setBackground(new java.awt.Color(48, 29, 39));
        nextButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        nextButton.setForeground(new java.awt.Color(114, 214, 206));
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataDisplayScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //opens the game and how to play it
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        ChangingScreenMethods screenMethods = new ChangingScreenMethods();
        screenMethods.openGame();
        new HowToPlayScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextButtonActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextArea infoDisplay;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
