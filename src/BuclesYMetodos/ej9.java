package BuclesYMetodos;

import javax.swing.*;

public class ej9 {
    public static void main(String[] args) {

        double[] preciosOriginales = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {

        JOptionPane.showMessageDialog(null,"Precios finales con descuento:");

        for (int i = 0; i < preciosOriginales.length; i++) {

            double precioConDescuento = preciosOriginales[i] * 0.90;

            JOptionPane.showMessageDialog(null,"Precio original: $" + preciosOriginales[i] + " - Con descuento: $" + precioConDescuento);
        }
    }
}
