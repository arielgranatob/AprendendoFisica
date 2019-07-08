/**
 * PARA QUE TODOS OS CALCULOS DEEM CERTO SIGA ESTA ORDEM
 * 1° CALCULE V0X E V0Y
 * 2° CALCULE O TEMPO
 * O RESTO NAO IMPORTA A ORDEM DESDE QUE ESTES ESTEJAM CALCULADOS
 * Esta classe pode calcular:
 * componente da velocidade em X
 * componente da velocidade em Y
 * tempo
 * distância (X)
 * altura máxima (Y)
 * posição em X
 * posição em Y
 */
package model;

/**
 *
 * @author Felipe Costa
 */
public class Calculos {

    private final double g; // gravidade
    private double v0; // velocidade inicial
    private double v0x; // componente da velocidade em x
    private double v0y; // componente da velocidade em y
    private double angulo; // ângulo em graus
    private double dx; // distância horizontal
    private double dy; // distância vertical (altura)
    private double t; // tempoVoo (em segundos)

    public Calculos() {
        this.v0 = 0;
        this.angulo = 0;
        this.dx = 0;
        this.dy = 0;
        this.t = 0;
        this.v0x = 0;
        this.v0y = 0;
        this.g = 9.8;
    }

    public double getG() {
        return g;
    }

    public double getV0() {
        return v0;
    }

    public void setV0(double v0) {
        this.v0 = v0;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getV0x() {
        return v0x;
    }

    public void setV0x(double v0x) {
        this.v0x = v0x;
    }

    public double getVoy() {
        return v0y;
    }

    public void setVoy(double v0y) {
        this.v0y = v0y;
    }

    /**
     * Calcula o componente da velocidade no eixo das abscissas (X). A fórmula é
     * dada por: v0y = v0 * cos(angulo)
     *
     * @param v0 : velocidade inicial
     * @param angulo : angulo (em graus)
     * @return o componente da velocidade em X
     */
    public double velocidadeInicialX(double v0, double angulo) {

//        angulo = Math.toRadians(angulo);
        double vEmX = v0 * Math.cos(angulo); // v0x = v0 * cos(angulo)
        this.v0x = vEmX;
        return this.v0x;

    }

    /**
     * Calcula o componente da velocidade no eixo das ordenadas (Y). A fórmula é
     * dada por: v0y = v0 * sen(angulo)
     *
     * @param v0 : velocidade inicial
     * @param angulo : angulo (em graus)
     * @return o componente da velocidade em Y
     */
    public double velocidadeInicialY(double v0, double angulo) {

//        angulo = Math.toRadians(angulo);
        double velocidadeEmY = v0 * Math.sin(angulo); // v0y = v0 * seno(angulo)
        this.v0y = velocidadeEmY;
        return this.v0y;

    }

    public double tempoVoo() {

        if (this.v0y != 0) {

            double resultado = (2 * this.v0y) / this.g; // t = (2 * v0y)/ g
            this.t = resultado;
            return this.t;

        }
        System.out.println("ERRO - É necessario calcular o v0y antes");
        return -1;
    }

    /**
     * Calcula a distância total na horizontal.
     *
     * @return a distância em metros (m).
     */
    public double distanciaX() {

        if (this.t != 0 && this.v0x != 0) {

            double dX = (0 + this.v0x) * this.t; // X = X0 + V0x * Tempo
            this.dx = dX;
            return this.dx;

        }
        System.out.println("ERRO - É necessario calcular o v0x e o tempo antes");
        return -1;
    }

    /**
     * [Testar os métodos para ver se eles funcionam sem a conversão dos
     * ângulos]
     *
     *
     * @param v0
     * @param angulo
     * @return
     */
    public double alturaMaxima(double v0, double angulo) {

//        angulo = Math.toRadians(angulo);
        double resposta;
        resposta = this.velocidadeInicialY(v0, angulo);
        resposta = Math.pow(resposta, 2);
        resposta /= (2 * this.g);
        return resposta;

    }

    public double posicaoEmX(double intervaloDeTempo) {

        if (this.t != 0 && this.v0x != 0) {

            double posicaoX = 0 + this.v0x * intervaloDeTempo; // x = x0 + v0x*t
            return posicaoX;
        }

        System.out.println("ERRO - É necessario calcular v0y");
        return -1;
    }

    public double posicaoEmY(double intervaloDeTempo) {

        if (this.t != 0 && this.v0y != 0) {

            double posicaoY = (0 + this.v0y * intervaloDeTempo) - ((this.g * (intervaloDeTempo * intervaloDeTempo)) / 2);
            // y = y0 + v0y*t - (g*t^2)/2
            return posicaoY;
        }

        System.out.println("ERRO - É necessario calcular v0y");
        return -1;
    }

}
