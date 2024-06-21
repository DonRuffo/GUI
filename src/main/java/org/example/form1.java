package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JButton OKButton;
    private JLabel Jlabel;
    private JButton Borrarjl;

    public form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jlabel.setText("Hola a todos, soy Dennis Díaz");
            }
        });
        Borrarjl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Jlabel.setText(" ");
            }
        });
    }
}
