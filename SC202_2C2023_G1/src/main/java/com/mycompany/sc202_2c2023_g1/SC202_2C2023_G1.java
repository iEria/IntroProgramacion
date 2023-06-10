package com.mycompany.sc202_2c2023_g1;

import javax.swing.JOptionPane;

public class SC202_2C2023_G1 {

    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir) {
            String opcion = JOptionPane.showInputDialog("---Menu Parqueo---\n"
                    + "1.Opcion #1     \n"
                    + "2.Opcion #2     \n"
                    + "3.Opcion #3     \n");
            if (opcion == null) {
                // Si se presiona el botón de cerrar o cancelar, se termina el ciclo
                break;
            }
            if (ValidacionNumero(opcion)) {
                switch (opcion) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Opcion #1");
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "Opcion #2");
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Opcion #3");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción válida, reintente");
                        repetir = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No es un número, reintente");
                repetir = true;
            }
        }
    }

    public static boolean ValidacionNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
