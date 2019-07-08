package ensinandofisica;

import javax.swing.JDialog;
import view.Calcular;
import javax.swing.JFrame;
import view.Desenhar;

/**
 *
 * @author ariel
 */
public class EnsinandoFisica {

    public static void main(String[] args) {

        JFrame view = new Calcular();
        view.setVisible(true);
//        JDialog view = new Desenhar(null, true);
//        view.setVisible(true);

    }

}
