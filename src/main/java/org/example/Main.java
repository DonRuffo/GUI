package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        String primerNumero= JOptionPane.showInputDialog("Introduzca el primer numero");
        String segundoNumero= JOptionPane.showInputDialog("Introduzca el segundo numero");*/

        //convierte las entradas String en valores int para usarlos
        /*int numero1= Integer.parseInt(primerNumero);
        int numero2= Integer.parseInt(segundoNumero);
        int suma=numero1+numero2;
        double resta= numero1-numero2;
        double multiplicacion= numero1*numero2;

        //muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+suma+
                "\n"+"El resultado de la resta es: "+resta+"\n"+"El resultado de la multiplicacion es: "+multiplicacion);
        */


        JFrame frame= new JFrame("Mi aplicación");
        frame.setContentPane(new form1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.pack();
        frame.setVisible(true);

    }
}
