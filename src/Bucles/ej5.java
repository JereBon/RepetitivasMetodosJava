package Bucles;

import javax.swing.*;

public class ej5 {
    public static void main(String[] args) {

        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));

        int numEmpleado = 1;

        do {
            int horasTrabajadasDia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas diarias de trabajo del empleado número " + numEmpleado + " :"));

            int horasTrabajadasSemana = horasTrabajadasDia * 7;

            if (horasTrabajadasSemana > 40){
                int horasExtra = horasTrabajadasSemana - 40;
                JOptionPane.showMessageDialog(null, "Horas extras trabajadas por el empleado número " + numEmpleado + ": " + horasExtra);
            }

            numEmpleado++;
        }while (numEmpleado <= cantidadEmpleados);
    }
}
