package BuclesYMetodos;

import javax.swing.*;

public class ej8 {
    public static void main(String[] args) {

        String[] empleados = {"Juan", "Ana", "Pedro", "María", "Luis"};

        int[] horasTrabajadas = {40, 35, 50, 45, 38};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {

        final int TARIFA_HORA = 15;

        JOptionPane.showMessageDialog(null,"Pagos semanales:");

        for (int i = 0; i < empleados.length; i++) {

            int pago = horasTrabajadas[i] * TARIFA_HORA;

            JOptionPane.showMessageDialog(null,empleados[i] + " - Pago semanal: $" + pago);
        }
    }
}
