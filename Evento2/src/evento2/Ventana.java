/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evento2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bAmarelo, bVerde;

    public void amosar() {

        marco = new JFrame("evento cor panel");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bAmarelo = new JButton("Verde");
        bVerde = new JButton("Amarillo");
        marco.setSize(800, 800);
        panel.setSize(600, 600);
        // Layouts por defecto
        //  panel.setLayout(null);
        //añadimos los componentes
        panel.add(bAzul);
        panel.add(bAmarelo);
        panel.add(bVerde);
        marco.add(panel);
        
        //clases anonimas
        

//asociamos listener
        
        bAzul.addActionListener(new botonAzul());
        bAmarelo.addActionListener(new botonVerde());
        bVerde.addActionListener(new botonAmarillo());

        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         
    }

    public class botonAzul implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.BLUE);

        }

    }

    public class botonVerde implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.GREEN);

        }

    }

    public class botonAmarillo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            panel.setBackground(Color.YELLOW);

        }

    }

}
