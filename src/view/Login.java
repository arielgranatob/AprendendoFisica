package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelTitulo.setText("Aprenda física");

        jLabelLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelLogin.setText("LOGIN:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("SENHA:");

        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
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
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabelLogin)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))
                            .addComponent(jTextFieldLogin)
                            .addComponent(jPasswordFieldSenha)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
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
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        String usuario, senha;

        usuario = jTextFieldLogin.getText();
        senha = jPasswordFieldSenha.getText();

        if (senha.equals("123") && usuario.equals("ariel")) {

            JFrame tela = new Calcular();
            tela.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Senha incorreta!");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

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
