package BotonesLayout;

import javax.swing.*;
import java.awt.*;

public class GridNueve extends JPanel {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

    GridNueve(){

        GridLayout layout = new GridLayout(3,3);
        setLayout(layout);

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        b6 = new JButton("b6");
        b7 = new JButton("b7");
        b8 = new JButton("b8");
        b9 = new JButton("b9");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
    }
}
