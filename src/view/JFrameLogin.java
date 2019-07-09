package View;

import dao.LoginDAO;
import dao.RankingsDAO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class JFrameLogin extends javax.swing.JFrame {

    public JFrameLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void salvarSessao(String idUsuario) {
        FileWriter arq = null;
        try {
            arq = new FileWriter("src/persistencia/logado.txt");
        } catch (IOException ex) {
            Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(idUsuario);
        {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(JFrameLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setText("AprendendoFísica");

        jLabelLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelLogin.setText("Email");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Senha");

        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CRIAR CONTA");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(44, 44, 44))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLogin)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelLogin)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addGap(13, 13, 13)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        view.JFrmCadastroUsuario CadastroUsuario = new view.JFrmCadastroUsuario();
        CadastroUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        int logar = 0;
        String usuario, senha;

        usuario = jTextFieldLogin.getText();
        senha = jPasswordFieldSenha.getText();

        LoginDAO logindao = new LoginDAO();
        logar = logindao.logar(usuario, senha);

        switch (logar) {
            case 0:
                JOptionPane.showMessageDialog(rootPane, "Email ou senha incorretos, por favor tente novamente ou realize seu cadastro!", "", 1);
                break;
            case 1:
                salvarSessao(usuario);
                view.JFrameCalcular Calcular = new view.JFrameCalcular();
                Calcular.setVisible(true);
                this.dispose();
                break;
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
