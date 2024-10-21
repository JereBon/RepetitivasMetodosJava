package BuclesYMetodos;

import javax.swing.*;

public class ej5 {
    public static void main(String[] args) {
        int[] calificaciones = {5, 4, 3, 5, 4, 2, 5, 3, 4, 5};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        JOptionPane.showMessageDialog(null,"El promedio de satisfacción del cliente es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones){

        int promedioCalificaciones = 0;

        for (int i = 0; i < calificaciones.length; i++){
            promedioCalificaciones += calificaciones[i];
        }

        promedioCalificaciones /= calificaciones.length;

        return promedioCalificaciones;
    }
}
