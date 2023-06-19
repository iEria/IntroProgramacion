package com.mycompany.sc202_2c2023_g1;

import Objetos.Barbero;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;

public class SC202_2C2023_G1 {

    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                    + "<hr style='border-top: 2px solid #ccc;'>"
                    + "<div style='display: flex; justify-content: center;'>"
                    + "<ul style='list-style-type: none; padding: 0; text-align: left;'>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Administración del personal</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Reservación de espacios</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Devolución de espacios</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Revisión de agendas</li>"
                    + "</ul></div></body></html>";

            String iconoBarberia = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon iconoOriginal = new ImageIcon(iconoBarberia);
            // Ajustar el ancho de la imagen al valor deseado
            int nuevoAncho = 200; // Ancho deseado
            int nuevoAlto = -1; // Mantener la relación de aspecto original
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(imagenEscalada);

            String opcion = (String) JOptionPane.showInputDialog(null, mensaje, "Menú Principal", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
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

    public static void SubMenu1() {
        boolean repetir = true;
        int IDbarbero = 0;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                    + "<hr style='border-top: 2px solid #ccc;'>"
                    + "<div style='display: flex; justify-content: center;'>"
                    + "<ul style='list-style-type: none; padding: 0; text-align: left;'>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Agregar Barbero </li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Mostrar Barberos </li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Actualizar Barbero</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Eliminar Barbero</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 5:</strong> Atras </li>"
                    + "</ul></div></body></html>";

            String iconoBarberia = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon iconoOriginal = new ImageIcon(iconoBarberia);
            // Ajustar el ancho de la imagen al valor deseado
            int nuevoAncho = 200; // Ancho deseado
            int nuevoAlto = -1; // Mantener la relación de aspecto original
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(imagenEscalada);

            String opcion = (String) JOptionPane.showInputDialog(null, mensaje, "Menú Administracion Personal", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
            if (opcion == null) {
                // Si se presiona el botón de cerrar o cancelar, se termina el ciclo
                break;
            }
            if (ValidacionNumero(opcion)) {
                switch (opcion) {
                    case "1":
                        boolean comenzar = true;

                        String mensajeNombre = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el nombre del nuevo barbero </li>" + "</ul></div></body></html>";
                        String mensajeApellidos = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese los apellidos del nuevo barbero </li>" + "</ul></div></body></html>";
                        String mensajeCedula = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del nuevo barbero </li>" + "</ul></div></body></html>";
                        String mensajeTelefono = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el telefono del nuevo barbero </li>" + "</ul></div></body></html>";
                        String mensajeHoraI = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la hora de inicio de almuerzo del nuevo barbero </li>" + "</ul></div></body></html>";
                        String mensajeHoraF = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la hora de final de almuerzo del nuevo barbero </li>" + "</ul></div></body></html>";
                        while (comenzar) {

                            String nombreBarbero = (String) JOptionPane.showInputDialog(null, mensajeNombre, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            String nombreApellidos = (String) JOptionPane.showInputDialog(null, mensajeApellidos, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            String cedulaBarbero = (String) JOptionPane.showInputDialog(null, mensajeCedula, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            String telefonoBarbero = (String) JOptionPane.showInputDialog(null, mensajeTelefono, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            String horaAlmuerzoBarberoI = (String) JOptionPane.showInputDialog(null, mensajeHoraI, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            String horaAlmuerzoBarberoF = (String) JOptionPane.showInputDialog(null, mensajeHoraF, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);

                            boolean campoInvalido =  nombreBarbero.isEmpty() ||  nombreApellidos.isEmpty() || cedulaBarbero.isEmpty()  || telefonoBarbero.isEmpty()
                                     || horaAlmuerzoBarberoI.isEmpty()  || horaAlmuerzoBarberoF.isEmpty();

                            if (!campoInvalido) {
                                // Incrementar el ID para el próximo barbero
                                IDbarbero++;

                                // Crear el nuevo barbero con el ID actual y la información proporcionada
                                Barbero.CrearBarbero(IDbarbero, cedulaBarbero, nombreBarbero, nombreApellidos, telefonoBarbero, horaAlmuerzoBarberoI, horaAlmuerzoBarberoF);
                                comenzar = false;
                            } else {
                                // Mostrar mensaje de error si al menos uno de los campos es nulo o está en blanco
                                JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                                comenzar = false;
                            }

                        }

                        break;
                    case "2":
                        Barbero.mostrarBarberos();
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
