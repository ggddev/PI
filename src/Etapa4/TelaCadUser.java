package Etapa4;

import bancodedados.Criptografia;
import bancodedados.Usuario;
import bancodedados.UsuarioDAO;
import javax.swing.JOptionPane;

public class TelaCadUser extends javax.swing.JFrame {

    public TelaCadUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCadUser = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtNumCard = new javax.swing.JTextField();
        lblNumCard = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        chkBox = new javax.swing.JCheckBox();
        btnCad = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCadUser.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblCadUser.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(lblCadUser)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCadUser)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setToolTipText("Insira seu nome");
        txtNome.setNextFocusableComponent(txtEmail);

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setToolTipText("Insira seu e-mail");
        txtEmail.setNextFocusableComponent(txtCpf);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCpf.setText("CPF:");

        txtCpf.setToolTipText("Insira seu CPF");
        txtCpf.setNextFocusableComponent(txtEndereco);

        txtEndereco.setToolTipText("Insira seu endereço");
        txtEndereco.setNextFocusableComponent(txtIdade);

        lblEndereco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEndereco.setText("Endereço:");

        txtIdade.setToolTipText("Insira sua idade");
        txtIdade.setNextFocusableComponent(txtNumCard);

        lblIdade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblIdade.setText("Idade:");

        txtNumCard.setToolTipText("Insira o número do cartão");
        txtNumCard.setNextFocusableComponent(txtSenha);

        lblNumCard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNumCard.setText("Número do cartão:");

        txtSenha.setToolTipText("Crie uma senha");
        txtSenha.setNextFocusableComponent(chkBox);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSenha.setText("Senha:");

        chkBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkBox.setText("É administrador?");
        chkBox.setToolTipText("Marque se for administrador");
        chkBox.setNextFocusableComponent(btnCad);

        btnCad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCad.setText("Cadastrar-se");
        btnCad.setToolTipText("Clique para realizar o cadastro");
        btnCad.setNextFocusableComponent(btnLimpar);
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique para limpar os campos");
        btnLimpar.setNextFocusableComponent(txtNome);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblEmail)
                    .addComponent(lblCpf)
                    .addComponent(lblEndereco)
                    .addComponent(lblIdade)
                    .addComponent(lblNumCard)
                    .addComponent(lblSenha)
                    .addComponent(chkBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpf)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumCard)
                        .addGap(21, 21, 21)
                        .addComponent(lblSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNumCard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBox)
                    .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        if(validacao() == true){
            UsuarioDAO uDAO = new UsuarioDAO();
            Usuario user = new Usuario();
            user.setNome(txtNome.getText());
            user.setEmail(txtEmail.getText());
            user.setCpf(txtCpf.getText());
            user.setEndereco(txtEndereco.getText());
            user.setIdade(Integer.parseInt(txtIdade.getText()));
            user.setNumCard(Integer.parseInt(txtNumCard.getText()));
            user.setSenha(Criptografia.getMD5(txtSenha.getText()));
            if(chkBox.isSelected() == true){
                boolean tipoUser= true;
                user.seteAdm(tipoUser);
            }
            
            boolean status = uDAO.conectar();
            
            if(status == true){
                uDAO.inserir(user);
                limpar();
                uDAO.desconectar();
                TelaLogin tL = new TelaLogin();
                tL.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro de conexão. Tente novamente.");
            }
        }
    }//GEN-LAST:event_btnCadActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox chkBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCadUser;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumCard;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumCard;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    public boolean validacao() {
        if (txtNome.getText().isEmpty() || txtEmail.getText().isEmpty() || txtCpf.getText().isEmpty() || txtEndereco.getText().isEmpty() || txtIdade.getText().isEmpty() || txtNumCard.getText().isEmpty() || txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
            return false;
        }

        String email = txtEmail.getText();
        boolean emailBoo = email.matches("\\w+@\\w+\\.\\w{2,3}");
        if (emailBoo == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo '" + lblEmail.getText() + "' seguindo a ordem: nome@dominio.com");
            return false;
        }

        String cpf = txtCpf.getText();
        boolean cpfBoo = cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
        if (cpfBoo == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo '" + lblCpf.getText() + "' seguindo a ordem: XXX.XXX.XXX-XX");
            return false;
        }

        String numCard = txtNumCard.getText();
        boolean numCardBoo = numCard.matches("[0-9]{4}");
        if (numCardBoo == false) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo '" + lblNumCard.getText() + "' seguindo a ordem: xxxx");
            return false;
        }

        return true;
    }

    public void limpar() {
        txtNome.setText("");
        txtEmail.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
        txtIdade.setText("");
        txtNumCard.setText("");
        txtSenha.setText("");
        chkBox.setSelected(false);
    }

}
