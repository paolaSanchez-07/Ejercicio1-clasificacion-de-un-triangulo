package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, " MENÚ DE OPERACIONES");

        String menu = "1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n\nElige una opción:";
        String seleccion = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);

        if (seleccion != null) {
            int opcion = Integer.parseInt(seleccion);

            String n1 = JOptionPane.showInputDialog("Escribe el primer número:");
            String n2 = JOptionPane.showInputDialog("Escribe el segundo número:");

            if (n1 != null && n2 != null) {
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                String resultado = "";

                switch (opcion) {
                    case 1 -> resultado = "La suma es: " + (num1 + num2);
                    case 2 -> resultado = "La resta es: " + (num1 - num2);
                    case 3 -> resultado = "La multiplicación es: " + (num1 * num2);
                    case 4 -> {
                        if (num2 != 0) {
                            resultado = "La división es: " + (num1 / num2);
                        } else {
                            resultado = "No se puede dividir entre cero.";
                        }
                    }
                    default -> resultado = "Esa opción no existe.";
                }

                JOptionPane.showMessageDialog(null, resultado);
            }
        }
    }
}