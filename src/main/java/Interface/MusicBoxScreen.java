/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.HangmanMethods;

/**
 *
 * @author Megan
 */
public class MusicBoxScreen extends javax.swing.JFrame
{
    //creating form
    public MusicBoxScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //displaying the array that the user will be working with so it starts with it already loaded into the text area
        wordDisplay.setText("_ _ _ _ _ _ _ _ _");       
    }

        
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        screenTitle = new javax.swing.JLabel();
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

        screenTitle.setFont(new java.awt.Font("Juice ITC", 1, 48)); // NOI18N
        screenTitle.setForeground(new java.awt.Color(255, 255, 255));
        screenTitle.setText("FInd the Password");
        getContentPane().add(screenTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));

        wordDisplaySP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wordDisplaySP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        wordDisplay.setEditable(false);
        wordDisplay.setBackground(new java.awt.Color(51, 51, 51));
        wordDisplay.setColumns(20);
        wordDisplay.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        wordDisplay.setForeground(new java.awt.Color(204, 204, 204));
        wordDisplay.setLineWrap(true);
        wordDisplay.setRows(5);
        wordDisplay.setWrapStyleWord(true);
        wordDisplay.setRequestFocusEnabled(false);
        wordDisplaySP.setViewportView(wordDisplay);

        getContentPane().add(wordDisplaySP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 100));

        wrongAnswersProgressBar.setBackground(new java.awt.Color(51, 51, 51));
        wrongAnswersProgressBar.setForeground(new java.awt.Color(51, 0, 0));
        getContentPane().add(wrongAnswersProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 20));

        subHead1.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        subHead1.setForeground(new java.awt.Color(255, 255, 255));
        subHead1.setText("Wrong letters");
        getContentPane().add(subHead1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        wrongLettersSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        wrongLettersSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        worngAnswersDisplay.setEditable(false);
        worngAnswersDisplay.setBackground(new java.awt.Color(51, 51, 51));
        worngAnswersDisplay.setColumns(20);
        worngAnswersDisplay.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        worngAnswersDisplay.setForeground(new java.awt.Color(204, 204, 204));
        worngAnswersDisplay.setLineWrap(true);
        worngAnswersDisplay.setRows(5);
        worngAnswersDisplay.setWrapStyleWord(true);
        wrongLettersSP.setViewportView(worngAnswersDisplay);

        getContentPane().add(wrongLettersSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 70));

        htpButton.setBackground(new java.awt.Color(51, 51, 51));
        htpButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        htpButton.setForeground(new java.awt.Color(204, 204, 204));
        htpButton.setText("How to play");
        htpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                htpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 30));

        homeButton.setBackground(new java.awt.Color(51, 51, 51));
        homeButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        homeButton.setForeground(new java.awt.Color(204, 204, 204));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 30));

        subHead2.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        subHead2.setForeground(new java.awt.Color(255, 255, 255));
        subHead2.setText("Letter Guess");
        getContentPane().add(subHead2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 20));

        letterGuessSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        letterGuessSP.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        letterGuess.setBackground(new java.awt.Color(51, 51, 51));
        letterGuess.setColumns(20);
        letterGuess.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        letterGuess.setForeground(new java.awt.Color(204, 204, 204));
        letterGuess.setRows(5);
        letterGuessSP.setViewportView(letterGuess);

        getContentPane().add(letterGuessSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 110, 50));

        answerButton.setBackground(new java.awt.Color(153, 153, 153));
        answerButton.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        answerButton.setForeground(new java.awt.Color(0, 0, 0));
        answerButton.setText("TEST LETTER");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 130, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jewelryBoxClosed.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //disposes this screen and takes the user back to the home screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
        HangmanMethods.reset();
    }//GEN-LAST:event_homeButtonActionPerformed

    //checks if the input letter is correct and schecks if the user has won the game or not
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        //getting the input and checking if it is one of the letters
        String inputLetter = letterGuess.getText();
        HangmanMethods.letterCheck(inputLetter, wrongAnswersProgressBar);
        //updating the whole screen with new data
        HangmanMethods.updateScreen(wordDisplay, worngAnswersDisplay, letterGuess, wrongAnswersProgressBar);
        //checking if the game has been won or lost and, if it has, closing the screen (can't dispose a screen in a method so it has to be done here)
        HangmanMethods.WinLoseCheck();
        if(HangmanMethods.winOrLose)
        {
            this.dispose();
            HangmanMethods.reset();
        }
            
    }//GEN-LAST:event_answerButtonActionPerformed

    //opens the how to play screen
    private void htpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_htpButtonActionPerformed
    {//GEN-HEADEREND:event_htpButtonActionPerformed
        new HowToPlay().setVisible(true);
    }//GEN-LAST:event_htpButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton htpButton;
    private javax.swing.JTextArea letterGuess;
    private javax.swing.JScrollPane letterGuessSP;
    private javax.swing.JLabel screenTitle;
    private javax.swing.JLabel subHead1;
    private javax.swing.JLabel subHead2;
    private javax.swing.JTextArea wordDisplay;
    private javax.swing.JScrollPane wordDisplaySP;
    private javax.swing.JTextArea worngAnswersDisplay;
    private javax.swing.JProgressBar wrongAnswersProgressBar;
    private javax.swing.JScrollPane wrongLettersSP;
    // End of variables declaration//GEN-END:variables
}
