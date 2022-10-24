/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.DataSheet;
import Backend.Games;
import Backend.User;
/**
 *
 * @author megan
 */
public class InfoScreen extends javax.swing.JFrame
{
    //variables
    Games game = new Games();
    User currentUser = game.getCurrentUser();
    DataSheet dataSheet = new DataSheet(currentUser);

    
    //creating form
    public InfoScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting the data collected from the chosen area
        String data = dataSheet.getCompletedGameData(currentUser);
        infoDisplay.setText(data);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        doneButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        infoDisplayScrollPane = new javax.swing.JScrollPane();
        infoDisplay = new javax.swing.JTextArea();
        heading = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doneButton.setBackground(new java.awt.Color(48, 29, 39));
        doneButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        doneButton.setForeground(new java.awt.Color(114, 214, 206));
        doneButton.setText("DONE");
        doneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        backButton.setBackground(new java.awt.Color(48, 29, 39));
        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(114, 214, 206));
        backButton.setText("<-");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 20));

        infoDisplay.setEditable(false);
        infoDisplay.setBackground(new java.awt.Color(48, 29, 39));
        infoDisplay.setColumns(20);
        infoDisplay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        infoDisplay.setForeground(new java.awt.Color(114, 214, 206));
        infoDisplay.setLineWrap(true);
        infoDisplay.setRows(5);
        infoDisplay.setWrapStyleWord(true);
        infoDisplayScrollPane.setViewportView(infoDisplay);

        getContentPane().add(infoDisplayScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 376, 170));

        heading.setBackground(new java.awt.Color(48, 29, 39));
        heading.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("DATA COLLECTED");
        heading.setOpaque(true);
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InfoScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //disposes this screen
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doneButtonActionPerformed
    {//GEN-HEADEREND:event_doneButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    //takes user back to the data screen
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        this.dispose();
        new DataSheetScreen().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel heading;
    private javax.swing.JTextArea infoDisplay;
    private javax.swing.JScrollPane infoDisplayScrollPane;
    // End of variables declaration//GEN-END:variables
}
