/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplications;

import dao.UsuarioDao;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author Penna
 */
public class FrameCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenuInicial
     */
    public FrameCadastrar() {
        initComponents();
        redimensionarImagem();
    }

     private void redimensionarImagem() {
        // Carregar a imagem original
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/1722.jpg"));
        
        // Redimensionar a imagem para caber no JPanel (jPanel2)
        Image img = icon.getImage().getScaledInstance(jPanel.getWidth(), jPanel.getHeight(), Image.SCALE_SMOOTH);
        
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

        jPanel = new javax.swing.JPanel();
        jBtnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFSenha = new javax.swing.JTextField();
        jBtnVoltar = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRAR");
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(204, 204, 204));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnCadastrar.setBackground(new java.awt.Color(102, 255, 102));
        jBtnCadastrar.setText("CADASTRAR");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });
        jPanel.add(jBtnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 211, 65));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 200, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Email");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 50));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Senha");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 50));

        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });
        jPanel.add(jTFNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 500, 50));

        jTFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEmailActionPerformed(evt);
            }
        });
        jPanel.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 500, 50));
        jPanel.add(jTFSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 500, 50));

        jBtnVoltar.setText("VOLTAR");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });
        jPanel.add(jBtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 211, 65));
        jPanel.add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -3, 850, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        //VERIFICAR SE TODOS OS CAMPOS FORAM PREENCHIDOS
        if(!jTFNome.getText().trim().isEmpty() && !jTFEmail.getText().trim().isEmpty() && !jTFSenha.getText().trim().isEmpty()){
            //INSTANCIAR UM NOVO OBJETO USUARIO
            Usuario usuario=new Usuario(jTFNome.getText(),jTFEmail.getText(),jTFSenha.getText());
            UsuarioDao usuarioDao= new UsuarioDao();
            //VERIFICAR SE JA EXISTE
            if(usuarioDao.verificarSeExiste(usuario)){
            JOptionPane.showMessageDialog(null,"Usuário já existe!","Alerta",JOptionPane.WARNING_MESSAGE);
            }else{
                //INSERIR USUARIO NO DB
                usuarioDao.inserirUsuario(usuario);
                //PEGAR ID QUE FOI GERADO NO DB
                usuarioDao.obterId(usuario);
                JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!");
                FrameMenuBiblioteca f = new FrameMenuBiblioteca(usuario);
                f.setVisible(true);
                this.dispose();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!","ERRO",JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        FrameLoginCadastrar f = new FrameLoginCadastrar();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    private void jTFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEmailActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFSenha;
    // End of variables declaration//GEN-END:variables
}
