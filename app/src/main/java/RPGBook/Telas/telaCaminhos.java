/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RPGBook.Telas;

import RPGBook.Models.Cenas;
import java.util.ArrayList;

public class TelaCaminhos extends javax.swing.JFrame {

    private ArrayList<Cenas> cenas = new ArrayList<>();
    private int cenaAtual = 0;
    
    
    public TelaCaminhos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mapaLabel = new javax.swing.JLabel();
        btnDireita = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areadeTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(843, 737));

        btnDireita.setBackground(new java.awt.Color(0, 0, 0));
        btnDireita.setForeground(new java.awt.Color(255, 255, 255));
        btnDireita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 7));
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });

        btnEsquerda.setBackground(new java.awt.Color(0, 0, 0));
        btnEsquerda.setForeground(new java.awt.Color(255, 255, 255));
        btnEsquerda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 7));
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        areadeTexto.setBackground(new java.awt.Color(0, 0, 0));
        areadeTexto.setColumns(20);
        areadeTexto.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        areadeTexto.setForeground(new java.awt.Color(255, 255, 255));
        areadeTexto.setRows(5);
        areadeTexto.setAutoscrolls(false);
        areadeTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        jScrollPane2.setViewportView(areadeTexto);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("HP");

        jProgressBar1.setBackground(new java.awt.Color(204, 0, 0));
        jProgressBar1.setForeground(new java.awt.Color(255, 204, 0));
        jProgressBar1.setToolTipText("");
        jProgressBar1.setValue(100);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("50 / 50");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(mapaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(mapaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDireitaActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEsquerdaActionPerformed

    private void inicializarCenas() {
        cenas.add(new Cenas("/mapa-introducao.png", "",
                " ", "Montanha",
                1, 2));

        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));
        
        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));
        
        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));
        
        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));
        
        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));
        
        cenas.add(new Cenas("/mapa-2.png", "",
                "Enfrentar", "Escapar",
                3, 0));

    }
    
    private void mostrarCena(int indice) {
        // 1) valida o índice
        if (indice < 0 || indice >= cenas.size()) {
            return; // evita erro se pedir cena inexistente
        }

//        // 2) obtém a cena
//        Cenas c = cenas.get(indice);
//
//        // 3) atualiza os ícones (imagens) usando getResource()
//        campoImagem.setIcon(new javax.swing.ImageIcon(
//            getClass().getResource(c.getCaminhoImagem())
//        ));
//
//        texto.setIcon(new javax.swing.ImageIcon(
//            getClass().getResource(c.getCaminhoTexto())
//        ));
//
//        // 4) atualiza textos dos botões
//        btnEscolhaEsq.setText(c.getEscolhaEsq());
//        btnEscolhaDir.setText(c.getEscolhaDir());

        // 5) atualiza qual cena está ativa
        cenaAtual = indice;
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaminhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areadeTexto;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mapaLabel;
    // End of variables declaration//GEN-END:variables
}
