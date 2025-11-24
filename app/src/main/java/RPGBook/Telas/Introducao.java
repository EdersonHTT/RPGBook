
package RPGBook.Telas;

import RPGBook.Models.Personagem;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Introducao extends javax.swing.JFrame {
    private Personagem personagem;

    public Introducao(Personagem p) {
        initComponents();
        this.setLayout(null);
        setLocationRelativeTo(null);
        criarElementos();
        
        personagem = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criarElementos() {
        JLabel caixa = new JLabel("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        
        int largura = 600;
        int altura = 230;

        int x = (this.getWidth() - largura) / 2;
        int y = (this.getHeight() - altura) / 2;

        caixa.setBounds(x, y, largura, altura);
        caixa.setBorder(BorderFactory.createLineBorder(Color.white, 7));
        caixa.setBackground(Color.black);
        caixa.repaint(); 
        this.add(caixa, BorderLayout.CENTER);
        
        JLabel fundoLabel = new JLabel("");
        fundoLabel.setBounds(0, 0, 843, 737);
        fundoLabel.setIcon(new javax.swing.ImageIcon(
            getClass().getResource("/apenasNuvens.gif")
        ));
        
        this.add(fundoLabel);
//        
//        JLabel frenteLabel = new JLabel("");
//        frenteLabel.setBounds(0, 0, 843, 737);
//        frenteLabel.setIcon(new javax.swing.ImageIcon(
//            getClass().getResource("/fadeOut.gifS")
//        ));
//        
//        this.add(frenteLabel, Integer.bitCount(0));
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
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introducao(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
