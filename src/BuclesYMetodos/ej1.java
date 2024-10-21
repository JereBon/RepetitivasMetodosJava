package BuclesYMetodos;

import javax.swing.*;

public class ej1 {
    public static void main(String[] args) {
        int[] ventas = {200, 150, 180, 220, 300, 250, 400, 220, 150, 280,
                300, 250, 200, 190, 220, 160, 180, 230, 210, 190,
                300, 270, 250, 310, 240, 230, 280, 290, 300, 320};

        int ingresoMensual = ingresosMensuales(ventas);

        JOptionPane.showMessageDialog(null, "Los ingresos mensuales totales son de $" + ingresoMensual);
    }
    public static int ingresosMensuales(int[] ventas){
        int total = 0;

        for (int i = 0; i < ventas.length; i++){
            total += ventas[i];
        }

        return total;
    }
}
