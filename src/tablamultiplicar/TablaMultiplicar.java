/*
5. Leer un número y mostrar su tabla de multiplicar.
 */
package tablamultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class TablaMultiplicar {

    public static void main(String[] args) {

        int num_multiplicar;
        int resultado;
        try {
            num_multiplicar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a Multiplicar"));

            if ((num_multiplicar > 0) && (num_multiplicar <= 10)) {
                for (int i = 1; i <= 10; i++) {
                    resultado = num_multiplicar * i;
                    System.out.println(resultado);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingresa un rango de 0 a 10");
            }
        } catch (Exception e) {
            System.out.println("Verifica el valor " + e);
        }

    }

}
