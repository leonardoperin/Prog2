package calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Perin
 */
public class TelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
    }
    Calculadora calc = new Calculadora();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valor1 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        resultado = new javax.swing.JTextField();
        soma = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Valor 1:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Valor 2:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Resultado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        valor1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });
        getContentPane().add(valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, 30));

        valor2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2ActionPerformed(evt);
            }
        });
        getContentPane().add(valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 30));

        resultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, 40));

        soma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        soma.setText("Somar (+)");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        getContentPane().add(soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, -1));

        subtrair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        subtrair.setText("Subtrair (-)");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });
        getContentPane().add(subtrair, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 110, -1));

        mult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mult.setText("Multiplicar (*)");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        getContentPane().add(mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        dividir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dividir.setText("Dividir (/)");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        getContentPane().add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 110, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("CALCULADORA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Operações");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        limpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        getContentPane().add(limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2ActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
       calc.x = Float.valueOf(valor1.getText());
       calc.y = Float.valueOf(valor2.getText());
       calc.Soma();
       resultado.setText(String.valueOf(calc.resultado));
    }//GEN-LAST:event_somaActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
       calc.x= Float.valueOf(valor1.getText());
       calc.y= Float.valueOf(valor2.getText());
       calc.Divisao();
       resultado.setText(String.valueOf(calc.resultado));
    }//GEN-LAST:event_dividirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        resultado.setText("");
        valor1.setText("");
        valor2.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
       calc.x = Float.valueOf(valor1.getText());
       calc.y = Float.valueOf(valor2.getText());
       calc.Subtracao();
       resultado.setText(String.valueOf(calc.resultado));
    }//GEN-LAST:event_subtrairActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
       calc.x = Float.valueOf(valor1.getText());
       calc.y = Float.valueOf(valor2.getText());
       calc.Multiplicacao();
       resultado.setText(String.valueOf(calc.resultado));
    }//GEN-LAST:event_multActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limpar;
    private javax.swing.JButton mult;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton sair;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrair;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables

    private void Soma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Subtrair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Dividir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
