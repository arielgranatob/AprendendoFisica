/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Calculos;

/**
 *
 * @author ch
 */
public class Desenho extends javax.swing.JFrame {

    private Calculos calculo;

    public Desenho() {
        initComponents();
        this.calculo = new Calculos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVel = new javax.swing.JLabel();
        lblAngulo = new javax.swing.JLabel();
        edtVel = new javax.swing.JTextField();
        edtAngulo = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        lblCompX = new javax.swing.JLabel();
        lblCompY = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        lblAlturaMax = new javax.swing.JLabel();
        txtCompX = new javax.swing.JTextField();
        txtCompY = new javax.swing.JTextField();
        txtTempo = new javax.swing.JTextField();
        txtDistancia = new javax.swing.JTextField();
        txtAlturaMax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblVel.setText("Velocidade Inicial");

        lblAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblAngulo.setText("Ângulo (em graus)");

        edtVel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        edtAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        painel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblCompX.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblCompX.setText("Componente X:");

        lblCompY.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblCompY.setText("Componente Y:");

        lblTempo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblTempo.setText("Tempo:");

        lblDistancia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblDistancia.setText("Distância:");

        lblAlturaMax.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblAlturaMax.setText("Altura Máxima:");

        txtCompX.setEditable(false);
        txtCompX.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtCompY.setEditable(false);
        txtCompY.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtTempo.setEditable(false);
        txtTempo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtDistancia.setEditable(false);
        txtDistancia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtAlturaMax.setEditable(false);
        txtAlturaMax.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(lblCompX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCompX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompY)
                            .addComponent(lblTempo)
                            .addComponent(lblDistancia)
                            .addComponent(lblAlturaMax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCompY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTempo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDistancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlturaMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompX)
                    .addComponent(txtCompX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompY)
                    .addComponent(txtCompY, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempo)
                    .addComponent(txtTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistancia)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlturaMax)
                    .addComponent(txtAlturaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVel)
                        .addGap(23, 23, 23)
                        .addComponent(edtVel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(lblAngulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnMostrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVel)
                    .addComponent(edtVel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(18, 18, 18)
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        double v0 = Double.parseDouble(this.edtVel.getText());
        double angulo = Double.parseDouble(this.edtAngulo.getText());
        angulo = Math.toRadians(angulo);
        
        double compX = this.calculo.velocidadeInicialX(v0, angulo);
        double compY = this.calculo.velocidadeInicialY(v0, angulo);
        double tempo = this.calculo.tempo();
        double velInicialX = this.calculo.getV0x();
        
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JTextField edtAngulo;
    private javax.swing.JTextField edtVel;
    private javax.swing.JLabel lblAlturaMax;
    private javax.swing.JLabel lblAngulo;
    private javax.swing.JLabel lblCompX;
    private javax.swing.JLabel lblCompY;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblVel;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtAlturaMax;
    private javax.swing.JTextField txtCompX;
    private javax.swing.JTextField txtCompY;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtTempo;
    // End of variables declaration//GEN-END:variables
}
