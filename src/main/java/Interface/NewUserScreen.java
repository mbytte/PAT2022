/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.User;
import Backend.UserManager;
import javax.swing.JTextArea;

/**
 *
 * @author megan
 */
public class NewUserScreen extends javax.swing.JFrame
{
    //creating screen
    public NewUserScreen()
    {
        initComponents();
    }

    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        usernameLabel = new javax.swing.JLabel();
        createUserButton = new javax.swing.JButton();
        usernameArea = new javax.swing.JScrollPane();
        usernameTextArea = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setText("Username");
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        createUserButton.setText("Create User");
        createUserButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        usernameArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        usernameArea.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usernameTextArea.setColumns(20);
        usernameTextArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usernameTextArea.setRows(5);
        usernameArea.setViewportView(usernameTextArea);

        getContentPane().add(usernameArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 40));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 90));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //creates the user and sets the game variables to their default values
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createUserButtonActionPerformed
    {//GEN-HEADEREND:event_createUserButtonActionPerformed
       //what you are gonna do is make the create user thingy need an object to be inputted
        User user = new User(usernameTextArea.getText(), false, false, false, false);
        UserManager.createUser(user);
        new UserScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createUserButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButtonActionPerformed
    {//GEN-HEADEREND:event_backButtonActionPerformed
        new UserScreen().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton createUserButton;
    private javax.swing.JScrollPane usernameArea;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextArea usernameTextArea;
    // End of variables declaration//GEN-END:variables

    private void createUser(JTextArea usernameTextArea)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
