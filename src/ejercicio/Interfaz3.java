/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author DanielDeJesus
 */
public class Interfaz3 extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz3
     */
    public Interfaz3() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMontoAhorrado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMontoFinal = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("Ejercicio Número 3: Calcular el monto final del ahorrador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Monto ahorrado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtMontoAhorrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoAhorradoActionPerformed(evt);
            }
        });
        txtMontoAhorrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAhorradoKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoAhorrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, -1));

        jLabel3.setText("Monto final:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtMontoFinal.setEditable(false);
        txtMontoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoFinalKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoAhorradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoAhorradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoAhorradoActionPerformed

    private void txtMontoAhorradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAhorradoKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtMontoAhorradoKeyTyped

    private void txtMontoFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoFinalKeyTyped
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtMontoFinalKeyTyped

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtMontoAhorrado.setText("");
        txtMontoFinal.setText("");
        
        txtMontoAhorrado.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String res;
        double montoInicial, op, opf;
        
        if(txtMontoAhorrado.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite el monto ahorrado","Error", JOptionPane.ERROR_MESSAGE);
            txtMontoAhorrado.requestFocusInWindow();
        }
        else{
        
        montoInicial = Double.parseDouble(txtMontoAhorrado.getText());
        
        op = montoInicial * 0.15;
        opf = montoInicial + op;
        
        res = String.valueOf(opf);
        txtMontoFinal.setText(res);
        } 
    }//GEN-LAST:event_cmdCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMontoAhorrado;
    private javax.swing.JTextField txtMontoFinal;
    // End of variables declaration//GEN-END:variables
}
