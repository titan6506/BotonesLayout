package BotonesLayout;

import javax.swing.*;
import java.awt.*;

public class GridCuatro extends JPanel {
    JButton boton1, boton2,boton3,boton4;

    GridCuatro(){
        GridLayout layout = new GridLayout(2,2);
        setLayout(layout);

        boton1 = new JButton("B1");
        boton2 = new JButton("B2");
        boton3 = new JButton("B3");
        boton4 = new JButton("B4");

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }
}
