package ejercicio1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "CLASIFICACIÓN DE TRIÁNGULOS");

        String s1 = JOptionPane.showInputDialog("Escribe el primer lado:");
        String s2 = JOptionPane.showInputDialog("Escribe el segundo lado:");
        String s3 = JOptionPane.showInputDialog("Escribe el tercer lado:");

        if (s1 != null && s2 != null && s3 != null) {
            double a = Double.parseDouble(s1);
            double b = Double.parseDouble(s2);
            double c = Double.parseDouble(s3);

            if (a + b > c && a + c > b && b + c > a) {
                String tipo = "";
                
                if (a == b && b == c) {
                    tipo = "El triángulo es EQUILÁTERO";
                } else if (a == b || a == c || b == c) {
                    tipo = "El triángulo es ISÓSCELES";
                } else {
                    tipo = "El triángulo es ESCALENO";
                }
                
                JOptionPane.showMessageDialog(null, tipo);
            } else {
                JOptionPane.showMessageDialog(null, "Esos números no forman un triángulo.");
            }
        }
    }
}