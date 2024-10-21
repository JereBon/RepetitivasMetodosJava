package Bucles;

import javax.swing.*;

public class ej1 {
    public static void main(String[] args) {
        String[] actividades = {"estudiar", "hacer ejercicio", "leer", "tiempo libre"};

        int tiempoTotal = 0;

        for (int i = 0; i < actividades.length; i++) {

            String input = JOptionPane.showInputDialog("horas dedicadas a " + actividades[i] + " :");

            int horas = Integer.parseInt(input);

            tiempoTotal += horas;
        }

        JOptionPane.showMessageDialog(null, "El tiempo total dedicado a las actividades es: " + tiempoTotal + " horas.");
    }
}
