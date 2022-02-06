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
public class AreaInformationScreen extends javax.swing.JFrame
{
    //creating form
    public AreaInformationScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting text to the text area
        String areaInfo = ChangingScreenMethods.getAreaInfo();
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
        infoDisplay.setBackground(new java.awt.Color(51, 51, 51));
        infoDisplay.setColumns(20);
        infoDisplay.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        infoDisplay.setForeground(new java.awt.Color(255, 255, 255));
        infoDisplay.setLineWrap(true);
        infoDisplay.setRows(5);
        infoDisplay.setWrapStyleWord(true);
        infoScrollPane.setViewportView(infoDisplay);

        getContentPane().add(infoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 120));

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
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 70, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/storylineBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //opens the game and how to play it
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        ChangingScreenMethods.openGame();
        new HowToPlay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextButtonActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextArea infoDisplay;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
