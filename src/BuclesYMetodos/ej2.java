package BuclesYMetodos;

import javax.swing.*;

public class ej2 {
    public static void main(String[] args) {

        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {

        JOptionPane.showMessageDialog(null, "Productos con bajo stock:");

        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < 5) {
                JOptionPane.showMessageDialog(null,productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }
}

