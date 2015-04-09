

package boletin25_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    JLabel label;
    

    public void amosar() {
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("Saudo");
        boton2 = new JButton("Despedida");
        label=new JLabel();
        //panel.setLayout(null);
        panel.add(boton1);
        panel.add(boton2);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(label);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(180, 100);
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1 == e.getSource()) {
            label.setText("Hola");
        }
        if (boton2 == e.getSource()) {
            label.setText("Adeus");
        }
    }
}