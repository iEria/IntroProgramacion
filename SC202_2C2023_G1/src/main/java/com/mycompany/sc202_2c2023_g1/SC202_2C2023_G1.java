package com.mycompany.sc202_2c2023_g1;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SC202_2C2023_G1 {

    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" +
                "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" +
                "<hr style='border-top: 2px solid #ccc;'>" +
                "<div style='display: flex; justify-content: center;'>" +
                "<ul style='list-style-type: none; padding: 0; text-align: left;'>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Administración del personal</li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Reservación de espacios</li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Devolución de espacios</li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Revisión de agendas</li>" +
                "</ul></div></body></html>";
            
            String iconoBarberia  = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon icono = new ImageIcon(iconoBarberia);
            
            
            String opcion =  (String) JOptionPane.showInputDialog(null, mensaje, "Menú Principal", JOptionPane.PLAIN_MESSAGE , icono , null , null);
            if (opcion == null) {
                // Si se presiona el botón de cerrar o cancelar, se termina el ciclo
                break;
            }
            if (ValidacionNumero(opcion)) {
                switch (opcion) {
                    case "1":
                        SubMenu1();
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null, "Opcion #2");
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Opcion #3");
                        break;
                    case "4":
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
    
    
    public static void SubMenu1(){
         boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" +
                "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" +
                "<hr style='border-top: 2px solid #ccc;'>" +
                "<div style='display: flex; justify-content: center;'>" +
                "<ul style='list-style-type: none; padding: 0; text-align: left;'>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Agregar Barbero </li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Modificar Barbero </li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Actualizar Barbero</li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Eliminar Barbero</li>" +
                "<li style='margin-bottom: 10px;'><strong>Opción 5:</strong> Atras </li>" +
                "</ul></div></body></html>";
            
            String iconoBarberia  = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon icono = new ImageIcon(iconoBarberia);
            
            
            String opcion =  (String) JOptionPane.showInputDialog(null, mensaje, "Menú Administracion Personal", JOptionPane.PLAIN_MESSAGE , icono , null , null);
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
                    case "4":
                        JOptionPane.showMessageDialog(null, "Opcion #4");
                        break; 
                    case "5":
                        repetir = false; 
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
    
    
    
}
