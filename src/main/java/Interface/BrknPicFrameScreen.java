/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.RiddleMethods;
/**
 *
 * @author Megan
 */
public class BrknPicFrameScreen extends javax.swing.JFrame
{
    //creating form
    public BrknPicFrameScreen()
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
        headingLabel = new javax.swing.JLabel();
        answerHereLabel = new javax.swing.JLabel();
        htpButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        riddleTextArea.setEditable(false);
        riddleTextArea.setBackground(new java.awt.Color(255, 204, 153));
        riddleTextArea.setColumns(20);
        riddleTextArea.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        riddleTextArea.setForeground(new java.awt.Color(0, 0, 0));
        riddleTextArea.setRows(5);
        riddleTextArea.setText("I sit opposite the 1 when you look at me and when\nI am square the sum of my numbers is 13. I am an \n\"even\" number, but I am also odd.\n\nWhat number am I? \"");
        riddleTextArea.setWrapStyleWord(true);
        riddleTextArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        riddleScrollPane.setViewportView(riddleTextArea);

        getContentPane().add(riddleScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 300, 100));

        userAnswerScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        userAnswerScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        answerTextArea.setBackground(new java.awt.Color(255, 204, 153));
        answerTextArea.setColumns(20);
        answerTextArea.setForeground(new java.awt.Color(0, 0, 0));
        answerTextArea.setRows(5);
        userAnswerScrollPane.setViewportView(answerTextArea);

        getContentPane().add(userAnswerScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 300, 42));

        answerButton.setBackground(new java.awt.Color(102, 102, 102));
        answerButton.setForeground(new java.awt.Color(204, 204, 204));
        answerButton.setText("Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        headingLabel.setFont(new java.awt.Font("Juice ITC", 1, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(0, 0, 0));
        headingLabel.setText("Riddle");
        getContentPane().add(headingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 50));

        answerHereLabel.setForeground(new java.awt.Color(0, 0, 0));
        answerHereLabel.setText("Answer here:");
        getContentPane().add(answerHereLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        htpButton.setBackground(new java.awt.Color(102, 102, 102));
        htpButton.setText("How to play");
        htpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                htpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 10, 100, -1));

        homeButton.setBackground(new java.awt.Color(102, 102, 102));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/brokenFrameBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //takes in the user input and checks if tthe user has gotten the right answer
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        String userInput = RiddleMethods.getInput(answerTextArea);
        RiddleMethods.rightWrongCheck(userInput, answerTextArea);
        //closing the screen if game has been won or lost(can't dispose a screen in a method so it has to be done here)
        if(RiddleMethods.winOrLose)
        {
            this.dispose();
            RiddleMethods.reset();
        }
    }//GEN-LAST:event_answerButtonActionPerformed

    //opens the how to play screen
    private void htpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_htpButtonActionPerformed
    {//GEN-HEADEREND:event_htpButtonActionPerformed
        new HowToPlay().setVisible(true);
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
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton htpButton;
    private javax.swing.JScrollPane riddleScrollPane;
    private javax.swing.JTextArea riddleTextArea;
    private javax.swing.JScrollPane userAnswerScrollPane;
    // End of variables declaration//GEN-END:variables
}
