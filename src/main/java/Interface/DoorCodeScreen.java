/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.Games;

/**
 *
 * @author megan
 */
public class DoorCodeScreen extends javax.swing.JFrame 
{
    //Variables
    Games doorCode = new Games();
    
    //creating form
    public DoorCodeScreen() 
    {
        initComponents();
        setLocationRelativeTo (null);
    }

    //displays the output
    public void updateDisplay()
    {
        String[] userCode = doorCode.getUserCode();
        num1Display.setText(userCode[0]);
        num2Display.setText(userCode[1]);
        num3Display.setText(userCode[2]);
    }
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        screenTitle = new javax.swing.JLabel();
        num0Button = new javax.swing.JButton();
        num1Button = new javax.swing.JButton();
        num2Button = new javax.swing.JButton();
        num3Button = new javax.swing.JButton();
        num4Button = new javax.swing.JButton();
        num5Button = new javax.swing.JButton();
        num6Button = new javax.swing.JButton();
        num7Button = new javax.swing.JButton();
        num8Button = new javax.swing.JButton();
        num9Button = new javax.swing.JButton();
        keypadPicture = new javax.swing.JLabel();
        answerButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        num2Display = new javax.swing.JTextField();
        num1Display = new javax.swing.JTextField();
        num3Display = new javax.swing.JTextField();
        pincodeBackground = new javax.swing.JLabel();
        htpButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screenTitle.setFont(new java.awt.Font("Juice ITC", 1, 36)); // NOI18N
        screenTitle.setText("Type in password");
        getContentPane().add(screenTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 40));

        num0Button.setBorderPainted(false);
        num0Button.setContentAreaFilled(false);
        num0Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num0ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num0Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 40, 30));

        num1Button.setBorderPainted(false);
        num1Button.setContentAreaFilled(false);
        num1Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 30, 30));

        num2Button.setBorderPainted(false);
        num2Button.setContentAreaFilled(false);
        num2Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num2ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 40, 30));

        num3Button.setBorderPainted(false);
        num3Button.setContentAreaFilled(false);
        num3Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num3ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 30));

        num4Button.setBorderPainted(false);
        num4Button.setContentAreaFilled(false);
        num4Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num4ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 30, 30));

        num5Button.setBorderPainted(false);
        num5Button.setContentAreaFilled(false);
        num5Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num5Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 40, 30));

        num6Button.setBorderPainted(false);
        num6Button.setContentAreaFilled(false);
        num6Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num6ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num6Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 40, 30));

        num7Button.setBorderPainted(false);
        num7Button.setContentAreaFilled(false);
        num7Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num7ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num7Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, 30));

        num8Button.setBorderPainted(false);
        num8Button.setContentAreaFilled(false);
        num8Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num8ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num8Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 40, 30));

        num9Button.setBorderPainted(false);
        num9Button.setContentAreaFilled(false);
        num9Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                num9ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(num9Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        keypadPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/keypad.jpg"))); // NOI18N
        getContentPane().add(keypadPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 190));

        answerButton.setBackground(java.awt.SystemColor.controlDkShadow);
        answerButton.setText("Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(answerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        homeButton.setBackground(java.awt.SystemColor.controlDkShadow);
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        num2Display.setEditable(false);
        num2Display.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(num2Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 40, 40));

        num1Display.setEditable(false);
        num1Display.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(num1Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 40, 40));

        num3Display.setEditable(false);
        num3Display.setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().add(num3Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, 40));

        pincodeBackground.setBackground(new java.awt.Color(102, 102, 102));
        pincodeBackground.setOpaque(true);
        getContentPane().add(pincodeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, 60));

        htpButton.setBackground(new java.awt.Color(102, 102, 102));
        htpButton.setText("How to Play");
        htpButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                htpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(htpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //closes this screen and opens the home screen(OptionsUI)
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        this.dispose();
        new OptionsScreen().setVisible(true);
        //resets the door code for when the user comes back to this screen
        doorCode.resetDoorCode();
    }//GEN-LAST:event_homeButtonActionPerformed
   
    
    //adds the selected number to the userCode and updates the display
    private void num1ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num1ButtonActionPerformed
    {//GEN-HEADEREND:event_num1ButtonActionPerformed
        doorCode.addNumber(1);
        updateDisplay();
    }//GEN-LAST:event_num1ButtonActionPerformed

    private void num2ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num2ButtonActionPerformed
    {//GEN-HEADEREND:event_num2ButtonActionPerformed
        doorCode.addNumber(2);
        updateDisplay();
    }//GEN-LAST:event_num2ButtonActionPerformed

    private void num3ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num3ButtonActionPerformed
    {//GEN-HEADEREND:event_num3ButtonActionPerformed
        doorCode.addNumber(3);
        updateDisplay();
    }//GEN-LAST:event_num3ButtonActionPerformed

    private void num4ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num4ButtonActionPerformed
    {//GEN-HEADEREND:event_num4ButtonActionPerformed
        doorCode.addNumber(4);
        updateDisplay();
    }//GEN-LAST:event_num4ButtonActionPerformed

    private void num5ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num5ButtonActionPerformed
    {//GEN-HEADEREND:event_num5ButtonActionPerformed
        doorCode.addNumber(5);
        updateDisplay();
    }//GEN-LAST:event_num5ButtonActionPerformed

    private void num6ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num6ButtonActionPerformed
    {//GEN-HEADEREND:event_num6ButtonActionPerformed
        doorCode.addNumber(6);
        updateDisplay();
    }//GEN-LAST:event_num6ButtonActionPerformed

    private void num7ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num7ButtonActionPerformed
    {//GEN-HEADEREND:event_num7ButtonActionPerformed
        doorCode.addNumber(7);
        updateDisplay();
    }//GEN-LAST:event_num7ButtonActionPerformed

    private void num8ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num8ButtonActionPerformed
    {//GEN-HEADEREND:event_num8ButtonActionPerformed
        doorCode.addNumber(8);
        updateDisplay();
    }//GEN-LAST:event_num8ButtonActionPerformed

    private void num9ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num9ButtonActionPerformed
    {//GEN-HEADEREND:event_num9ButtonActionPerformed
        doorCode.addNumber(9);
        updateDisplay();
    }//GEN-LAST:event_num9ButtonActionPerformed

    private void num0ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_num0ButtonActionPerformed
    {//GEN-HEADEREND:event_num0ButtonActionPerformed
        doorCode.addNumber(1);
        updateDisplay();
    }//GEN-LAST:event_num0ButtonActionPerformed

    //checks if the answer is correct or not
    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_answerButtonActionPerformed
    {//GEN-HEADEREND:event_answerButtonActionPerformed
        doorCode.winLoseCheck();
        updateDisplay();;
        //closing the screen if game has been won(can't dispose a screen in a method so it has to be done here)
        if(doorCode.isDoorCodeWin())
        {
            this.dispose();
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
    private javax.swing.JLabel keypadPicture;
    private javax.swing.JButton num0Button;
    private javax.swing.JButton num1Button;
    private javax.swing.JTextField num1Display;
    private javax.swing.JButton num2Button;
    private javax.swing.JTextField num2Display;
    private javax.swing.JButton num3Button;
    private javax.swing.JTextField num3Display;
    private javax.swing.JButton num4Button;
    private javax.swing.JButton num5Button;
    private javax.swing.JButton num6Button;
    private javax.swing.JButton num7Button;
    private javax.swing.JButton num8Button;
    private javax.swing.JButton num9Button;
    private javax.swing.JLabel pincodeBackground;
    private javax.swing.JLabel screenTitle;
    // End of variables declaration//GEN-END:variables
}
