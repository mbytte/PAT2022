/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.UserMethods;

/**
 *
 * @author megan
 */
public class UserAdderScreen extends javax.swing.JFrame
{
    //creatiing screen
    public UserAdderScreen()
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
        jTextArea1 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        usernameArea.setViewportView(jTextArea1);

        getContentPane().add(usernameArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 40));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //creates the user and sets the game variables to their default values
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createUserButtonActionPerformed
    {//GEN-HEADEREND:event_createUserButtonActionPerformed
        UserMethods.createUser(username);
    }//GEN-LAST:event_createUserButtonActionPerformed

    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton createUserButton;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane usernameArea;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
