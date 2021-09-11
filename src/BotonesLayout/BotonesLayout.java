package BotonesLayout;

import javax.swing.*;
import java.awt.*;

public class BotonesLayout extends JFrame {

    //GridCuatro botonesCuatro
    //GridNueve botonesNueve
    Oeste miOeste;
    Norte miNorte;
    Sur miSur;
    Este miEste;
    GridNueve miCentro;

    public BotonesLayout(){
        super.setTitle("Ejemplo Botones y Layouts");
        setVisible(true);
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        //BotonesCuatro = new GridCuatro();
        //botonesNueve = new GridNueve();
        miOeste = new Oeste();
        miEste = new Este();
        miNorte = new Norte();
        miSur = new Sur();
        miCentro = new GridNueve();

        contenedor.add(miNorte,BorderLayout.NORTH);
        contenedor.add(miOeste,BorderLayout.WEST);
        contenedor.add(miEste,BorderLayout.EAST);
        contenedor.add(miSur,BorderLayout.SOUTH);
        contenedor.add(miCentro,BorderLayout.CENTER);

        //super.pack();
        super.paintComponents(getGraphics());
    }
    public static void crearMostrarGUI(){
        new BotonesLayout();
    }

     public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            crearMostrarGUI();
        }
    });
}

}
