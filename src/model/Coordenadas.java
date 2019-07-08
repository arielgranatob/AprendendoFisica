/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ch
 */
public class Coordenadas implements model.DadosCSV {

    private double x, y, tempo;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String getCabecalhoCSV() {
        return "X;Y;TEMPO";
    }

    @Override
    public String getInfoCSV() {
        String info = "\n" + this.x + ";" + this.y + ";" + this.tempo;
        return info;
    }

    @Override
    public void setInfoCSV(String linhaCSV) {
        String[] info = linhaCSV.split(";");
        this.x = Double.parseDouble(info[0]);
        this.y = Double.parseDouble(info[1]);
        this.tempo = Double.parseDouble(info[2]);
    }

}
