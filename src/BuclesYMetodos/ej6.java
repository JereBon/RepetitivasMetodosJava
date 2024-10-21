package BuclesYMetodos;

import javax.swing.*;

public class ej6 {
    public static void main(String[] args) {

        double[] facturas = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas){

        for (int i = 0; i < facturas.length; i++){

            double facturaConImpuesto = facturas[i] * 1.21;

            JOptionPane.showMessageDialog(null,"Factura sin impuesto: $" + facturas[i]);
            JOptionPane.showMessageDialog(null,"Factura con impuesto: $" + facturaConImpuesto);
        }

    }
}

