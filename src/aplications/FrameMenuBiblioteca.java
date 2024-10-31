/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplications;

import java.awt.Image;
import javax.swing.ImageIcon;
import models.Usuario;

/**
 *
 * @author Penna
 */
public class FrameMenuBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenuBiblioteca
     */
    
    public static Usuario usuario;
    public FrameMenuBiblioteca(Usuario usuario) {
        this.usuario=usuario;
        initComponents();
        redimensionarImagem();
    }

    
     private void redimensionarImagem() {
        // Carregar a imagem original
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/1722.jpg"));
        
        // Redimensionar a imagem para caber no JPanel (jPanel2)
        Image img = icon.getImage().getScaledInstance(jPanel1.getWidth(), jPanel1.getHeight(), Image.SCALE_SMOOTH);
        
        // Definir a imagem redimensionada no JLabel
        jLabelImagem.setIcon(new ImageIcon(img));
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
        jPanelBotoes = new javax.swing.JPanel();
        jBtnPesquisarLivros = new javax.swing.JButton();
        jBtnLocacoes = new javax.swing.JButton();
        jBtnDividas = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BEM VINDO À BIBLIOTECA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotoes.setLayout(new java.awt.GridLayout(2, 0));

        jBtnPesquisarLivros.setText("PESQUISAR LIVROS");
        jBtnPesquisarLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarLivrosActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jBtnPesquisarLivros);

        jBtnLocacoes.setText("MINHAS LOCAÇÕES");
        jBtnLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLocacoesActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jBtnLocacoes);

        jBtnDividas.setText("MINHAS DIVIDAS");
        jBtnDividas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDividasActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jBtnDividas);

        jBtnVoltar.setText("VOLTAR");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jBtnVoltar);

        jPanel1.add(jPanelBotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 640, 244));
        jPanel1.add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPesquisarLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarLivrosActionPerformed
        FramePesquisarLivros f = new FramePesquisarLivros(usuario);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnPesquisarLivrosActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        FrameLogin f = new FrameLogin();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void jBtnLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLocacoesActionPerformed
        FrameLocacoes f = new FrameLocacoes(usuario);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnLocacoesActionPerformed

    private void jBtnDividasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDividasActionPerformed
        FrameDividas f = new FrameDividas(usuario);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnDividasActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenuBiblioteca(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDividas;
    private javax.swing.JButton jBtnLocacoes;
    private javax.swing.JButton jBtnPesquisarLivros;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotoes;
    // End of variables declaration//GEN-END:variables
}
