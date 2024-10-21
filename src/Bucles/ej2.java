package Bucles;

import javax.swing.*;

public class ej2 {
    public static void main(String[] args) {

        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));

        for (int i = 1; i <= cantidadEmpleados; i++) {
            int horasEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas por el empleado número " + i + " :"));
            int salarioSemanal = horasEmpleado * 15 * 7;
            JOptionPane.showMessageDialog(null, "El salario total del empleado " + i + " es: $" + salarioSemanal);
        }
    }
}
