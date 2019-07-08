/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import model.Calculos;

public class Desenhar extends javax.swing.JDialog {

    private double tempo;
    private double x, y;
    private Calculos c;

    public Desenhar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void yourDrawingMethod(Graphics gg) {
        /* Cast it to Graphics2D */
        Graphics2D g = (Graphics2D) gg;

        /* Enable anti-aliasing and pure stroke */
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        /* Construct a shape and draw it */
        Ellipse2D.Double shape = new Ellipse2D.Double(0.5, 0.5, 50, 50);
        g.draw(shape);
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public Calculos getC() {
        return c;
    }

    public void setC(Calculos c) {
        this.c = c;
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D gg = (Graphics2D) g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gg.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        Ellipse2D.Double shape;

        super.paint(gg);
        gg.setColor(Color.magenta);

        int cont = 0;

        for (this.tempo = 0.0; this.tempo <= c.tempoVoo(); this.tempo += 0.001) {

            this.x = c.posicaoEmX(tempo);
            this.y = c.posicaoEmY(tempo);
            
            gg.translate(this.x, this.y);

            shape = new Ellipse2D.Double(this.x, this.y, 5, 5);
            shape.setFrame(this.x, this.y, 5, 5);
            gg.fill(shape);
            gg.draw(shape);

            System.out.println("\nX: " + x + "\tY: " + y + "\tTempo: " + tempo);
            cont += 1;

        }
        System.out.println("Acabô '-'\nCont: " + cont);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
