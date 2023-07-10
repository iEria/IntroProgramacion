package com.mycompany.sc202_2c2023_g1;

import Objetos.Barbero;
import Objetos.ReservacionClientes;
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
                    + "<li style='margin-bottom: 10px;'><strong>Opción 5:</strong> Salir </li>"
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
                        SubMenu2();
                        break;
                    case "3":
                        JOptionPane.showMessageDialog(null, "Opcion #3");
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null, "Opcion #3");
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

    public static boolean ValidacionNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void SubMenu1() {
        Barbero[] barberoArray = new Barbero[6];
        boolean repetir = true;
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
                    //Crear Barbero
                    case "1":
                        Barbero.CrearBarbero(barberoArray);
                        break;
                    case "2":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            Barbero.mostrarBarberos(barberoArray);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "3":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            String mensajeListaBarberos = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<div style='background-color: #f2f2f2; padding: 20px; border-radius: 5px;'>" + "<h3 style='text-align: center; margin-top: 10px; color: #333;'>Se le mostrará la lista de barberos</h3>" + "<p style='text-align: center; margin-top: 10px; color: #333;'>Por favor, tome nota de la cédula del barbero que desea actualizar.</p>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>";
                            JOptionPane.showMessageDialog(null, mensajeListaBarberos);
                            Barbero.mostrarBarberos(barberoArray);
                            String mensajeCedulaActualizar = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del barbero que desea actualizar </li>" + "</ul></div></body></html>";
                            String cedulavieja = (String) JOptionPane.showInputDialog(null, mensajeCedulaActualizar, "Menú Administracion Personal - Actualizar Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            if (cedulavieja == null) {
                                JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            Barbero.actualizarBarbero(barberoArray, cedulavieja);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "4":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            String mensajeCedulaEliminar = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del barbero que desea eliminar </li>" + "</ul></div></body></html>";
                            String mensajeListaBarberos = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<div style='background-color: #f2f2f2; padding: 20px; border-radius: 5px;'>" + "<h3 style='text-align: center; margin-top: 10px; color: #333;'>Se le mostrará la lista de barberos</h3>" + "<p style='text-align: center; margin-top: 10px; color: #333;'>Por favor, tome nota de la cédula del barbero que desea eliminar.</p>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>";
                            JOptionPane.showMessageDialog(null, mensajeListaBarberos);
                            Barbero.mostrarBarberos(barberoArray);
                            String cedula = (String) JOptionPane.showInputDialog(null, mensajeCedulaEliminar, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            if (cedula == null) {
                                JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            Barbero.eliminarBarbero(barberoArray, cedula);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

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

    public static void SubMenu2() {
        ReservacionClientes[] ReservacionClientesArray = new ReservacionClientes[30];
        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Agregar Reservacion </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Mostrar Reservaciones </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Eliminar Reservaciones</li>" + "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Atras </li>" + "</ul></div></body></html>";

            String iconoBarberia = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon iconoOriginal = new ImageIcon(iconoBarberia);
            // Ajustar el ancho de la imagen al valor deseado
            int nuevoAncho = 200; // Ancho deseado
            int nuevoAlto = -1; // Mantener la relación de aspecto original
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(imagenEscalada);

            String opcion = (String) JOptionPane.showInputDialog(null, mensaje, "Menú Reservación de espacios", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
            if (opcion == null) {
                // Si se presiona el botón de cerrar o cancelar, se termina el ciclo
                break;
            }
            if (ValidacionNumero(opcion)) {
                switch (opcion) {
                    case "1":
                        ReservacionClientes.CrearReservacionClientes(ReservacionClientesArray);
                        break;
                    case "2":
                        if (ReservacionClientes.hayClientesAgregados(ReservacionClientesArray)) {
                            ReservacionClientes.mostrarReservacionClientes(ReservacionClientesArray);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay Reservaciones.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        break;
                    case "3":
                        if (ReservacionClientes.hayClientesAgregados(ReservacionClientesArray)) {
                            String mensajeCedulaEliminar = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del cliente que desea eliminar la reservacion</li>" + "</ul></div></body></html>";
                            String mensajeListaReservaciones = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<div style='background-color: #f2f2f2; padding: 20px; border-radius: 5px;'>" + "<h3 style='text-align: center; margin-top: 10px; color: #333;'>Se le mostrará la lista de las Reservaciones</h3>" + "<p style='text-align: center; margin-top: 10px; color: #333;'>Por favor, tome nota de la cédula del cliente que desea eliminar la reservacion.</p>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>";
                            JOptionPane.showMessageDialog(null, mensajeListaReservaciones);
                            ReservacionClientes.mostrarReservacionClientes(ReservacionClientesArray);
                            String cedula = (String) JOptionPane.showInputDialog(null, mensajeCedulaEliminar, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
                            if (cedula == null) {
                                JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            ReservacionClientes.eliminarReservacion(ReservacionClientesArray, cedula);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "4":
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
