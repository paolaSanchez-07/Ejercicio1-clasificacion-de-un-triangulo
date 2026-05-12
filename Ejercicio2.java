package tareapproyectoPNHA;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Se calculara el del salario mensual");

        String dato = JOptionPane.showInputDialog(" Ingrese el salrio mensual:");
        
        if (dato != null) {
            double salario = Double.parseDouble(dato);
            double impuesto = 0;

            if (salario > 0) {
                if (salario < 10000) {
                    impuesto = 0; 
                } else if (salario <= 20000) {
                    impuesto = salario * 0.10; 
                } else if (salario <= 35000) {
                    impuesto = salario * 0.20; 
                } else {
                    impuesto = salario * 0.30; 
                }

                String mensaje = "Tu sueldo es de: $" + salario + "mensual"+ "\n Debera pagar: $" + impuesto;
                
                JOptionPane.showMessageDialog(null, mensaje);
            } else {
                JOptionPane.showMessageDialog(null, "El sueldo ingresado no es válido.");
            }
        }
    }
}
