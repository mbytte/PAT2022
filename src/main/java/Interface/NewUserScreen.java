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
        //setting it to be in the centre of the screen
        setLocationRelativeTo (null);  
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
        backButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLabel.setBackground(new java.awt.Color(48, 29, 39));
        usernameLabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(114, 214, 206));
        usernameLabel.setText("USERNAME");
        usernameLabel.setOpaque(true);
        getContentPane().add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        createUserButton.setBackground(new java.awt.Color(48, 29, 39));
        createUserButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        createUserButton.setForeground(new java.awt.Color(114, 214, 206));
        createUserButton.setText("CREATE USER");
        createUserButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, -1));

        usernameArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        usernameArea.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usernameTextArea.setBackground(new java.awt.Color(48, 29, 39));
        usernameTextArea.setColumns(20);
        usernameTextArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        usernameTextArea.setForeground(new java.awt.Color(114, 214, 206));
        usernameTextArea.setRows(5);
        usernameArea.setViewportView(usernameTextArea);

        getContentPane().add(usernameArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 200, 40));

        backButton.setBackground(new java.awt.Color(48, 29, 39));
        backButton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<-");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewUserScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //creates the user and sets the game variables to their default values
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createUserButtonActionPerformed
    {//GEN-HEADEREND:event_createUserButtonActionPerformed
        User user = new User(usernameTextArea.getText(), false, false, false, false);
        UserManager users = new UserManager();
        users.createUser(user);
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
