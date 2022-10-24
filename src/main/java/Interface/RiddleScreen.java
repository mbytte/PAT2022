/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.Games;
import java.awt.event.KeyListener;
/**
 *
 * @author Megan
 */
public class RiddleScreen extends javax.swing.JFrame
{
    //variables
    Games riddle = new Games();
    
    //creating form
    public RiddleScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    
    
   //form initialisation
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        riddleScrollPane = new javax.swing.JScrollPane();
        riddleTextArea = new javax.swing.JTextArea();
        userAnswerScrollPane = new javax.swing.JScrollPane();
        answerTextArea = new javax.swing.JTextArea();
        answerButton = new javax.swing.JButton();
        answerHereLabel = new javax.swing.JLabel();
        htpButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        riddleTextArea.setEditable(false);
        riddleTextArea.setBackground(new java.awt.Color(48, 29, 39));
        riddleTextArea.setColumns(20);
        riddleTextArea.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        riddleTextArea.setForeground(new java.awt.Color(114, 214, 206));
        riddleTextArea.setRows(5);
        riddleTextArea.setText("I sit opposite the 1 when you look at me and \nwhen I am square the sum of my numbers is \n13. I am an \"even\" number, but I am also odd.\n\nWhat number am I? \"");
        riddleTextArea.setWrapStyleWord(true);
        riddleTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        riddleScrollPane.setViewportView(riddleTextArea);

        getContentPane().add(riddleScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 320, 100));

        userAnswerScrollPane.setBackground(new java.awt.Color(48, 29, 39));
        userAnswerScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        userAnswerScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        answerTextArea.setBackground(new java.awt.Color(48, 29, 39));
        answerTextArea.setColumns(20);
        answerTextArea.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        answerTextArea.setForeground(new java.awt.Color(114, 214, 206));
        answerTextArea.setRows(5);
        userAnswerScrollPane.setViewportView(answerTextArea);

        getContentPane().add(userAnswerScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 30));

        answerButton.setBackground(new java.awt.Color(48, 29, 39));
        answerButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        answerButton.setForeground(new java.awt.Color(114, 214, 206));
        answerButton.setText("ANSWER");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        answerHereLabel.setBackground(new java.awt.Color(48, 29, 39));
        answerHereLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        answerHereLabel.setForeground(new java.awt.Color(255, 255, 255));
        answerHereLabel.setText("ANSWER HERE");
        answerHereLabel.setOpaque(true);
        getContentPane().add(answerHereLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        htpButton.setBackground(new java.awt.Color(48, 29, 39));
        htpButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        htpButton.setForeground(new java.awt.Color(114, 214, 206));
        htpButton.setText("HOW TO PLAY");
        htpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                htpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        homeButton.setBackground(new java.awt.Color(48, 29, 39));
        homeButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(114, 214, 206));
        homeButton.setText("<-");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RiddleScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //takes in the user input and checks if tthe user has gotten the right answer
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        riddle.rightWrongCheck(answerTextArea.getText());
        //clearing the input area
        answerTextArea.setText("");
        //closing the screen if game has been won or lost(can't dispose a screen in a method so it has to be done here)
        if(riddle.isRiddleWin())
        {
            this.dispose();
            riddle.resetRiddle();
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    
    //opens the how to play screen
    private void htpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_htpButtonActionPerformed
    {//GEN-HEADEREND:event_htpButtonActionPerformed
        new HowToPlayScreen().setVisible(true);
    }//GEN-LAST:event_htpButtonActionPerformed

    
    //disposes this screen and opens the options screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JLabel answerHereLabel;
    private javax.swing.JTextArea answerTextArea;
    private javax.swing.JLabel background;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton htpButton;
    private javax.swing.JScrollPane riddleScrollPane;
    private javax.swing.JTextArea riddleTextArea;
    private javax.swing.JScrollPane userAnswerScrollPane;
    // End of variables declaration//GEN-END:variables
}
