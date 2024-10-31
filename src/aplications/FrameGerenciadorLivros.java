/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplications;

import dao.LivroDao;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Livro;
import models.Usuario;

/**
 *
 * @author Penna
 */
public class FrameGerenciadorLivros extends javax.swing.JFrame {

    /**
     * Creates new form FrameGerenciadorLivros
     */
    private static Usuario usuario;

    public FrameGerenciadorLivros(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        listarTabela();
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
        jTableLivros = new javax.swing.JTable();
        jPanelLabel = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelDisponiveis = new javax.swing.JLabel();
        jPanelTF = new javax.swing.JPanel();
        jTFTitulo = new javax.swing.JTextField();
        jTFAutor = new javax.swing.JTextField();
        jTFGenero = new javax.swing.JTextField();
        jTFDisponiveis = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnAtualizar = new javax.swing.JButton();
        jBtnDeletar = new javax.swing.JButton();
        jBtnCarregar = new javax.swing.JButton();
        jBtnVoltar = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIADOR DE LIVROS");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Autor", "Genero", "Disponiveis"
            }
        ));
        jScrollPane1.setViewportView(jTableLivros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 276, 728, 229));

        jPanelLabel.setOpaque(false);
        jPanelLabel.setLayout(new java.awt.GridLayout(4, 0));

        jLabelTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Titulo");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTitulo.setOpaque(true);
        jPanelLabel.add(jLabelTitulo);

        jLabelAutor.setBackground(new java.awt.Color(204, 204, 204));
        jLabelAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAutor.setText("Autor");
        jLabelAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelAutor.setOpaque(true);
        jPanelLabel.add(jLabelAutor);

        jLabelGenero.setBackground(new java.awt.Color(204, 204, 204));
        jLabelGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGenero.setText("Genero");
        jLabelGenero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelGenero.setOpaque(true);
        jPanelLabel.add(jLabelGenero);

        jLabelDisponiveis.setBackground(new java.awt.Color(204, 204, 204));
        jLabelDisponiveis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisponiveis.setText("Disponiveis");
        jLabelDisponiveis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelDisponiveis.setOpaque(true);
        jPanelLabel.add(jLabelDisponiveis);

        jPanel1.add(jPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 27, 114, 88));

        jPanelTF.setOpaque(false);
        jPanelTF.setLayout(new java.awt.GridLayout(4, 0));
        jPanelTF.add(jTFTitulo);

        jTFAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAutorActionPerformed(evt);
            }
        });
        jPanelTF.add(jTFAutor);
        jPanelTF.add(jTFGenero);
        jPanelTF.add(jTFDisponiveis);

        jPanel1.add(jPanelTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 27, 579, 90));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jBtnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jBtnCadastrar.setText("CADASTRAR");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnCadastrar);

        jBtnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jBtnAtualizar.setText("ATUALIZAR");
        jBtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnAtualizar);

        jBtnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jBtnDeletar.setText("DELETAR");
        jBtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnDeletar);

        jBtnCarregar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jBtnCarregar.setText("CARREGAR CAMPOS");
        jBtnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCarregarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnCarregar);

        jBtnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jBtnVoltar.setText("VOLTAR");
        jBtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnVoltar);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 207, 728, 43));
        jPanel1.add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

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

    private void jTFAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAutorActionPerformed

    private void jBtnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCarregarActionPerformed
        carregarCampos();
    }//GEN-LAST:event_jBtnCarregarActionPerformed

    private void jBtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeletarActionPerformed

        excluirLivro();
        listarTabela();
        limparCampos();
    }//GEN-LAST:event_jBtnDeletarActionPerformed

    private void jBtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAtualizarActionPerformed
        atualizar();
        listarTabela();
        limparCampos();
    }//GEN-LAST:event_jBtnAtualizarActionPerformed

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        cadastrarlivro();
        listarTabela();
        limparCampos();
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVoltarActionPerformed
        FrameMenuBibliotecaAdmin f = new FrameMenuBibliotecaAdmin(usuario);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void listarTabela() {
        LivroDao livro = new LivroDao();
        ArrayList<Livro> listarLivros = livro.listarLivros();
        DefaultTableModel dtm = (DefaultTableModel) jTableLivros.getModel();
        limparTabela();

        jTableLivros.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableLivros.getColumnModel().getColumn(1).setPreferredWidth(230);
        jTableLivros.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableLivros.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableLivros.getColumnModel().getColumn(4).setPreferredWidth(50);

        for (Livro livros : listarLivros) {
            Object[] ob = {livros.getId(), livros.getTitulo(), livros.getAutor(), livros.getGenero(), livros.getQuantidadeDisponivel()};
            dtm.addRow(ob);
        }
    }

    private void atualizar() {
        int setar = jTableLivros.getSelectedRow();
        if (setar != -1) {
            String idLivroString = jTableLivros.getModel().getValueAt(setar, 0).toString();
            int idLivroInt = Integer.parseInt(idLivroString);

            String titulo = jTFTitulo.getText();
            String autor = jTFAutor.getText();
            String genero = jTFGenero.getText();
            String disponiveisString = jTFDisponiveis.getText();

            // Verificar se os campos estão preenchidos corretamente
            if (titulo.trim().isEmpty() || autor.trim().isEmpty() || genero.trim().isEmpty() || disponiveisString.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int disponiveis = Integer.parseInt(disponiveisString);

                // Criando o objeto Livro
                Livro livro = new Livro(idLivroInt, titulo, autor, genero, disponiveis);

                // Atualizando no banco de dados
                LivroDao livroDao = new LivroDao();
                livroDao.atualizarLivro(livro);

                // Atualizar a tabela após a alteração
                listarTabela();
                limparCampos();

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "O campo 'Disponíveis' deve conter um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

        /*int setar = jTableLivros.getSelectedRow();
        if (setar != -1) {
            String idLivroString = jTableLivros.getModel().getValueAt(setar, 0).toString();
            int idLivroInt = Integer.parseInt(idLivroString);

            String titulo, autor, genero;
            int disponiveis;

            titulo = jTFTitulo.getText();
            autor = jTFAutor.getText();
            genero = jTFGenero.getText();
            disponiveis = Integer.parseInt(jTFDisponiveis.getText());

            Livro livro = new Livro(idLivroInt, titulo, autor, genero, disponiveis);

            LivroDao livroDao = new LivroDao();
            livroDao.atualizarLivro(livro);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }*/
    }

    private void excluirLivro() {
        int setar = jTableLivros.getSelectedRow();
        if (setar != -1) {
            String idLivroString = jTableLivros.getModel().getValueAt(setar, 0).toString();
            int idLivroInt = Integer.parseInt(idLivroString);

            Livro livro = new Livro();
            livro.setId(idLivroInt);

            LivroDao livroDao = new LivroDao();
            livroDao.deletarLivroPorId(livro);
            limparTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void cadastrarlivro() {

        String titulo, autor, genero, disponiveis;

        titulo = jTFTitulo.getText().trim();
        autor = jTFAutor.getText().trim();
        genero = jTFGenero.getText().trim();
        disponiveis = jTFDisponiveis.getText().trim();

        // Verificando se algum campo está vazio
        if (titulo.trim().isEmpty() || autor.trim().isEmpty() || genero.trim().isEmpty() || disponiveis.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convertendo a string disponiveis para int
            int qtdDisponiveis = Integer.parseInt(disponiveis);

            // Criando o objeto Livro
            Livro livro = new Livro(titulo, autor, genero, qtdDisponiveis);

            // Inserindo no banco de dados
            LivroDao livroDao = new LivroDao();
            //verificar se livro ja nao esta cadastrado
            if (!livroDao.verificarSeLivroExiste(livro)) {
                livroDao.inserirLivro(livro);
            }else{
                JOptionPane.showMessageDialog(null, "Este livro já está cadastrado!", "AVISO", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException e) {
            // Tratamento caso o valor de "disponiveis" não seja um número válido
            JOptionPane.showMessageDialog(null, "O campo 'Disponíveis' deve conter um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        /*String titulo,autor,genero,disponiveis;
        
        titulo = jTFTitulo.getText();
        autor = jTFAutor.getText();
        genero = jTFGenero.getText();
        disponiveis = jTFDisponiveis.getText();
        
        Livro livro = new Livro(titulo,autor,genero,Integer.parseInt(disponiveis));
        
        LivroDao livroDao = new LivroDao();
        livroDao.inserirLivro(livro);
         */
    }

    public void carregarCampos() {
        int setar = jTableLivros.getSelectedRow();
        if (setar != -1) {
            jTFTitulo.setText(jTableLivros.getModel().getValueAt(setar, 1).toString());
            jTFAutor.setText(jTableLivros.getModel().getValueAt(setar, 2).toString());
            jTFGenero.setText(jTableLivros.getModel().getValueAt(setar, 3).toString());
            jTFDisponiveis.setText(jTableLivros.getModel().getValueAt(setar, 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void limparCampos() {
        jTFTitulo.setText("");
        jTFAutor.setText("");
        jTFGenero.setText("");
        jTFDisponiveis.setText("");
    }

    public void limparTabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTableLivros.getModel();
        dtm.setRowCount(0); // Remove todas as linhas da tabela
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
            java.util.logging.Logger.getLogger(FrameGerenciadorLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciadorLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciadorLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGerenciadorLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGerenciadorLivros(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAtualizar;
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnCarregar;
    private javax.swing.JButton jBtnDeletar;
    private javax.swing.JButton jBtnVoltar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelDisponiveis;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLabel;
    private javax.swing.JPanel jPanelTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAutor;
    private javax.swing.JTextField jTFDisponiveis;
    private javax.swing.JTextField jTFGenero;
    private javax.swing.JTextField jTFTitulo;
    private javax.swing.JTable jTableLivros;
    // End of variables declaration//GEN-END:variables
}