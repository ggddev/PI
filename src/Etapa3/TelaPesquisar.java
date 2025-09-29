package Etapa3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisar extends javax.swing.JFrame {

    private boolean isAdmin;
    
    public TelaPesquisar(boolean isAdmin) {
        initComponents();
        this.isAdmin = isAdmin;
        btnExcluir.setEnabled(isAdmin);
    }
    
    protected static List<Produto> produtoList = new ArrayList<>();
    private final String[] tableColumns = {"Título", "Preço", "Cor", "Descrição"};
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        lblResultados = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
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

        lblResultados.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblResultados.setText("Resultados");

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Clique para realizar a busca");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtBusca.setToolTipText("Insira sua busca");

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Clique para excluir (apenas para administradores)");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultados)
                        .addGap(282, 282, 282))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblResultados)
                .addGap(9, 9, 9)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String busca = txtBusca.getText().toLowerCase().trim();
        
        if(busca.isEmpty()){
            atualizarTabela();
            return;
        }
        
        DefaultTableModel resultadoModel = new DefaultTableModel(tableColumns, 0);
        
        for(Produto p : produtoList){
            if(p.getTitulo().toLowerCase().contains(busca) || p.getCor().toLowerCase().contains(busca) || p.getDescricao().toLowerCase().contains(busca)){
                String[] rowData = {p.getTitulo(), String.valueOf(p.getPreco()), p.getCor(), p.getDescricao()};
                resultadoModel.addRow(rowData);
            }
        }
        
        tabela.setModel(resultadoModel);
        if(resultadoModel.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir(getPosicaoProdutos());
    }//GEN-LAST:event_btnExcluirActionPerformed

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

    protected void inserirProduto(Produto prod){
        produtoList.add(prod);
        atualizarTabela();
    }
    
    protected void atualizarTabela(){
        if(!produtoList.isEmpty()){
            Produto prod;
            tableModel = new DefaultTableModel(tableColumns, 0);
            for(Produto p : produtoList){
                String[] rowData = {p.getTitulo(), String.valueOf(p.getPreco()), p.getCor(), p.getDescricao()};
                tableModel.addRow(rowData);
            }
            tabela.setModel(tableModel);
        } else {
            DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
            tabela.setModel(tableModel);
        }
    }
    
    protected int getPosicaoProdutos(){
        int posProd = tabela.getSelectedRow();
        
        if(posProd == -1){
            JOptionPane.showMessageDialog(null, "Selecione um produto.");
        }
        return posProd;
    }
    
    public static void adicionarProd(Produto prod){
        produtoList.add(prod);
    }
    
    public static List<Produto> getProdutos(){
        return produtoList;
    }
    
    public void excluir(int getPosProd){
        if(getPosProd >= 0){
            String[] options = {"Sim", "Não"};
            int delete = JOptionPane.showOptionDialog(null,
                    "Tem certeza de que deseja excluir?",
                    "Exclusão de produtos",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
            
            if(delete == 0){
                String idProd = (String) tabela.getValueAt(getPosProd, 0);
                
                Produto prodRemove = null;
                
                for(Produto p : produtoList){
                    if(p.getTitulo().equals(idProd)){
                        prodRemove = p;
                        break;
                    }
                }
                
                if(prodRemove != null && produtoList.remove(prodRemove)){
                    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso.");
                    atualizarTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao excluir produto. Tente novamente.");
                }
            }
        }
    }

}
