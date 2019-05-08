
package Principal1;


public class MenuOpciones extends javax.swing.JFrame {

    
    public MenuOpciones()
    {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpTrapecio = new javax.swing.JMenuItem();
        OpSimpson = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(420, 230));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Integracion numerica");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 50, 186, 21);

        jLabel2.setFont(new java.awt.Font("DFGothic-EB", 0, 18)); // NOI18N
        jLabel2.setText("Metodo numericos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 70, 144, 19);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/FondoX.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 470, 290);

        jMenu1.setText("Menu Opciones");

        OpTrapecio.setText("Metodo Trapecio");
        OpTrapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpTrapecioActionPerformed(evt);
            }
        });
        jMenu1.add(OpTrapecio);

        OpSimpson.setText("Metodo Simpson");
        OpSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSimpsonActionPerformed(evt);
            }
        });
        jMenu1.add(OpSimpson);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpTrapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpTrapecioActionPerformed
        VentanaTrapecio open = new VentanaTrapecio();
        open.setVisible(true);
        open.setLocationRelativeTo(null);
    }//GEN-LAST:event_OpTrapecioActionPerformed

    private void OpSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSimpsonActionPerformed
        VentanaSimpson open = new VentanaSimpson();
        open.setVisible(true);
        open.setLocationRelativeTo(null);
    }//GEN-LAST:event_OpSimpsonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OpSimpson;
    private javax.swing.JMenuItem OpTrapecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
