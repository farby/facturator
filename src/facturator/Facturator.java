package facturator;

public class Facturator extends javax.swing.JFrame {

    public Facturator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcr = new javax.swing.JFileChooser();
        lblTitulo = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        txtFactura = new javax.swing.JSpinner();
        lblEmisor = new javax.swing.JLabel();
        btnOca = new javax.swing.JButton();
        btnVisa = new javax.swing.JButton();
        btnMaster = new javax.swing.JButton();
        btnBrou = new javax.swing.JButton();
        btnBbva = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("FACTURATOR");

        lblFactura.setText("Nº Inicial de Factura");

        lblEmisor.setText("Seleccione tarjeta / banco");

        btnOca.setText("OCA");
        btnOca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcaActionPerformed(evt);
            }
        });

        btnVisa.setText("VISA");

        btnMaster.setText("MASTER");
        btnMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasterActionPerformed(evt);
            }
        });

        btnBrou.setText("BROU");
        btnBrou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrouActionPerformed(evt);
            }
        });

        btnBbva.setText("BBVA");
        btnBbva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBbvaActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 0));
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFactura, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFactura)
                            .addComponent(lblEmisor))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBrou, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBbva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblFactura)
                .addGap(18, 18, 18)
                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmisor)
                .addGap(18, 18, 18)
                .addComponent(btnOca)
                .addGap(18, 18, 18)
                .addComponent(btnVisa)
                .addGap(18, 18, 18)
                .addComponent(btnMaster)
                .addGap(18, 18, 18)
                .addComponent(btnBrou)
                .addGap(18, 18, 18)
                .addComponent(btnBbva)
                .addGap(18, 18, 18)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcaActionPerformed
        Oca oca = new Oca();
        oca.GenerarOca(fcr, msg, txtFactura.getValue().toString());
    }//GEN-LAST:event_btnOcaActionPerformed

    private void btnMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasterActionPerformed
        Master master = new Master();
        master.GenerarMaster(fcr, msg, txtFactura.getValue().toString());
        
    }//GEN-LAST:event_btnMasterActionPerformed

    private void btnBrouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrouActionPerformed
        Brou brou = new Brou();
        brou.GenerarBrou(fcr, msg, txtFactura.getValue().toString());
    }//GEN-LAST:event_btnBrouActionPerformed

    private void btnBbvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBbvaActionPerformed
        Bbva bbva = new Bbva();
        bbva.GenerarBbva(fcr, msg, txtFactura.getValue().toString());
    }//GEN-LAST:event_btnBbvaActionPerformed

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
            java.util.logging.Logger.getLogger(Facturator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBbva;
    private javax.swing.JButton btnBrou;
    private javax.swing.JButton btnMaster;
    private javax.swing.JButton btnOca;
    private javax.swing.JButton btnVisa;
    private javax.swing.JFileChooser fcr;
    private javax.swing.JLabel lblEmisor;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel msg;
    private javax.swing.JSpinner txtFactura;
    // End of variables declaration//GEN-END:variables
}
