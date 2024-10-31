/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplications;

import dao.AluguelDao;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Aluguel;
import models.Livro;
import models.Usuario;

/**
 *
 * @author Penna
 */
public class FrameDividas extends javax.swing.JFrame {

    private static Usuario usuario;

    public FrameDividas(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        listarAlugueisTabela();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDividas = new javax.swing.JTable();
        jBtnVoltar = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINHAS DIVIDAS");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDividas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Titulo", "Data Devolução"
            }
        ));
        jScrollPane1.setViewportView(jTableDividas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 222, 760, 250));

        jBtnVoltar.setText("VOLTAR");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 200, 60));
        jPanel1.add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        FrameMenuBiblioteca f = new FrameMenuBiblioteca(usuario);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed
    public void limparTabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTableDividas.getModel();
        dtm.setRowCount(0); // Remove todas as linhas da tabela
    }

    /**
     * @param args the command line arguments
     */
    public void listarAlugueisTabela() {
    ArrayList<String[]> listaAlugueis = AluguelDao.listarAlugueisAtrasadosUsuario(usuario);
    DefaultTableModel dtm = (DefaultTableModel) jTableDividas.getModel();

    // Configura as colunas (Nome do Usuário, Título do Livro)
    jTableDividas.getColumnModel().getColumn(0).setPreferredWidth(100);
    jTableDividas.getColumnModel().getColumn(1).setPreferredWidth(150);
    jTableDividas.getColumnModel().getColumn(2).setPreferredWidth(100);

    // Limpa a tabela antes de adicionar os novos dados
    dtm.setRowCount(0);

    // Adiciona as linhas com nome do usuário e título do livro
    for (String[] aluguel : listaAlugueis) {
        dtm.addRow(aluguel);
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
            java.util.logging.Logger.getLogger(FrameDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDividas(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDividas;
    // End of variables declaration//GEN-END:variables
}
