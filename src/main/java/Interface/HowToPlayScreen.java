/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Backend.ChangingScreens;

/**
 *
 * @author Megan
 */
public class HowToPlayScreen extends javax.swing.JFrame
{

   //creating form
    public HowToPlayScreen()
    {
        initComponents();
        setLocationRelativeTo (null);
        
        //setting text to the information text area
        ChangingScreens screenMethods = new ChangingScreens();
        String htp = screenMethods.getHowToPlay();
        informationArea.setText(htp);
    }

    
    
    //initialising form
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Background = new javax.swing.JLabel();
        informationScrollPane = new javax.swing.JScrollPane();
        informationArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationArea.setEditable(false);
        informationArea.setBackground(new java.awt.Color(51, 51, 51));
        informationArea.setColumns(20);
        informationArea.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        informationArea.setForeground(new java.awt.Color(204, 204, 204));
        informationArea.setLineWrap(true);
        informationArea.setRows(5);
        informationArea.setWrapStyleWord(true);
        informationScrollPane.setViewportView(informationArea);

        getContentPane().add(informationScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 160));

        titleLabel.setFont(new java.awt.Font("Juice ITC", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("How to play");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        okButton.setBackground(new java.awt.Color(51, 51, 51));
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/htpBg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel background;
    private javax.swing.JTextArea informationArea;
    private javax.swing.JScrollPane informationScrollPane;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
