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
public class InfoScreen extends javax.swing.JFrame
{
    //variables
    Games game = new Games();
    DataSheet dataSheet = new DataSheet(game.getCurrentUser());
    
    //creating form
    public InfoScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting the data collected from the chosen area
        String data = dataSheet.getCompletedGameData();
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

        doneButton.setBackground(new java.awt.Color(255, 255, 204));
        doneButton.setForeground(new java.awt.Color(0, 0, 0));
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(doneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        backButton.setBackground(new java.awt.Color(255, 255, 204));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        infoDisplay.setEditable(false);
        infoDisplay.setBackground(new java.awt.Color(255, 255, 204));
        infoDisplay.setColumns(20);
        infoDisplay.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        infoDisplay.setForeground(new java.awt.Color(0, 0, 0));
        infoDisplay.setLineWrap(true);
        infoDisplay.setRows(5);
        infoDisplay.setWrapStyleWord(true);
        infoDisplayScrollPane.setViewportView(infoDisplay);

        getContentPane().add(infoDisplayScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 376, 137));

        heading.setFont(new java.awt.Font("Juice ITC", 0, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(0, 0, 0));
        heading.setText("Data collected:");
        getContentPane().add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dataSheetBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 210));

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
