package Etapa4;

import bancodedados.Produto;
import bancodedados.ProdutoDAO;
import bancodedados.Usuario;
import bancodedados.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaPesquisar extends javax.swing.JFrame {
    
    private boolean isAdm;
    
    public TelaPesquisar(boolean isAdm) {
        initComponents();
        this.isAdm = isAdm;
        btnExcluir.setEnabled(isAdm);
    }

    ProdutoDAO pDAO = new ProdutoDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lblResultados = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título", "Preço", "Cor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        lblResultados.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblResultados.setText("Resultados");

        txtBusca.setToolTipText("Insira o produto que será buscado");
        txtBusca.setNextFocusableComponent(btnPesquisar);

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique para buscar");
        btnPesquisar.setNextFocusableComponent(txtBusca);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Clique para excluir o produto selecionado (apenas adm)");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lblResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String busca = txtBusca.getText();
        List<Produto> listaProd = new ArrayList<>();

        boolean conexao = pDAO.conectar();

        if (conexao == true) {
            List<Produto> produtos = pDAO.getProd(busca);

            if (produtos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado, por favor, tente novamente.");
            } else {
                listaProd = pDAO.getProd(busca);

                DefaultTableModel tabelaProd = (DefaultTableModel) tabela.getModel();

                tabelaProd.setNumRows(0);

                for (Produto p : listaProd) {
                    Object[] objt = new Object[]{
                        p.getTitulo(),
                        p.getPreco(),
                        p.getCor(),
                        p.getDescricao(),};
                    tabelaProd.addRow(objt);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro de conexão. Tente novamente.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirProd(getPosicaoProdutos());
        pDAO.desconectar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void preencherTabela() {
        String nomeBusca = txtBusca.getText();
        List<Produto> listaProd = pDAO.getProd(nomeBusca);

        if (listaProd == null) {
            listaProd = new ArrayList<>();
        }

        DefaultTableModel tabelaProdutos = (DefaultTableModel) tabela.getModel();
        tabelaProdutos.setRowCount(0);
        tabela.setRowSorter(new TableRowSorter(tabelaProdutos));

        for (Produto p : listaProd) {
            Object[] objt = new Object[]{
                p.getTitulo(),
                p.getPreco(),
                p.getCor(),
                p.getDescricao(),};
            tabelaProdutos.addRow(objt);
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
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisar(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResultados;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables
    
    protected int getPosicaoProdutos() {
        int posProd = tabela.getSelectedRow();

        if (posProd == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
        return posProd;
    }

    public void excluirProd(int posProd) {
        if (posProd >= 0) {
            String[] options = {"Sim", "Não"};
            int delete = JOptionPane.showOptionDialog(null,
                    "Tem certeza de que deseja excluir?",
                    "Exclusão de produtos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (delete == 0) {
                String nomeProduto = (String) tabela.getValueAt(posProd, 0);

                if (pDAO.excluir(nomeProduto)) {
                    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
                    preencherTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir produto. Tente novamente.");
                }
            }
        }
    }
}
