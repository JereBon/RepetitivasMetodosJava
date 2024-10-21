package BuclesYMetodos;

import javax.swing.*;

public class ej7 {
    public static void main(String[] args) {

        double[] compras = {600.0, 400.0, 700.0, 500.0, 550.0};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {

        JOptionPane.showMessageDialog(null,"Montos con descuentos aplicados:");

        for (int i = 0; i < compras.length; i++) {

            if (compras[i] > 500) {

                double compraConDescuento = compras[i] * 0.85;

                JOptionPane.showMessageDialog(null,"Compra original: $" + compras[i] + " - Con descuento: $" + compraConDescuento);

            } else {

                JOptionPane.showMessageDialog(null,"Compra original: $" + compras[i] + " - Sin descuento");
            }
        }
    }
}
