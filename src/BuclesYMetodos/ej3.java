package BuclesYMetodos;

import javax.swing.*;

public class ej3 {
    public static void main(String[] args) {

        String[] clientes = {"Juan", "Ana", "Pedro", "María", "Luis"};
        double[] facturasPendientes = {450.0, 600.0, 800.0, 300.0, 550.0};

        facturasParaProcesar(clientes, facturasPendientes);
    }

    public static void facturasParaProcesar(String[] clientes, double[] facturasPendientes){
        for (int i = 0; i < facturasPendientes.length; i++){
            if (facturasPendientes[i] > 500){
                JOptionPane.showMessageDialog(null, "El cliente " + clientes[i] + " tiene una factura superior a los $500");
            }
        }
    }
}
