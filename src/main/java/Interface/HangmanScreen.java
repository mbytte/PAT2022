/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.Games;

/**
 *
 * @author Megan
 */
public class HangmanScreen extends javax.swing.JFrame
{
    //variables
    Games hangman = new Games();
    
    //creating form
    public HangmanScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //displaying the array that the user will be working with so it starts with it already loaded into the text area
        wordDisplay.setText("_ _ _ _ _ _ _ _ _");      
    }

     
    //updates all the text areas on the screen
    public void updateScreen()
    {
        //setting the textarea to have new updated text
        wordDisplay.setText(hangman.getDisplayString());
     
        //wrong answer display being updated 
        //setting the textarea to have new updated text
        worngAnswersDisplay.setText(hangman.getWrongAnswers());
        
        //clearing the guessing text area so the user doesn't have to remove the letter they already inputted
        letterGuess.setText("");   
        
        //updating the progress bar
        wrongAnswersProgressBar.setValue(hangman.getProgressBarValue());
        wrongAnswersProgressBar.repaint();
    }
    
    
    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        wordDisplaySP = new javax.swing.JScrollPane();
        wordDisplay = new javax.swing.JTextArea();
        wrongAnswersProgressBar = new javax.swing.JProgressBar();
        subHead1 = new javax.swing.JLabel();
        wrongLettersSP = new javax.swing.JScrollPane();
        worngAnswersDisplay = new javax.swing.JTextArea();
        htpButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        subHead2 = new javax.swing.JLabel();
        letterGuessSP = new javax.swing.JScrollPane();
        letterGuess = new javax.swing.JTextArea();
        answerButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wordDisplaySP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wordDisplaySP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        wordDisplay.setEditable(false);
        wordDisplay.setBackground(new java.awt.Color(48, 29, 39));
        wordDisplay.setColumns(20);
        wordDisplay.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        wordDisplay.setForeground(new java.awt.Color(114, 214, 206));
        wordDisplay.setLineWrap(true);
        wordDisplay.setRows(5);
        wordDisplay.setWrapStyleWord(true);
        wordDisplay.setRequestFocusEnabled(false);
        wordDisplaySP.setViewportView(wordDisplay);

        getContentPane().add(wordDisplaySP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 70));

        wrongAnswersProgressBar.setBackground(new java.awt.Color(48, 29, 39));
        wrongAnswersProgressBar.setForeground(new java.awt.Color(114, 214, 206));
        getContentPane().add(wrongAnswersProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 20));

        subHead1.setBackground(new java.awt.Color(48, 29, 39));
        subHead1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        subHead1.setForeground(new java.awt.Color(114, 214, 206));
        subHead1.setText("WRONG LETTERS");
        subHead1.setOpaque(true);
        getContentPane().add(subHead1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        wrongLettersSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wrongLettersSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        worngAnswersDisplay.setEditable(false);
        worngAnswersDisplay.setBackground(new java.awt.Color(48, 29, 39));
        worngAnswersDisplay.setColumns(20);
        worngAnswersDisplay.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        worngAnswersDisplay.setForeground(new java.awt.Color(114, 214, 206));
        worngAnswersDisplay.setLineWrap(true);
        worngAnswersDisplay.setRows(5);
        worngAnswersDisplay.setWrapStyleWord(true);
        wrongLettersSP.setViewportView(worngAnswersDisplay);

        getContentPane().add(wrongLettersSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 70));

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
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

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
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        subHead2.setBackground(new java.awt.Color(48, 29, 39));
        subHead2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        subHead2.setForeground(new java.awt.Color(114, 214, 206));
        subHead2.setText("LETTER");
        subHead2.setOpaque(true);
        getContentPane().add(subHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 20));

        letterGuessSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        letterGuessSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        letterGuess.setBackground(new java.awt.Color(48, 29, 39));
        letterGuess.setColumns(20);
        letterGuess.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        letterGuess.setForeground(new java.awt.Color(114, 214, 206));
        letterGuess.setRows(5);
        letterGuessSP.setViewportView(letterGuess);

        getContentPane().add(letterGuessSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 70, 50));

        answerButton.setBackground(new java.awt.Color(48, 29, 39));
        answerButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        answerButton.setForeground(new java.awt.Color(114, 214, 206));
        answerButton.setText("TEST");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 80, 30));

        background.setBackground(new java.awt.Color(48, 29, 39));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HangmanScreen.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //disposes this screen and takes the user back to the home screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
        hangman.resetHangman();
    }//GEN-LAST:event_homeButtonActionPerformed

    //checks if the input letter is correct and schecks if the user has won the game or not
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        //getting the input and checking if it is one of the letters
        String inputLetter = letterGuess.getText();
        hangman.letterCheck(inputLetter);
        //updating the whole screen with new data
        updateScreen();
        //checking if the game has been won or lost and, if it has, closing the screen (can't dispose a screen in a method so it has to be done here)
        hangman.hangmanWinCheck();
        if(hangman.isHangmanWin())
        {
            this.dispose();
            hangman.resetHangman();
        }
            
    }//GEN-LAST:event_answerButtonActionPerformed

    //opens the how to play screen
    private void htpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_htpButtonActionPerformed
    {//GEN-HEADEREND:event_htpButtonActionPerformed
        new HowToPlayScreen().setVisible(true);
    }//GEN-LAST:event_htpButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton htpButton;
    private javax.swing.JTextArea letterGuess;
    private javax.swing.JScrollPane letterGuessSP;
    private javax.swing.JLabel subHead1;
    private javax.swing.JLabel subHead2;
    private javax.swing.JTextArea wordDisplay;
    private javax.swing.JScrollPane wordDisplaySP;
    private javax.swing.JTextArea worngAnswersDisplay;
    private javax.swing.JProgressBar wrongAnswersProgressBar;
    private javax.swing.JScrollPane wrongLettersSP;
    // End of variables declaration//GEN-END:variables
}
