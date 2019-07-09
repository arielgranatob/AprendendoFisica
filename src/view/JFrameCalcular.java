/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.UsuariosDAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Calculos;
import model.Coordenadas;
import model.Usuario;

/**
 *
 * @author ch
 */
public class JFrameCalcular extends javax.swing.JFrame {

    private Calculos calculo;
    private double x, y;
    private double tempo;
    private ArrayList<Coordenadas> lstCoordenadas;

    public JFrameCalcular() {
        initComponents();
        this.calculo = new Calculos();
        this.x = 0.0;
        this.y = 0.0;
        this.lstCoordenadas = new ArrayList<>();
    }

    static public String lerSessao() {
        String idSalvo = "-1";
        try {
            FileReader arq;
            arq = new FileReader("src/persistencia/logado.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                idSalvo = linha;
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return idSalvo;
    }

    public ArrayList<Coordenadas> getLstCoordenadas() {
        return lstCoordenadas;
    }

    public void setLstCoordenadas(ArrayList<Coordenadas> lstCoordenadas) {
        this.lstCoordenadas = lstCoordenadas;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public Calculos getCalculo() {
        return calculo;
    }

    public void setCalculo(Calculos calculo) {
        this.calculo = calculo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVel = new javax.swing.JLabel();
        lblAngulo = new javax.swing.JLabel();
        edtVel = new javax.swing.JTextField();
        edtAngulo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        lblCompX = new javax.swing.JLabel();
        lblCompY = new javax.swing.JLabel();
        lblTempoVoo = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        lblAlturaMax = new javax.swing.JLabel();
        txtCompX = new javax.swing.JTextField();
        txtCompY = new javax.swing.JTextField();
        txtTempoVoo = new javax.swing.JTextField();
        txtDistancia = new javax.swing.JTextField();
        txtAlturaMax = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        bntAdicionaPonto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblVel.setText("Velocidade Inicial");

        lblAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblAngulo.setText("Ângulo (em graus)");

        edtVel.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        edtAngulo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        painel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblCompX.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblCompX.setText("Componente X:");

        lblCompY.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblCompY.setText("Componente Y:");

        lblTempoVoo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblTempoVoo.setText("Tempo de Voo:");

        lblDistancia.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblDistancia.setText("Distância:");

        lblAlturaMax.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lblAlturaMax.setText("Altura Máxima:");

        txtCompX.setEditable(false);
        txtCompX.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtCompY.setEditable(false);
        txtCompY.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtTempoVoo.setEditable(false);
        txtTempoVoo.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCompX, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCompY)
                            .addComponent(lblTempoVoo)
                            .addComponent(lblDistancia)
                            .addComponent(lblAlturaMax))
                        .addGap(19, 19, 19)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCompY, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtTempoVoo)
                                .addComponent(txtAlturaMax))
                            .addComponent(txtDistancia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(133, Short.MAX_VALUE))
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
                    .addComponent(lblTempoVoo)
                    .addComponent(txtTempoVoo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        bntAdicionaPonto.setText("GANHEI");
        bntAdicionaPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAdicionaPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVel)
                                .addGap(23, 23, 23)
                                .addComponent(edtVel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(lblAngulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntAdicionaPonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRanking)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalvar)
                    .addComponent(btnRanking)
                    .addComponent(bntAdicionaPonto))
                .addGap(18, 18, 18)
                .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        this.calculo.setV0(Double.parseDouble(this.edtVel.getText()));
        double angulo = Double.parseDouble(this.edtAngulo.getText());
        angulo = Math.toRadians(angulo);

        double compX, compY, distancia, alturaMax;

        compX = this.calculo.velocidadeInicialX(this.calculo.getV0(), angulo);
        compY = this.calculo.velocidadeInicialY(this.calculo.getV0(), angulo);
        this.tempo = this.calculo.tempoVoo();
        distancia = this.calculo.distanciaX();
        alturaMax = this.calculo.alturaMaxima(this.calculo.getV0(), angulo);

        this.txtCompX.setText(Double.toString(compX));
        this.txtCompY.setText(Double.toString(compY));
        this.txtTempoVoo.setText(Double.toString(this.tempo));
        this.txtDistancia.setText(Double.toString(distancia));
        this.txtAlturaMax.setText(Double.toString(alturaMax));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        for (double i = 0.0; i <= this.tempo; i += 0.001) {

            this.x = this.calculo.posicaoEmX(i);
            this.y = this.calculo.posicaoEmY(i);

            Coordenadas c = new Coordenadas();
            c.setX(this.x);
            c.setY(this.y);
            c.setTempo(i);

            this.lstCoordenadas.add(c);
            System.out.println("x = " + this.x + "\ty = " + this.y + "\ttempo = " + i);
        }
        this.salvarArquivo("src/persistencia/lst_coordenadas.csv");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        JFrmRanking Ranking = new JFrmRanking();
        Ranking.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRankingActionPerformed

    private void bntAdicionaPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAdicionaPontoActionPerformed
        UsuariosDAO usuariodao = new UsuariosDAO();
        Usuario usuario = new Usuario();
        usuariodao.update(usuario);
    }//GEN-LAST:event_bntAdicionaPontoActionPerformed

    public void salvarArquivo(String caminho) {
        try {
            FileWriter arquivo = new FileWriter(caminho);
            PrintWriter escrita = new PrintWriter(arquivo);

            Coordenadas aux = new Coordenadas();
            String info = aux.getCabecalhoCSV();

            for (Coordenadas c : this.lstCoordenadas) {
                info += c.getInfoCSV();
            }

            escrita.print(info);
            JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso!");

        } catch (IOException ex) {
            Logger.getLogger(JFrameCalcular.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "ERRO. Não foi possível salvar o arquivo");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdicionaPonto;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtAngulo;
    private javax.swing.JTextField edtVel;
    private javax.swing.JLabel lblAlturaMax;
    private javax.swing.JLabel lblAngulo;
    private javax.swing.JLabel lblCompX;
    private javax.swing.JLabel lblCompY;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblTempoVoo;
    private javax.swing.JLabel lblVel;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtAlturaMax;
    private javax.swing.JTextField txtCompX;
    private javax.swing.JTextField txtCompY;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtTempoVoo;
    // End of variables declaration//GEN-END:variables
}
