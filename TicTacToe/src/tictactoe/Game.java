package tictactoe;

/**
 *
 * @author YashJain
 */
public class Game extends javax.swing.JFrame {
    public Game() {
        initComponents();
    }
    
    boolean isbtn1Pressed = false;
    boolean isbtn2Pressed = false;
    boolean isbtn3Pressed = false;
    boolean isbtn4Pressed = false;
    boolean isbtn5Pressed = false;
    boolean isbtn6Pressed = false;
    boolean isbtn7Pressed = false;
    boolean isbtn8Pressed = false;
    boolean isbtn9Pressed = false;
    
    String currPlayer = "X";
    public void currentPlayer(){
        currPlayer = (currPlayer == "X") ? "O" : "X";
    }
    
    public boolean sameRow(){
        if(btn1.getText() != "" && btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText()) return true;
        if(btn4.getText() != "" && btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText()) return true;
        if(btn7.getText() != "" && btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText()) return true;
        return false;
    }
    
    public boolean sameColumn(){
        if(btn1.getText() != "" && btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText()) return true;
        if(btn2.getText() != "" && btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText()) return true;
        if(btn3.getText() != "" && btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText()) return true;
        return false;
    }
    
    public boolean sameDiagonal(){
        if(btn1.getText() != "" && btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText()) return true;
        if(btn3.getText() != "" && btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText()) return true;
        return false;
    }
    
    public boolean isBoardFull(){
        if(btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "" &&
                btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "" && 
                btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != ""){
            return true;
        }
        return false;
    }
    
    public void markAllTrue(){
        isbtn1Pressed = true;
        isbtn2Pressed = true;
        isbtn3Pressed = true;
        isbtn4Pressed = true;
        isbtn5Pressed = true;
        isbtn6Pressed = true;
        isbtn7Pressed = true;
        isbtn8Pressed = true;
        isbtn9Pressed = true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        resultPanel = new javax.swing.JLabel();
        btnResult = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(204, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Tic-Tac-Toe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Eras Bold ITC", 1, 24))); // NOI18N

        btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        resultPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resultPanel.setForeground(new java.awt.Color(255, 0, 51));
        resultPanel.setAlignmentX(0.5F);

        btnResult.setBackground(new java.awt.Color(0, 0, 0));
        btnResult.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnResult.setForeground(new java.awt.Color(204, 204, 255));
        btnResult.setText("Restart");
        btnResult.setAlignmentX(0.5F);
        btnResult.setBorder(null);
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        resultLabel.setBackground(new java.awt.Color(255, 255, 255));
        resultLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(84, 84, 247));
        resultLabel.setText("                                    ");
        resultLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(resultPanel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(resultLabel)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultPanel)
                .addGap(18, 18, 18)
                .addComponent(resultLabel)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(isbtn1Pressed) return;
        currentPlayer();
        btn1.setText(currPlayer);
        isbtn1Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(isbtn2Pressed) return;
        currentPlayer();
        btn2.setText(currPlayer);
        isbtn2Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if(isbtn4Pressed) return;
        currentPlayer();
        btn4.setText(currPlayer);
        isbtn4Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if(isbtn3Pressed) return;
        currentPlayer();
        btn3.setText(currPlayer);
        isbtn3Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if(isbtn7Pressed) return;
        currentPlayer();
        btn7.setText(currPlayer);
        isbtn7Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if(isbtn5Pressed) return;
        currentPlayer();
        btn5.setText(currPlayer);
        isbtn5Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if(isbtn8Pressed) return;
        currentPlayer();
        btn8.setText(currPlayer);
        isbtn8Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if(isbtn6Pressed) return;
        currentPlayer();
        btn6.setText(currPlayer);
        isbtn6Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if(isbtn9Pressed) return;
        currentPlayer();
        btn9.setText(currPlayer);
        isbtn9Pressed = true;
        if(sameRow() || sameColumn() || sameDiagonal()){
            resultLabel.setText("Player "+currPlayer+" Wins!!! :-)");
            markAllTrue();
        }
        else if(isBoardFull()){
            resultLabel.setText("Match Drawn! :-( ");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnResultActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnResult;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel resultPanel;
    // End of variables declaration//GEN-END:variables
}
