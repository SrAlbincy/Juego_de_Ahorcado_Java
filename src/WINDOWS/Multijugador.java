/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WINDOWS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Multijugador extends javax.swing.JFrame {

    String JugadorInicial;
    int vidas = 8;
    String vidas_string;
    String Pal = "";
    String PalaConvert = "";
    String[] NewPalabra = new String[0];
    int colourGanamosPerdimos;
    String[] PalabrasGlobal = new String[100];

    //SIN PRESIONAR
    boolean a = false;
    boolean b = false;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    boolean n = false;
    boolean ñ = false;
    boolean o = false;
    boolean p = false;
    boolean q = false;
    boolean r = false;
    boolean s = false;
    boolean t = false;
    boolean u = false;
    boolean v = false;
    boolean w = false;
    boolean x = false;
    boolean y = false;
    boolean z = false;

    public Multijugador() {

        initComponents();
        this.setLocationRelativeTo(null);
        contenedor.setVisible(true);
        Jp_Juego.setVisible(false);
        rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/0.jpg");

        boolean jugar = false;
        Palabra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jp_Juego = new javax.swing.JPanel();
        Jl_vidas = new javax.swing.JLabel();
        muñeco = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        txt_viewpalabra = new javax.swing.JLabel();
        btn_a = new javax.swing.JButton();
        btn_b = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_d = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_f = new javax.swing.JButton();
        btn_g = new javax.swing.JButton();
        btn_h = new javax.swing.JButton();
        btn_i = new javax.swing.JButton();
        btn_j = new javax.swing.JButton();
        btn_k = new javax.swing.JButton();
        btn_l = new javax.swing.JButton();
        btn_m = new javax.swing.JButton();
        btn_N = new javax.swing.JButton();
        btn_o = new javax.swing.JButton();
        btn_p = new javax.swing.JButton();
        btn_q = new javax.swing.JButton();
        btn_r = new javax.swing.JButton();
        btn_s = new javax.swing.JButton();
        btn_t = new javax.swing.JButton();
        btn_u = new javax.swing.JButton();
        btn_v = new javax.swing.JButton();
        btn_w = new javax.swing.JButton();
        btn_x = new javax.swing.JButton();
        btn_y = new javax.swing.JButton();
        btn_n = new javax.swing.JButton();
        btn_z = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();
        txt_palabra = new javax.swing.JPasswordField();
        btn_jugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1017, 586));

        Jp_Juego.setBackground(new java.awt.Color(153, 255, 204));
        Jp_Juego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jl_vidas.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        Jl_vidas.setForeground(new java.awt.Color(204, 0, 51));
        Jl_vidas.setText("VIDAS: ");
        Jp_Juego.add(Jl_vidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 215, -1));

        muñeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/0.jpg"))); // NOI18N
        muñeco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        Jp_Juego.add(muñeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 267, 337));

        jugador1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jugador1.setForeground(new java.awt.Color(102, 102, 102));
        jugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador1.setText("JUGADOR");
        Jp_Juego.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        txt_viewpalabra.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txt_viewpalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jp_Juego.add(txt_viewpalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 650, 53));

        btn_a.setBackground(new java.awt.Color(255, 255, 153));
        btn_a.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_a.setText("A");
        btn_a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_a.setFocusPainted(false);
        btn_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aMouseClicked(evt);
            }
        });
        Jp_Juego.add(btn_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 40));

        btn_b.setBackground(new java.awt.Color(255, 255, 153));
        btn_b.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_b.setText("B");
        btn_b.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_b.setFocusPainted(false);
        btn_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bMouseClicked(evt);
            }
        });
        Jp_Juego.add(btn_b, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 70, 40));

        btn_c.setBackground(new java.awt.Color(255, 255, 153));
        btn_c.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_c.setText("C");
        btn_c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_c.setFocusPainted(false);
        btn_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cMouseClicked(evt);
            }
        });
        Jp_Juego.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 70, 40));

        btn_d.setBackground(new java.awt.Color(255, 255, 153));
        btn_d.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_d.setText("D");
        btn_d.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_d.setFocusPainted(false);
        btn_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 70, 40));

        btn_e.setBackground(new java.awt.Color(255, 255, 153));
        btn_e.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_e.setText("E");
        btn_e.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_e.setFocusPainted(false);
        btn_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 70, 40));

        btn_f.setBackground(new java.awt.Color(255, 255, 153));
        btn_f.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_f.setText("F");
        btn_f.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_f.setFocusPainted(false);
        btn_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 70, 40));

        btn_g.setBackground(new java.awt.Color(255, 255, 153));
        btn_g.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_g.setText("G");
        btn_g.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_g.setFocusPainted(false);
        btn_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_g, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, 40));

        btn_h.setBackground(new java.awt.Color(255, 255, 153));
        btn_h.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_h.setText("H");
        btn_h.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_h.setFocusPainted(false);
        btn_h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_h, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 70, 40));

        btn_i.setBackground(new java.awt.Color(255, 255, 153));
        btn_i.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_i.setText("I");
        btn_i.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_i.setFocusPainted(false);
        btn_i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 70, 40));

        btn_j.setBackground(new java.awt.Color(255, 255, 153));
        btn_j.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_j.setText("J");
        btn_j.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_j.setFocusPainted(false);
        btn_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_j, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, 40));

        btn_k.setBackground(new java.awt.Color(255, 255, 153));
        btn_k.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_k.setText("K");
        btn_k.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_k.setFocusPainted(false);
        btn_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_k, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 70, 40));

        btn_l.setBackground(new java.awt.Color(255, 255, 153));
        btn_l.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_l.setText("L");
        btn_l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_l.setFocusPainted(false);
        btn_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 70, 40));

        btn_m.setBackground(new java.awt.Color(255, 255, 153));
        btn_m.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_m.setText("M");
        btn_m.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_m.setFocusPainted(false);
        btn_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 70, 40));

        btn_N.setBackground(new java.awt.Color(255, 255, 153));
        btn_N.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_N.setText("N");
        btn_N.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_N.setFocusPainted(false);
        btn_N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_N, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 70, 40));

        btn_o.setBackground(new java.awt.Color(255, 255, 153));
        btn_o.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        btn_o.setText("Ñ");
        btn_o.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_o.setFocusPainted(false);
        btn_o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_o, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 70, 40));

        btn_p.setBackground(new java.awt.Color(255, 255, 153));
        btn_p.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_p.setText("O");
        btn_p.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_p.setFocusPainted(false);
        btn_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 70, 40));

        btn_q.setBackground(new java.awt.Color(255, 255, 153));
        btn_q.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_q.setText("P");
        btn_q.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_q.setFocusPainted(false);
        btn_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 70, 40));

        btn_r.setBackground(new java.awt.Color(255, 255, 153));
        btn_r.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_r.setText("Q");
        btn_r.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_r.setFocusPainted(false);
        btn_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_r, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 70, 40));

        btn_s.setBackground(new java.awt.Color(255, 255, 153));
        btn_s.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_s.setText("R");
        btn_s.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_s.setFocusPainted(false);
        btn_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 70, 40));

        btn_t.setBackground(new java.awt.Color(255, 255, 153));
        btn_t.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_t.setText("S");
        btn_t.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_t.setFocusPainted(false);
        btn_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 70, 40));

        btn_u.setBackground(new java.awt.Color(255, 255, 153));
        btn_u.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_u.setText("T");
        btn_u.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_u.setFocusPainted(false);
        btn_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 70, 40));

        btn_v.setBackground(new java.awt.Color(255, 255, 153));
        btn_v.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_v.setText("U");
        btn_v.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_v.setFocusPainted(false);
        btn_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_v, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 70, 40));

        btn_w.setBackground(new java.awt.Color(255, 255, 153));
        btn_w.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_w.setText("V");
        btn_w.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_w.setFocusPainted(false);
        btn_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_w, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 70, 40));

        btn_x.setBackground(new java.awt.Color(255, 255, 153));
        btn_x.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_x.setText("W");
        btn_x.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_x.setFocusPainted(false);
        btn_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 70, 40));

        btn_y.setBackground(new java.awt.Color(255, 255, 153));
        btn_y.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_y.setText("X");
        btn_y.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_y.setFocusPainted(false);
        btn_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_y, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 70, 40));

        btn_n.setBackground(new java.awt.Color(255, 255, 153));
        btn_n.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_n.setText("Z");
        btn_n.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_n.setFocusPainted(false);
        btn_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 70, 40));

        btn_z.setBackground(new java.awt.Color(255, 255, 153));
        btn_z.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_z.setText("Y");
        btn_z.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_z.setFocusPainted(false);
        btn_z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zActionPerformed(evt);
            }
        });
        Jp_Juego.add(btn_z, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 70, 40));

        contenedor.setBackground(new java.awt.Color(153, 255, 204));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Monotype Corsiva", 0, 128)); // NOI18N
        titulo.setText("Ahorcado");
        contenedor.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 441, -1));

        jugador.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jugador.setForeground(new java.awt.Color(102, 102, 102));
        jugador.setText("JUGADOR");
        contenedor.add(jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txt_palabra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contenedor.add(txt_palabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 334, 46));

        btn_jugar.setBackground(new java.awt.Color(204, 204, 204));
        btn_jugar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btn_jugar.setText("Jugar");
        btn_jugar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        btn_jugar.setFocusPainted(false);
        btn_jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jugarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jugarMouseExited(evt);
            }
        });
        contenedor.add(btn_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 191, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icon_waring.png"))); // NOI18N
        contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Por favor, Coloque la palabra que el siguiente jugador deba adivinar");
        contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 502, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jp_Juego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jp_Juego, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jugarMouseEntered
        // TOQUE DE COLOR AL BOTON AL ENTAR
        btn_jugar.setBackground(new java.awt.Color(255, 255, 153));
    }//GEN-LAST:event_btn_jugarMouseEntered

    private void btn_jugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jugarMouseExited
        // TOQUE DE COLOR AL BOTON AL SALIR
        btn_jugar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_btn_jugarMouseExited

    private void btn_jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jugarMouseClicked
        // TODO add your handling code here:
        Palabra = txt_palabra.getText();
        String PalabraConv = Palabra.toLowerCase();
        PalaConvert = PalabraConv;

        if (PalabraConv.length() <= 2 || HayNumero(PalabraConv) || HayEspace(PalabraConv)) {
            JOptionPane.showMessageDialog(null, "por favor, solo ingresar palabras con 3 o más caracteres, sin numeros y sin Espacios", "Palabra no valida", JOptionPane.WARNING_MESSAGE);
        } else {
            contenedor.setVisible(false);
            Jp_Juego.setVisible(true);
            boolean existe = ExistePalabra(PalabraConv.length(), PalabraConv);
            
            if(!existe){
                ArchivosPalabra(PalabraConv.length(), PalabraConv);
            }          
            Jugar(PalabraConv);
        }

        System.out.println(PalabraConv);
        System.out.println(HayNumero(PalabraConv));

    }//GEN-LAST:event_btn_jugarMouseClicked

    private void btn_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aMouseClicked
        // BOTON A
        if (a == false) {
            String letra = "a";
            BuscarPalabra(letra);
            btn_a.setBackground(new java.awt.Color(204, 204, 204));
            btn_a.setEnabled(false);
        }
        a = true;
    }//GEN-LAST:event_btn_aMouseClicked

    private void btn_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bMouseClicked
        // TODO add your handling code here:
        if (b == false) {
            String letra = "b";
            BuscarPalabra(letra);
            btn_b.setBackground(new java.awt.Color(204, 204, 204));
            btn_b.setEnabled(false);
        }
        b = true;
    }//GEN-LAST:event_btn_bMouseClicked

    private void btn_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cMouseClicked
        // TODO add your handling code here:
        if (c == false) {
            String letra = "c";
            BuscarPalabra(letra);
            btn_c.setBackground(new java.awt.Color(204, 204, 204));
            btn_c.setEnabled(false);
        }
        c = true;
    }//GEN-LAST:event_btn_cMouseClicked

    private void btn_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dActionPerformed
        // TODO add your handling code here:
        if (d == false) {
            String letra = "d";
            BuscarPalabra(letra);
            btn_d.setBackground(new java.awt.Color(204, 204, 204));
            btn_d.setEnabled(false);
        }
        d = true;
    }//GEN-LAST:event_btn_dActionPerformed

    private void btn_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eActionPerformed
        // TODO add your handling code here:
        if (e == false) {
            String letra = "e";
            BuscarPalabra(letra);
            btn_e.setBackground(new java.awt.Color(204, 204, 204));
            btn_e.setEnabled(false);
        }
        e = true;
    }//GEN-LAST:event_btn_eActionPerformed

    private void btn_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fActionPerformed
        // TODO add your handling code here:
        if (f == false) {
            String letra = "f";
            BuscarPalabra(letra);
            btn_f.setBackground(new java.awt.Color(204, 204, 204));
            btn_f.setEnabled(false);
        }
        f = true;
    }//GEN-LAST:event_btn_fActionPerformed

    private void btn_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gActionPerformed
        // TODO add your handling code here:
        if (g == false) {
            String letra = "g";
            BuscarPalabra(letra);
            btn_g.setBackground(new java.awt.Color(204, 204, 204));
            btn_g.setEnabled(false);
        }
        g = true;
    }//GEN-LAST:event_btn_gActionPerformed

    private void btn_hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hActionPerformed
        // TODO add your handling code here:
        if (h == false) {
            String letra = "h";
            BuscarPalabra(letra);
            btn_h.setBackground(new java.awt.Color(204, 204, 204));
            btn_h.setEnabled(false);
        }
        h = true;
    }//GEN-LAST:event_btn_hActionPerformed

    private void btn_iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iActionPerformed
        // TODO add your handling code here:
        if (i == false) {
            String letra = "i";
            BuscarPalabra(letra);
            btn_i.setBackground(new java.awt.Color(204, 204, 204));
            btn_i.setEnabled(false);
        }
        i = true;
    }//GEN-LAST:event_btn_iActionPerformed

    private void btn_jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jActionPerformed
        // TODO add your handling code here:
        if (j == false) {
            String letra = "j";
            BuscarPalabra(letra);
            btn_j.setBackground(new java.awt.Color(204, 204, 204));
            btn_j.setEnabled(false);
        }
        j = true;
    }//GEN-LAST:event_btn_jActionPerformed

    private void btn_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kActionPerformed
        // TODO add your handling code here:
        if (k == false) {
            String letra = "k";
            BuscarPalabra(letra);
            btn_k.setBackground(new java.awt.Color(204, 204, 204));
            btn_k.setEnabled(false);
        }
        k = true;
    }//GEN-LAST:event_btn_kActionPerformed

    private void btn_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lActionPerformed
        // TODO add your handling code here:
        if (l == false) {
            String letra = "l";
            BuscarPalabra(letra);
            btn_l.setBackground(new java.awt.Color(204, 204, 204));
            btn_l.setEnabled(false);
        }
        l = true;
    }//GEN-LAST:event_btn_lActionPerformed

    private void btn_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mActionPerformed
        // TODO add your handling code here:
        if (m == false) {
            String letra = "m";
            BuscarPalabra(letra);
            btn_m.setBackground(new java.awt.Color(204, 204, 204));
            btn_m.setEnabled(false);
        }
        m = true;
    }//GEN-LAST:event_btn_mActionPerformed

    private void btn_NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NActionPerformed
        // TODO add your handling code here:
        if (n == false) {
            String letra = "n";
            BuscarPalabra(letra);
            btn_N.setBackground(new java.awt.Color(204, 204, 204));
            btn_N.setEnabled(false);
        }
        n = true;
    }//GEN-LAST:event_btn_NActionPerformed

    private void btn_oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oActionPerformed
        // TODO add your handling code here:
        if (ñ == false) {
            String letra = "ñ";
            BuscarPalabra(letra);
            btn_o.setBackground(new java.awt.Color(204, 204, 204));
            btn_o.setEnabled(false);
        }
        ñ = true;
    }//GEN-LAST:event_btn_oActionPerformed

    private void btn_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pActionPerformed
        // TODO add your handling code here:
        if (o == false) {
            String letra = "o";
            BuscarPalabra(letra);
            btn_p.setBackground(new java.awt.Color(204, 204, 204));
            btn_p.setEnabled(false);
        }
        o = true;
    }//GEN-LAST:event_btn_pActionPerformed

    private void btn_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qActionPerformed
        // TODO add your handling code here:
        if (p == false) {
            String letra = "p";
            BuscarPalabra(letra);
            btn_q.setBackground(new java.awt.Color(204, 204, 204));
            btn_q.setEnabled(false);
        }
        p = true;
    }//GEN-LAST:event_btn_qActionPerformed

    private void btn_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rActionPerformed
        // TODO add your handling code here:
        if (q == false) {
            String letra = "q";
            BuscarPalabra(letra);
            btn_r.setBackground(new java.awt.Color(204, 204, 204));
            btn_r.setEnabled(false);
        }
        q = true;
    }//GEN-LAST:event_btn_rActionPerformed

    private void btn_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sActionPerformed
        // TODO add your handling code here:
        if (r == false) {
            String letra = "r";
            BuscarPalabra(letra);
            btn_s.setBackground(new java.awt.Color(204, 204, 204));
            btn_s.setEnabled(false);
        }
        r = true;
    }//GEN-LAST:event_btn_sActionPerformed

    private void btn_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tActionPerformed
        // TODO add your handling code here:
        if (s == false) {
            String letra = "s";
            BuscarPalabra(letra);
            btn_t.setBackground(new java.awt.Color(204, 204, 204));
            btn_t.setEnabled(false);
        }
        s = true;
    }//GEN-LAST:event_btn_tActionPerformed

    private void btn_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uActionPerformed
        // TODO add your handling code here:
        if (t == false) {
            String letra = "t";
            BuscarPalabra(letra);
            btn_u.setBackground(new java.awt.Color(204, 204, 204));
            btn_u.setEnabled(false);
        }
        t = true;
    }//GEN-LAST:event_btn_uActionPerformed

    private void btn_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vActionPerformed
        // TODO add your handling code here:
        if (u == false) {
            String letra = "u";
            BuscarPalabra(letra);
            btn_v.setBackground(new java.awt.Color(204, 204, 204));
            btn_v.setEnabled(false);
        }
        u = true;
    }//GEN-LAST:event_btn_vActionPerformed

    private void btn_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wActionPerformed
        // TODO add your handling code here:
        if (v == false) {
            String letra = "v";
            BuscarPalabra(letra);
            btn_w.setBackground(new java.awt.Color(204, 204, 204));
            btn_w.setEnabled(false);
        }
        v = true;
    }//GEN-LAST:event_btn_wActionPerformed

    private void btn_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xActionPerformed
        // TODO add your handling code here:
        if (w == false) {
            String letra = "w";
            BuscarPalabra(letra);
            btn_x.setBackground(new java.awt.Color(204, 204, 204));
            btn_x.setEnabled(false);
        }
        w = true;
    }//GEN-LAST:event_btn_xActionPerformed

    private void btn_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yActionPerformed
        // TODO add your handling code here:
        if (x == false) {
            String letra = "x";
            BuscarPalabra(letra);
            btn_y.setBackground(new java.awt.Color(204, 204, 204));
            btn_y.setEnabled(false);
        }
        x = true;
    }//GEN-LAST:event_btn_yActionPerformed

    private void btn_zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zActionPerformed
        // TODO add your handling code here:
        if (y == false) {
            String letra = "y";
            BuscarPalabra(letra);
            btn_z.setBackground(new java.awt.Color(204, 204, 204));
            btn_z.setEnabled(false);
        }
        y = true;
    }//GEN-LAST:event_btn_zActionPerformed

    private void btn_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nActionPerformed
        // TODO add your handling code here:
        if (z == false) {
            String letra = "z";
            BuscarPalabra(letra);
            btn_n.setBackground(new java.awt.Color(204, 204, 204));
            btn_n.setEnabled(false);
        }
        z = true;
    }//GEN-LAST:event_btn_nActionPerformed

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
            java.util.logging.Logger.getLogger(Multijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multijugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multijugador().setVisible(true);
            }
        });
    }

    public void ArchivosPalabra(int largo, String palabra) {

        File archivo; //Manipular archivo
        FileWriter escribir;//Para escribir en el archivo
        PrintWriter linea; //Para escribir en el archivo

        //Elegir en que modo se va guardar la palabra
        if (largo <= 4) { //Facil
            archivo = new File("GameMode_Facil.txt");
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else if ((largo > 4) && (largo <= 8)) {//Mediano
            archivo = new File("GameMode_Normal.txt");
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else if (largo > 8) {//Dificil
            archivo = new File("GameMode_Dificil.txt");
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    //Escribir en el archivo
                    linea.println(palabra);
                    linea.close();
                    escribir.close();
                } catch (IOException ex) {
                    Logger.getLogger(Multijugador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void Palabra() {

        //QUE JUGADOR VA PRIMERO
        //VARIABLES
        int n1 = 1;
        int n2 = 100;

        //FUNCIONES
        int Decicion = (int) (Math.random() * (n2 - n1)) + n1;
        if (Decicion > 50) {
            JugadorInicial = "2";
        } else {
            JugadorInicial = "1";
        }

        jugador.setVisible(true);
        jugador.setText("JUGADOR " + JugadorInicial);
    }

    public void Jugar(String Palabra) {

        ActualizarVidas();
        String JugadorAdivinar;
        //COLOCA AL JUGAR QUE VA A ADIVINAR

        if (JugadorInicial == "1") {
            JugadorAdivinar = "2";
            jugador1.setText("JUGADOR " + JugadorAdivinar);
        } else {
            JugadorAdivinar = "1";
            jugador1.setText("JUGADOR " + JugadorAdivinar);
        }

        //SYSTEMA DE PALABRA
        int cont = Palabra.length();
        NewPalabra = new String[cont]; //New Palabra = [][][][];
        NewPalabra = PalabraGuiones(Palabra);
        //PARTE GRAFICA
        for (int i = 0; i < NewPalabra.length; i++) {

            Pal += NewPalabra[i] + " ";  //Pal = _ _ _ _  
        }
        txt_viewpalabra.setText(Pal);

        System.out.println(Pal);
    }

    public void BuscarPalabra(String letra) {

        String PalabraYaconvertida = PalaConvert;
        String[] Palabraf = PalabraGuiones(PalabraYaconvertida);
        boolean correcta = false;

        for (int i = 0; i < PalabraYaconvertida.length(); i++) {
            if (PalabraYaconvertida.charAt(i) == letra.charAt(0)) { //casa      a   arreglo = [_][a][_][a]
                Palabraf[i] = letra;
                NewPalabra[i] = Palabraf[i];
                correcta = true;
            }
        }

        //VERLO EN LO VISUAL
        if (!correcta) {
            vidas--;
            ActualizarVidas();
        } else {
            txt_viewpalabra.setText("");
            Pal = "";
            for (int i = 0; i < Palabraf.length; i++) {
                Pal += NewPalabra[i] + " "; // arreglo = [_][a][_][a]
            }
            txt_viewpalabra.setText(Pal);
        }
        correcta = false;

        //PROCESO DEL JUEGO
        boolean ganamos = Ganamos(NewPalabra);
        Resultado_G res = new Resultado_G();
        Resultado_P resp = new Resultado_P();

        if ((ganamos == true) && (vidas > 0)) {
            System.out.println("FELICIDADES GANASTE");
            res.setVisible(true);
            this.setVisible(false);
        } else if (vidas == 0) {
            System.out.println("FELICIDADES PERDISTE");
            resp.setVisible(true);
            this.setVisible(false);
        }
    }

    public void ActualizarVidas() {
        if (vidas <= 0) {
            vidas = 0;
        }

        vidas_string = String.valueOf(vidas);
        Jl_vidas.setText("VIDAS: " + vidas_string);

        if (vidas == 8) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/0.jpg");
        } else if (vidas == 7) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/1.jpg");
        } else if (vidas == 6) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/2.jpg");
        } else if (vidas == 5) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/3.jpg");
        } else if (vidas == 4) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/4.jpg");
        } else if (vidas == 3) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/5.jpg");
        } else if (vidas == 2) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/6.jpg");
        } else if (vidas == 1) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/7.jpg");
        } else if (vidas == 0) {
            rsscalelabel.RSScaleLabel.setScaleLabel(muñeco, "src/IMAGE/8.jpg");
        }
    }

    public static boolean HayNumero(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if ((palabra.charAt(i) == '0') || (palabra.charAt(i) == '1') || (palabra.charAt(i) == '2') || (palabra.charAt(i) == '3') || (palabra.charAt(i) == '4') || (palabra.charAt(i) == '5') || (palabra.charAt(i) == '6') || (palabra.charAt(i) == '7') || (palabra.charAt(i) == '8') || (palabra.charAt(i) == '9')) {
                return true;
            }
        }
        return false;
    }

    public static boolean HayEspace(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

    public static String[] PalabraGuiones(String Palabra) {

        int cont = Palabra.length();
        String[] palabra_guines = new String[cont];

        for (int i = 0; i < palabra_guines.length; i++) {
            palabra_guines[i] = "_"; //areglo = [_][_][_][_]
        }
        return palabra_guines;
    }

    public static boolean Ganamos(String[] pal) {

        for (int i = 0; i < pal.length; i++) {
            if (pal[i] == "_") {
                return false;
            }
        }
        return true;
    }
    
    public static boolean ExistePalabra(int largo, String palabra){
        
        boolean Exist = false;
        
        if(largo <=4){
            File archivo;
            FileReader leer;
            String cadena = "";
            archivo = new File("GameMode_Facil.txt");
            
            try {
                leer = new FileReader(archivo);
                BufferedReader alm = new BufferedReader(leer);

                while (cadena != null) {
                    try {
                        cadena = alm.readLine();
                        //System.out.println(cadena);
                        if(palabra.equals(cadena)){
                            Exist = true;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                try {
                    alm.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if ((largo > 4) && (largo <= 8)){
            File archivo;
            FileReader leer;
            String cadena = "";
            int i=0;
            archivo = new File("GameMode_Normal.txt");

            try {
                leer = new FileReader(archivo);
                BufferedReader alm = new BufferedReader(leer);

                while (cadena != null) {
                    try {
                        cadena = alm.readLine();
                        if(palabra.equals(cadena)){
                            Exist = true;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                try {
                    alm.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(largo >=9){
            File archivo;
            FileReader leer;
            String cadena = "";
            int i=0;
            archivo = new File("GameMode_Dificil.txt");

            try {
                leer = new FileReader(archivo);
                BufferedReader alm = new BufferedReader(leer);

                while (cadena != null) {
                    try {
                        cadena = alm.readLine();
                        if(palabra.equals(cadena)){
                            Exist = true;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                try {
                    alm.close();
                    leer.close();
                } catch (IOException ex) {
                    Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(UnJugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(Exist){
            return true;
        }else{
            return false;
        }         
    }

    private String Palabra;

    public String getPalabra() {
        return Palabra;
    }

    /**
     * @param Palabra the Palabra to set
     */
    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jl_vidas;
    private javax.swing.JPanel Jp_Juego;
    private javax.swing.JButton btn_N;
    private javax.swing.JButton btn_a;
    private javax.swing.JButton btn_b;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_d;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_f;
    private javax.swing.JButton btn_g;
    private javax.swing.JButton btn_h;
    private javax.swing.JButton btn_i;
    private javax.swing.JButton btn_j;
    private javax.swing.JButton btn_jugar;
    private javax.swing.JButton btn_k;
    private javax.swing.JButton btn_l;
    private javax.swing.JButton btn_m;
    private javax.swing.JButton btn_n;
    private javax.swing.JButton btn_o;
    private javax.swing.JButton btn_p;
    private javax.swing.JButton btn_q;
    private javax.swing.JButton btn_r;
    private javax.swing.JButton btn_s;
    private javax.swing.JButton btn_t;
    private javax.swing.JButton btn_u;
    private javax.swing.JButton btn_v;
    private javax.swing.JButton btn_w;
    private javax.swing.JButton btn_x;
    private javax.swing.JButton btn_y;
    private javax.swing.JButton btn_z;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jugador;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel muñeco;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txt_palabra;
    private javax.swing.JLabel txt_viewpalabra;
    // End of variables declaration//GEN-END:variables
}
