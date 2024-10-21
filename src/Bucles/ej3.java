package Bucles;

import javax.swing.*;

public class ej3 {
    public static void main(String[] args) {
        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de productos a ingresar:"));

        int i = 1;

        while (i <= numProductos){
            int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto número "+ i +" disponible:"));

            if (cantidadDisponible < 5){
                JOptionPane.showMessageDialog(null, "Es necesario realizar un pedido del producto");
            }

            i++;
        }
    }
}
