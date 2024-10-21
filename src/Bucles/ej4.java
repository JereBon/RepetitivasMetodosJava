package Bucles;

import javax.swing.*;

public class ej4 {
    public static void main(String[] args) {

        int diaSemana = 1;
        int ventasSemana = 0;

        while (diaSemana <= 7){
            int ventaDia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas del dia " + diaSemana + ":"));
            ventasSemana += ventaDia;
            diaSemana++;
        }

        JOptionPane.showMessageDialog(null, "Las ventas totales de la semana fueron " + ventasSemana);
    }
}
