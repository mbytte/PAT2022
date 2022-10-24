/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Backend.*;

/**
 *
 * @author Meganl
 */
public class PuzzleScreen extends javax.swing.JFrame 
{
    //variables
    Games puzzle = new Games();
    
    //creating form
    public PuzzleScreen() 
    {
        initComponents();
        setLocationRelativeTo (null);
    }
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        frame0 = new javax.swing.JButton();
        frame1 = new javax.swing.JButton();
        frame2 = new javax.swing.JButton();
        frame3 = new javax.swing.JButton();
        frame4 = new javax.swing.JButton();
        frame5 = new javax.swing.JButton();
        htpButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        backgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frame0.setBackground(new java.awt.Color(48, 29, 39));
        frame0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.jpg"))); // NOI18N
        frame0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame0ActionPerformed(evt);
            }
        });
        getContentPane().add(frame0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 131, 143));

        frame1.setBackground(new java.awt.Color(48, 29, 39));
        frame1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.jpg"))); // NOI18N
        frame1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame1ActionPerformed(evt);
            }
        });
        getContentPane().add(frame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 131, 143));

        frame2.setBackground(new java.awt.Color(48, 29, 39));
        frame2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0.jpg"))); // NOI18N
        frame2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame2ActionPerformed(evt);
            }
        });
        getContentPane().add(frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 131, 143));

        frame3.setBackground(new java.awt.Color(48, 29, 39));
        frame3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.jpg"))); // NOI18N
        frame3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame3ActionPerformed(evt);
            }
        });
        getContentPane().add(frame3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 131, 143));

        frame4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        frame4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame4ActionPerformed(evt);
            }
        });
        getContentPane().add(frame4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 131, 143));

        frame5.setBackground(new java.awt.Color(48, 29, 39));
        frame5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        frame5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frame5ActionPerformed(evt);
            }
        });
        getContentPane().add(frame5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 131, 143));

        htpButton.setBackground(new java.awt.Color(48, 29, 39));
        htpButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        htpButton.setForeground(new java.awt.Color(114, 214, 206));
        htpButton.setText("HOW TO PAY");
        htpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                htpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

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
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        backgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PuzzleScreen.png"))); // NOI18N
        getContentPane().add(backgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //BUTTON PRESSED ACTIONS    
    //main components
    private void frame0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame0ActionPerformed
    {//GEN-HEADEREND:event_frame0ActionPerformed
        //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(0, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame0ActionPerformed

    
    private void frame1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame1ActionPerformed
    {//GEN-HEADEREND:event_frame1ActionPerformed
       //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(1, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame1ActionPerformed

    
    private void frame2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame2ActionPerformed
    {//GEN-HEADEREND:event_frame2ActionPerformed
        //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(2, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame2ActionPerformed

    
    private void frame3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame3ActionPerformed
    {//GEN-HEADEREND:event_frame3ActionPerformed
        //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(3, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame3ActionPerformed

    
    private void frame4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame4ActionPerformed
    {//GEN-HEADEREND:event_frame4ActionPerformed
          //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(4, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame4ActionPerformed

    
    private void frame5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frame5ActionPerformed
    {//GEN-HEADEREND:event_frame5ActionPerformed
         //getting the current location of the blank picture
        int blankPicFrame = puzzle.getBlankPicPos();
        //swapping selected picture with the blank pic
        puzzle.framePicSwap(5, blankPicFrame, frame0, frame1, frame2, frame3, frame4, frame5);        
        //checking if the picture is correctly sorted out
        puzzle.puzzleWinCheck();
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(puzzle.isPuzzleWin())
        {
            this.dispose();
            //resetting the form back to its original values
            puzzle.resetPuzzle();
        }
    }//GEN-LAST:event_frame5ActionPerformed

    
    
    //other components
    //disposes this screen and opens the options screen
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
        
        //resetting the picture order to its original order
        puzzle.resetPuzzle();
    }//GEN-LAST:event_homeButtonActionPerformed

    //opens the how to play screen
    private void htpButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_htpButtonActionPerformed
    {//GEN-HEADEREND:event_htpButtonActionPerformed
        new HowToPlayScreen().setVisible(true);
    }//GEN-LAST:event_htpButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgound;
    private javax.swing.JButton frame0;
    private javax.swing.JButton frame1;
    private javax.swing.JButton frame2;
    private javax.swing.JButton frame3;
    private javax.swing.JButton frame4;
    private javax.swing.JButton frame5;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton htpButton;
    // End of variables declaration//GEN-END:variables
}
