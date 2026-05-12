package ejercicio4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "SISTEMA DE CALIFICACIONES");

        String lectura = JOptionPane.showInputDialog("Escribe la calificación (0-100):");

        if (lectura != null) {
            int nota = Integer.parseInt(lectura);

            if (nota >= 0 && nota <= 100) {
                String mencion = "";
                
                if (nota >= 90) {
                    mencion = "Excelente";
                } else if (nota >= 80) {
                    mencion = "Muy bien";
                } else if (nota >= 70) {
                    mencion = "Bien";
                } else if (nota >= 60) {
                    mencion = "Suficiente";
                } else {
                    mencion = "Reprobado";
                }

                String estado = (nota >= 60) ? "APROBADO" : "REPROBADO";
                String resultado = "Tu resultado: " + mencion + "\nEstado actual: " + estado;

                JOptionPane.showMessageDialog(null, resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Esa nota no es válida, debe ser entre 0 y 100.");
            }
        }
    }
}