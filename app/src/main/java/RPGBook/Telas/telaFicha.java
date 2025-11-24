
package RPGBook.Telas;

import RPGBook.Models.Arqueiro;
import RPGBook.Models.Barbaro;
import RPGBook.Models.Ladino;
import RPGBook.Models.Mago;
import RPGBook.Models.Personagem;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class TelaFicha extends javax.swing.JFrame {
    private Personagem personagem;
    
    private String[] nomes = {"Frisk", "Sans", "Undyne", "Asgorn"};   
    private int id;

    
    public TelaFicha() {
        initComponents();
        setLocationRelativeTo(null);
        gerarImagem();
        
        btnStatus.setVisible(false);        
        btnContinuar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxPanel = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        labelHp = new javax.swing.JLabel();
        labelMana = new javax.swing.JLabel();
        labelAgi = new javax.swing.JLabel();
        btnStatus = new javax.swing.JButton();
        labelForca = new javax.swing.JLabel();
        icon1 = new javax.swing.JButton();
        icon2 = new javax.swing.JButton();
        icon3 = new javax.swing.JButton();
        icon4 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(843, 737));

        boxPanel.setBackground(new java.awt.Color(0, 0, 0));
        boxPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 7));
        boxPanel.setPreferredSize(new java.awt.Dimension(294, 134));

        labelName.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("Nome:");
        labelName.setRequestFocusEnabled(false);

        nameField.setBackground(new java.awt.Color(0, 0, 0));
        nameField.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 204, 0));
        nameField.setText("??");
        nameField.setBorder(null);
        nameField.setMinimumSize(new java.awt.Dimension(53, 25));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        labelHp.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelHp.setForeground(new java.awt.Color(255, 255, 255));
        labelHp.setText("Vida: ??");

        labelMana.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelMana.setForeground(new java.awt.Color(255, 255, 255));
        labelMana.setText("Mana: ??");

        labelAgi.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelAgi.setForeground(new java.awt.Color(255, 255, 255));
        labelAgi.setText("Agilidade: ??");

        btnStatus.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnStatus.setText("Gerar");
        btnStatus.setBorder(null);
        btnStatus.setBorderPainted(false);
        btnStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        labelForca.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        labelForca.setForeground(new java.awt.Color(255, 255, 255));
        labelForca.setText("Força: ??");

        javax.swing.GroupLayout boxPanelLayout = new javax.swing.GroupLayout(boxPanel);
        boxPanel.setLayout(boxPanelLayout);
        boxPanelLayout.setHorizontalGroup(
            boxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(boxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAgi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelHp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelForca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(boxPanelLayout.createSequentialGroup()
                        .addComponent(labelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(btnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        boxPanelLayout.setVerticalGroup(
            boxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(boxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHp)
                .addGap(8, 8, 8)
                .addComponent(labelForca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAgi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );

        icon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon1ActionPerformed(evt);
            }
        });

        icon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon2ActionPerformed(evt);
            }
        });

        icon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon3ActionPerformed(evt);
            }
        });

        icon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon4ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("LADINO");

        label2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("MAGO");

        label3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("BARBARO");

        label4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("ARQUEIRO");

        btnContinuar.setBackground(new java.awt.Color(0, 0, 0));
        btnContinuar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 7));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2)
                .addGap(204, 204, 204))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(label4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addGap(188, 188, 188))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(boxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        
    }//GEN-LAST:event_nameFieldActionPerformed

    private void icon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon1ActionPerformed
        selecionaPersonagem(1);
    }//GEN-LAST:event_icon1ActionPerformed

    private void icon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon2ActionPerformed
        selecionaPersonagem(2);
    }//GEN-LAST:event_icon2ActionPerformed

    private void icon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon3ActionPerformed
        selecionaPersonagem(3);
    }//GEN-LAST:event_icon3ActionPerformed

    private void icon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon4ActionPerformed
        selecionaPersonagem(4);
    }//GEN-LAST:event_icon4ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        new Introducao(personagem).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        personagem = verficarClasse();
        
        colocarStatus();
        btnStatus.setVisible(false); 
        btnContinuar.setVisible(true);
    }//GEN-LAST:event_btnStatusActionPerformed

    public void gerarImagem() {
        icon1.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/Frisk-icon.png")
        ));
        icon2.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/Sans-icon.png")
        ));
        icon3.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/Undyne-icon.png")
        ));
        icon4.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/Asgorn-icon.png")
        ));
        btnStatus.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/hexagono.png")
        ));
    }
    
    private void borda() {
        JButton[] icones = {icon1, icon2, icon3, icon4};
        
        Border bordaFocada = BorderFactory.createLineBorder(new Color(254, 155, 0), 7); 
        Border bordaNaoFocada = BorderFactory.createLineBorder(new Color(0, 0, 0), 0); 
        
        for(int i = 0; i < icones.length; i++) {
            if( i == (id-1) ) {
                icones[i].setBorder(bordaFocada);
                continue;
            }
            
            icones[i].setBorder(bordaNaoFocada);
        }
    }
    
    private void selecionaPersonagem(int id) {
        this.id = id;
        
        borda();        
        edicaoNome(true);
        limparStatus();
        btnStatus.setVisible(true);
        btnContinuar.setContentAreaFilled(false);  
        btnContinuar.setFocusPainted(false); 
        nameField.setText(nomes[id-1]);
    }
    
    private void limparStatus() {
        nameField.setText("??");
        labelHp.setText("Vida: ??");
        labelForca.setText("Força: ??");
        labelMana.setText("Mana: ??");
        labelAgi.setText("Agilidade: ??");
    }
    
    private void colocarStatus() {
        edicaoNome(false);
        
        labelName.setText("Nome: " + personagem.getNome());
        labelHp.setText("Vida: " + personagem.getVida());
        labelForca.setText("Força: " + personagem.getForca());
        labelMana.setText("Mana: " + personagem.getMana());
        labelAgi.setText("Agilidade: " + personagem.getAgilidade());
    }
    
    private void edicaoNome(boolean editar) {
        if (editar) {
            nameField.setVisible(true);
            labelName.setSize(new Dimension(57, 25));
            labelName.setPreferredSize(new Dimension(57, 25));
            labelName.setMinimumSize(new Dimension(57, 25));
            labelName.setMaximumSize(new Dimension(57, 25));
            labelName.repaint();
            return;
        }
        
        nameField.setVisible(false);
        labelName.setSize(new Dimension(190, 25));
        labelName.setPreferredSize(new Dimension(190, 25));
        labelName.setMinimumSize(new Dimension(190, 25));
        labelName.setMaximumSize(new Dimension(190, 25));
        labelName.repaint();
    }
    
    private Personagem verficarClasse() {
        switch (id) {
            case 1:
                return new Ladino(nameField.getText());
            case 2:
                return new Mago(nameField.getText());
            case 3: 
                return new Arqueiro(nameField.getText());
            case 4: 
                return new Barbaro(nameField.getText());
            default:
                return null;
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFicha().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxPanel;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnStatus;
    private javax.swing.JButton icon1;
    private javax.swing.JButton icon2;
    private javax.swing.JButton icon3;
    private javax.swing.JButton icon4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel labelAgi;
    private javax.swing.JLabel labelForca;
    private javax.swing.JLabel labelHp;
    private javax.swing.JLabel labelMana;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
