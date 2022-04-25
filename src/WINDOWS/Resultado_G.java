package WINDOWS;

public class Resultado_G extends javax.swing.JFrame {
    
    Multijugador mul = new Multijugador();
    
    public Resultado_G() {
        initComponents();
        this.setLocationRelativeTo(null);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_reintentar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(786, 532));

        background.setBackground(new java.awt.Color(162, 231, 245));
        background.setPreferredSize(new java.awt.Dimension(1012, 300));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 95)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GANASTE");

        btn_reintentar.setBackground(new java.awt.Color(204, 204, 204));
        btn_reintentar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_reintentar.setText("Reintentar");
        btn_reintentar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        btn_reintentar.setFocusPainted(false);
        btn_reintentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reintentarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reintentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reintentarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(btn_reintentar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addGap(88, 88, 88)
                .addComponent(btn_reintentar)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reintentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reintentarMouseClicked
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_reintentarMouseClicked

    private void btn_reintentarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reintentarMouseEntered
        // TOQUE DE COLOR AL BOTON AL ENTAR
        btn_reintentar.setBackground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_btn_reintentarMouseEntered

    private void btn_reintentarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reintentarMouseExited
        // TOQUE DE COLOR AL BOTON AL SALIR
        btn_reintentar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_btn_reintentarMouseExited

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
            java.util.logging.Logger.getLogger(Resultado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado_G.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado_G().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_reintentar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
