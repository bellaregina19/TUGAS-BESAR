/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeGame;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bella Regina S
 */
public class TicTacToeGame extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public TicTacToeGame() {
        initComponents();
    }

    
    private void gameScore(){
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    private void winningGame(){
        String b1 = jButton19.getText();
        String b2 = jButton20.getText();
        String b3 = jButton21.getText();
        String b4 = jButton22.getText();
        String b5 = jButton26.getText();
        String b6 = jButton27.getText();
        String b7 = jButton28.getText();
        String b8 = jButton29.getText();
        String b9 = jButton30.getText();
        
        if (b5 == ("X") && b7 == ("X") && b8 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton26.setBackground(java.awt.Color.green);
            jButton28.setBackground(java.awt.Color.green);
            jButton29.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b5 == ("O") && b7 == ("O") && b8 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton26.setBackground(java.awt.Color.CYAN);
            jButton28.setBackground(java.awt.Color.CYAN);
            jButton29.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b6 == ("X") && b8 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton27.setBackground(java.awt.Color.green);
            jButton29.setBackground(java.awt.Color.green);
            jButton23.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b6 == ("O") && b8 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton27.setBackground(java.awt.Color.CYAN);
            jButton29.setBackground(java.awt.Color.CYAN);
            jButton23.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b1 == ("X") && b3 == ("X") && b8 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.green);
            jButton21.setBackground(java.awt.Color.green);
            jButton29.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b1 == ("O") && b3 == ("O") && b8 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.CYAN);
            jButton21.setBackground(java.awt.Color.CYAN);
            jButton29.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.green);
            jButton22.setBackground(java.awt.Color.green);
            jButton28.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.CYAN);
            jButton22.setBackground(java.awt.Color.CYAN);
            jButton28.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b2 == ("X") && b3 == ("X") && b5 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton20.setBackground(java.awt.Color.green);
            jButton21.setBackground(java.awt.Color.green);
            jButton26.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b2 == ("O") && b3 == ("O") && b5 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton20.setBackground(java.awt.Color.CYAN);
            jButton21.setBackground(java.awt.Color.CYAN);
            jButton26.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b1 == ("X") && b5 == ("X") && b6 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.green);
            jButton26.setBackground(java.awt.Color.green);
            jButton27.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b1 == ("O") && b5 == ("O") && b6 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.CYAN);
            jButton26.setBackground(java.awt.Color.CYAN);
            jButton27.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b1 == ("X") && b2 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.green);
            jButton20.setBackground(java.awt.Color.green);
            jButton30.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b1 == ("O") && b2 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton19.setBackground(java.awt.Color.CYAN);
            jButton20.setBackground(java.awt.Color.CYAN);
            jButton30.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
        if (b2 == ("X") && b3 == ("X") && b6 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton21.setBackground(java.awt.Color.green);
            jButton22.setBackground(java.awt.Color.green);
            jButton27.setBackground(java.awt.Color.green);
            xCount++;
            gameScore();
        }
        if (b2 == ("O") && b3 == ("O") && b6 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton21.setBackground(java.awt.Color.CYAN);
            jButton22.setBackground(java.awt.Color.CYAN);
            jButton27.setBackground(java.awt.Color.CYAN);
            oCount++;
            gameScore();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton19.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton19.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton19.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 230, 170));

        jButton20.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton20.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton20.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton20.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 230, 170));

        jButton21.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton21.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton21.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton21.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 230, 170));

        jButton22.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton22.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton22.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton22.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 230, 170));

        jButton26.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton26.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton26.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton26.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 230, 180));

        jButton27.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton27.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton27.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton27.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, 170));

        jButton28.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton28.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton28.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton28.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 230, 180));

        jButton29.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton29.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton29.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton29.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 180));

        jButton30.setFont(new java.awt.Font("Comic Sans MS", 1, 69)); // NOI18N
        jButton30.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton30.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton30.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 170));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 730, 560));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton24.setFont(new java.awt.Font("Candara", 1, 80)); // NOI18N
        jButton24.setText("NEW GAME");
        jButton24.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton24.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton24.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 180));

        jButton23.setFont(new java.awt.Font("Candara", 1, 69)); // NOI18N
        jButton23.setText("RESET");
        jButton23.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton23.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton23.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, 140));

        jButton25.setFont(new java.awt.Font("Candara", 1, 69)); // NOI18N
        jButton25.setText("EXIT");
        jButton25.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton25.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton25.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 260, 140));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 360));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Player O :");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 70));

        jlblPlayerX.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel6.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 260, 60));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel3.setText("Player X :");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 270, 70));

        jlblPlayerO.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel6.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 260, 60));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 550, 160));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 570, 550));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Toe");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 200, 70));

        jLabel7.setFont(new java.awt.Font("Bauhaus 93", 0, 100)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Game ");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 280, 70));

        jLabel8.setFont(new java.awt.Font("Bauhaus 93", 0, 100)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Tic ");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 200, 70));

        jLabel9.setFont(new java.awt.Font("Bauhaus 93", 0, 100)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Tac ");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 200, 70));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1300, 110));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setText("XOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOXOX");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 1400, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        
        jButton19.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton26.setText("");
        jButton27.setText("");
        jButton28.setText("");
        jButton29.setText("");
        jButton30.setText("");
        
        jButton19.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton20.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton21.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton22.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton26.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton27.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton28.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton29.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton30.setBackground(java.awt.Color.LIGHT_GRAY);
        
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        jButton19.setText("");
        jButton20.setText("");
        jButton21.setText("");
        jButton22.setText("");
        jButton26.setText("");
        jButton27.setText("");
        jButton28.setText("");
        jButton29.setText("");
        jButton30.setText("");
        
        jButton19.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton20.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton21.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton22.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton26.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton27.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton28.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton29.setBackground(java.awt.Color.LIGHT_GRAY);
        jButton30.setBackground(java.awt.Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe",
        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton26.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton28.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jButton29.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jButton27.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jButton30.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jButton30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
