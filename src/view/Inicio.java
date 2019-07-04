package view;

import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        arco.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtAngulo = new javax.swing.JTextField();
        lblAngulo = new javax.swing.JLabel();
        lblVelInicial = new javax.swing.JLabel();
        btnAtirar = new javax.swing.JButton();
        edtVelInicial = new javax.swing.JTextField();
        acertou = new javax.swing.JLabel();
        arco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        edtAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        lblAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblAngulo.setText("Ângulo");

        lblVelInicial.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblVelInicial.setText("Vel. Inicial");

        btnAtirar.setText("ATIRAR");
        btnAtirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtirarActionPerformed(evt);
            }
        });

        edtVelInicial.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        acertou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arco.gif"))); // NOI18N
        acertou.setText("jLabel3");

        arco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/acertou_2.gif"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acertou_2.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblAngulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblVelInicial, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtAngulo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(edtVelInicial)))
                        .addComponent(arco, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(acertou, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnAtirar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtVelInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAtirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(arco)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(acertou, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtirarActionPerformed

        String angulo = edtAngulo.getText();
        String VM = edtVelInicial.getText();

        if (angulo.equals("1") && VM.equals("1")) {
            arco.setVisible(true);
            JOptionPane.showMessageDialog(null, "Acertou!");
        } else {
            JOptionPane.showMessageDialog(null, "Errou!");
            arco.setVisible(false);
        }


    }//GEN-LAST:event_btnAtirarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acertou;
    private javax.swing.JLabel arco;
    private javax.swing.JButton btnAtirar;
    private javax.swing.JTextField edtAngulo;
    private javax.swing.JTextField edtVelInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAngulo;
    private javax.swing.JLabel lblVelInicial;
    // End of variables declaration//GEN-END:variables
}
