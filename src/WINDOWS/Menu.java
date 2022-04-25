/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WINDOWS;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ACOMODAR LAS IMAGES
        //rsscalelabel.RSScaleLabel.setScaleLabel(btn_solitario, "src/IMAGE/boton.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_capa = new javax.swing.JPanel();
        beta = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_solitario = new javax.swing.JButton();
        btn_multijugador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jp_capa.setBackground(new java.awt.Color(153, 255, 204));

        beta.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        beta.setForeground(new java.awt.Color(51, 51, 51));
        beta.setText("Versión 1.1.0");

        titulo.setFont(new java.awt.Font("Monotype Corsiva", 0, 128)); // NOI18N
        titulo.setText("Ahorcado");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Universidad Mariano Galvez Zacapa | Albincy Carmona");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("©Ahorcado | 2022");

        btn_solitario.setBackground(new java.awt.Color(204, 204, 204));
        btn_solitario.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_solitario.setText("Un Jugador");
        btn_solitario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        btn_solitario.setFocusPainted(false);
        btn_solitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_solitarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_solitarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_solitarioMouseExited(evt);
            }
        });

        btn_multijugador.setBackground(new java.awt.Color(204, 204, 204));
        btn_multijugador.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_multijugador.setText("Dos Jugadores");
        btn_multijugador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        btn_multijugador.setFocusPainted(false);
        btn_multijugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_multijugadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_multijugadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_multijugadorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Jp_capaLayout = new javax.swing.GroupLayout(Jp_capa);
        Jp_capa.setLayout(Jp_capaLayout);
        Jp_capaLayout.setHorizontalGroup(
            Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_capaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jp_capaLayout.createSequentialGroup()
                        .addComponent(beta)
                        .addGap(122, 122, 122)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Jp_capaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jp_capaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_multijugador, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_solitario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(341, 341, 341))))
        );
        Jp_capaLayout.setVerticalGroup(
            Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_capaLayout.createSequentialGroup()
                .addGroup(Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jp_capaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(beta))
                    .addGroup(Jp_capaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_solitario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_multijugador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(Jp_capaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jp_capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_multijugadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multijugadorMouseEntered
        // TOQUE DE COLOR AL BOTON AL ENTAR
        btn_multijugador.setBackground(new java.awt.Color(255,255,153));
    }//GEN-LAST:event_btn_multijugadorMouseEntered

    private void btn_multijugadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multijugadorMouseExited
        // TOQUE DE COLOR AL BOTON AL SALIR
        btn_multijugador.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btn_multijugadorMouseExited

    private void btn_solitarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_solitarioMouseEntered
        // TOQUE DE COLOR AL BOTON AL ENTAR
        btn_solitario.setBackground(new java.awt.Color(255,255,153));
    }//GEN-LAST:event_btn_solitarioMouseEntered

    private void btn_solitarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_solitarioMouseExited
        // TOQUE DE COLOR AL BOTON AL SALIR
        btn_solitario.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_btn_solitarioMouseExited

    private void btn_multijugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_multijugadorMouseClicked
        // PASAR DE PANATALLA MULTIJUGADOR
        Multijugador p2 = new Multijugador();
        this.setVisible(false);
        p2.setVisible(true);
    }//GEN-LAST:event_btn_multijugadorMouseClicked

    private void btn_solitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_solitarioMouseClicked
        // TODO add your handling code here:
        UnJugador p1 = new UnJugador();
        this.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_btn_solitarioMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jp_capa;
    private javax.swing.JLabel beta;
    private javax.swing.JButton btn_multijugador;
    private javax.swing.JButton btn_solitario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
