package BuclesYMetodos;

import javax.swing.*;

public class ej4 {
    public static void main(String[] args) {

        String[] clientes = {"Juan", "Ana", "Pedro", "María", "Luis"};
        int[] compras = {12, 8, 15, 7, 20};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras){

        for (int i = 0; i < clientes.length; i++){
            if (compras[i] > 10){
                JOptionPane.showMessageDialog(null,"" + clientes[i] + " recibe 10% de descuento por haber comprado más de 10 productos");
            }
        }
    }
}
