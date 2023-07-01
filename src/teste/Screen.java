/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teste;

import java.awt.Color;

/**
 *
 * @author pedro
 */
public class Screen extends javax.swing.JFrame {
    private String Calculation = "";
    private String last = "";
    /**
     * Creates new form Screen
     */
    public Screen() {
        super("Calculadora");
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        CalculationField.setText(" 0");
    }
    
    public void PushNumber(String number){
        Calculation = Calculation + number;
        CalculationField.setText(Calculation);
        last = number;
    }
    public void PushOperator(String number){
        if (!(last == "÷" || last == "=" || last == "+" || last == "-" || last == "×")){
            if (CalculationField.getText() != " 0"){
                this.PushNumber(number);
            }   
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

        Calculadora = new javax.swing.JPanel();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        For = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Divided = new javax.swing.JButton();
        Times = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Point = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Clean = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        CalculationField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calculadora.setBackground(new java.awt.Color(0, 0, 0));

        Seven.setBackground(new java.awt.Color(51, 51, 51));
        Seven.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Seven.setForeground(new java.awt.Color(255, 255, 255));
        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Eight.setBackground(new java.awt.Color(51, 51, 51));
        Eight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Eight.setForeground(new java.awt.Color(255, 255, 255));
        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });

        Nine.setBackground(new java.awt.Color(51, 51, 51));
        Nine.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Nine.setForeground(new java.awt.Color(255, 255, 255));
        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });

        Six.setBackground(new java.awt.Color(51, 51, 51));
        Six.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Six.setForeground(new java.awt.Color(255, 255, 255));
        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });

        For.setBackground(new java.awt.Color(51, 51, 51));
        For.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        For.setForeground(new java.awt.Color(255, 255, 255));
        For.setText("4");
        For.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForActionPerformed(evt);
            }
        });

        Five.setBackground(new java.awt.Color(51, 51, 51));
        Five.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Five.setForeground(new java.awt.Color(255, 255, 255));
        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });

        Three.setBackground(new java.awt.Color(51, 51, 51));
        Three.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Three.setForeground(new java.awt.Color(255, 255, 255));
        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });

        One.setBackground(new java.awt.Color(51, 51, 51));
        One.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        One.setForeground(new java.awt.Color(255, 255, 255));
        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });

        Two.setBackground(new java.awt.Color(51, 51, 51));
        Two.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Two.setForeground(new java.awt.Color(255, 255, 255));
        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });

        Divided.setBackground(new java.awt.Color(255, 125, 0));
        Divided.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Divided.setForeground(new java.awt.Color(255, 255, 255));
        Divided.setText("÷");
        Divided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividedActionPerformed(evt);
            }
        });

        Times.setBackground(new java.awt.Color(255, 125, 0));
        Times.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Times.setForeground(new java.awt.Color(255, 255, 255));
        Times.setText("×");
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });

        Minus.setBackground(new java.awt.Color(255, 125, 0));
        Minus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Minus.setForeground(new java.awt.Color(255, 255, 255));
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setBackground(new java.awt.Color(255, 125, 0));
        Plus.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Plus.setForeground(new java.awt.Color(255, 255, 255));
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Point.setBackground(new java.awt.Color(51, 51, 51));
        Point.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Point.setForeground(new java.awt.Color(255, 255, 255));
        Point.setText(",");
        Point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointActionPerformed(evt);
            }
        });

        Zero.setBackground(new java.awt.Color(51, 51, 51));
        Zero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Zero.setForeground(new java.awt.Color(255, 255, 255));
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });

        Clean.setBackground(new java.awt.Color(51, 51, 51));
        Clean.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Clean.setForeground(new java.awt.Color(255, 255, 255));
        Clean.setText("Clear");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        Equals.setBackground(new java.awt.Color(255, 125, 0));
        Equals.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Equals.setForeground(new java.awt.Color(255, 255, 255));
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        CalculationField.setEditable(false);
        CalculationField.setBackground(new java.awt.Color(0, 0, 0));
        CalculationField.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        CalculationField.setForeground(new java.awt.Color(255, 255, 255));
        CalculationField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        CalculationField.setText("0");
        CalculationField.setBorder(null);

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eight, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout.createSequentialGroup()
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CalculationField)
                            .addGroup(CalculadoraLayout.createSequentialGroup()
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CalculadoraLayout.createSequentialGroup()
                                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(CalculadoraLayout.createSequentialGroup()
                                                .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Two, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Three, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(CalculadoraLayout.createSequentialGroup()
                                                .addComponent(For, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Five, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Six, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout.createSequentialGroup()
                                        .addComponent(Zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Point, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Clean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Divided, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Times, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))))
        );
        CalculadoraLayout.setVerticalGroup(
            CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CalculationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Divided, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Seven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Eight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(For, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Times, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Six, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Three, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Two, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(One, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Point, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
        // TODO add your handling code here:
        this.PushNumber("9");
    }//GEN-LAST:event_NineActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
        // TODO add your handling code here:
        this.PushNumber("6");
    }//GEN-LAST:event_SixActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
        // TODO add your handling code here: 
        this.PushNumber("3");
    }//GEN-LAST:event_ThreeActionPerformed

    private void DividedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividedActionPerformed
        // TODO add your handling code here:
        this.PushOperator("÷");
    }//GEN-LAST:event_DividedActionPerformed

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed
        // TODO add your handling code here:
        this.PushOperator("×");
    }//GEN-LAST:event_TimesActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        // TODO add your handling code here:
        this.PushNumber("-");
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        // TODO add your handling code here:
        this.PushOperator("+");
    }//GEN-LAST:event_PlusActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
        // TODO add your handling code here:
        this.PushNumber("2");
    }//GEN-LAST:event_TwoActionPerformed

    private void PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointActionPerformed
        // TODO add your handling code here:
        this.PushOperator(",");
    }//GEN-LAST:event_PointActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        // TODO add your handling code here:
        this.PushNumber("7");
    }//GEN-LAST:event_SevenActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EqualsActionPerformed

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        // TODO add your handling code here:
        CalculationField.setText(" 0");
        Calculation = "";
    }//GEN-LAST:event_CleanActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
        // TODO add your handling code here:
        this.PushNumber("8");
    }//GEN-LAST:event_EightActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        // TODO add your handling code here:
        this.PushNumber("1");
    }//GEN-LAST:event_OneActionPerformed

    private void ForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForActionPerformed
        // TODO add your handling code here:
        this.PushNumber("4");
    }//GEN-LAST:event_ForActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        // TODO add your handling code here:
        this.PushNumber("0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed
        // TODO add your handling code here:
        this.PushNumber("5");
    }//GEN-LAST:event_FiveActionPerformed

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculadora;
    private javax.swing.JTextField CalculationField;
    private javax.swing.JButton Clean;
    private javax.swing.JButton Divided;
    private javax.swing.JButton Eight;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Five;
    private javax.swing.JButton For;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Point;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Three;
    private javax.swing.JButton Times;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    // End of variables declaration//GEN-END:variables
}
