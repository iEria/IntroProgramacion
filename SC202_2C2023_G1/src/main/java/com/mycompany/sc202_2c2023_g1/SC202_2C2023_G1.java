package com.mycompany.sc202_2c2023_g1;

import Objetos.Barbero;
import Objetos.ReservacionClientes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;

public class SC202_2C2023_G1 {

    public static void main(String[] args) {
        ReservacionClientes[] ReservacionClientesArray = new ReservacionClientes[30];
        Barbero[] barberoArray = new Barbero[6];
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
                        SubMenu1(barberoArray);
                        break;
                    case "2":
                        SubMenu2(barberoArray, ReservacionClientesArray);
                        break;
                    case "3":
                        SubMenu3(barberoArray, ReservacionClientesArray);
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

    public static boolean ValidacionNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void SubMenu1(Barbero[] barberoArray) {

        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                    + "<hr style='border-top: 2px solid #ccc;'>"
                    + "<div style='display: flex; justify-content: center;'>"
                    + "<ul style='list-style-type: none; padding: 0; text-align: left;'>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Agregar Barbero </li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Mostrar Barberos </li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Eliminar Barbero</li>"
                    + "<li style='margin-bottom: 10px;'><strong>Opción 4:</strong> Atras </li>"
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
                    //Mostrar Barberos
                    case "2":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            Barbero.mostrarBarberos(barberoArray);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    //Actualizar Barberos                  
                    case "3":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            String mensajeidEliminar = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el id del barbero que desea eliminar </li>" + "</ul></div></body></html>";
                            String mensajeListaBarberos = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<div style='background-color: #f2f2f2; padding: 20px; border-radius: 5px;'>" + "<h3 style='text-align: center; margin-top: 10px; color: #333;'>Se le mostrará la lista de barberos</h3>" + "<p style='text-align: center; margin-top: 10px; color: #333;'>Por favor, tome nota del id del barbero que desea eliminar.</p>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>";
                            JOptionPane.showMessageDialog(null, mensajeListaBarberos);
                            Barbero.mostrarBarberos(barberoArray);
                            int id = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeidEliminar));
                           String idvalidar = String.valueOf(id);
                            if (idvalidar == null) {
                                JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            Barbero.eliminarBarbero(barberoArray, id);
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

    public static void SubMenu2(Barbero[] barberoArray, ReservacionClientes[] ReservacionClientesArray) {
        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Agregar Reservacion </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Mostrar Reservaciones </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Atras </li>" + "</ul></div></body></html>";

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
                        if (Barbero.hayBarberosAgregados(barberoArray)) {
                            ReservacionClientes.CrearReservacionClientes(ReservacionClientesArray, barberoArray);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "2":
                        if (ReservacionClientes.hayClientesAgregados(ReservacionClientesArray)) {
                            String mensaje2 = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Mostrar Reservacion segun dia </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Mostrar todas las Reservaciones </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 3:</strong> Atras </li>" + "</ul></div></body></html>";

                            String opcion2 = (String) JOptionPane.showInputDialog(null, mensaje2, "Menú Reservación de espacios", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
                            if (ValidacionNumero(opcion2)) {

                                switch (opcion2) {
                                    case "1":
                                        String DiaCita = (String) JOptionPane.showInputDialog(null, "Ingrese el dia con el formato (dd/mm/yyyy) de las citas que quiere mostrar", "Menú Reservación de espacios - Mostar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
                                        boolean esFechaValida = ReservacionClientes.validarFecha(DiaCita, "dd/MM/yyyy");
                                        if (!esFechaValida) {
                                            String mensajeError = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                                                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                                                    + "<hr style='border-top: 2px solid #ccc;'>"
                                                    + "<div style='display: flex; justify-content: center;'>"
                                                    + "<div style='background-color: #f4e6e6; padding: 20px; border-radius: 5px;'>"
                                                    + "<h3 style='text-align: center; margin-top: 10px; color: #FF0000;'>Error en el registro</h3>"
                                                    + "<p style='text-align: center; margin-top: 10px; color: #333;'>La fecha tiene el formato incorrecto o ingreso un mes actual del que estamos.</p>"
                                                    + "<div style='display: flex; justify-content: center;'>"
                                                    + "</div></div></div></body></html>";
                                            JOptionPane.showMessageDialog(null, mensajeError);
                                            return;
                                        }
                                        if (DiaCita == null || DiaCita.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            ReservacionClientes.mostrarReservacionClientesPorDia(ReservacionClientesArray, DiaCita, barberoArray);
                                        }

                                        break;
                                    case "2":
                                        ReservacionClientes.mostrarReservacionClientes(ReservacionClientesArray, barberoArray);
                                        break;
                                    case "3":
                                        repetir = false;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "No es una opción válida, reintente");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No es un número, reintente");
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay Reservaciones.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        break;
                    case "3":
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

    public static void SubMenu3(Barbero[] barberoArray, ReservacionClientes[] ReservacionClientesArray) {
        boolean repetir = true;
        while (repetir) {
            String mensaje = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'><strong>Opción 1:</strong> Devolver Reservacion </li>" + "<li style='margin-bottom: 10px;'><strong>Opción 2:</strong> Atras </li>" + "</ul></div></body></html>";

            String iconoBarberia = "C:/Users/corde/Documents/NetBeansProjects/SC202_2C2023_G1/SC202_2C2023_G1/src/main/java/Objetos/Barber.jpg";
            ImageIcon iconoOriginal = new ImageIcon(iconoBarberia);
            // Ajustar el ancho de la imagen al valor deseado
            int nuevoAncho = 200; // Ancho deseado
            int nuevoAlto = -1; // Mantener la relación de aspecto original
            Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
            ImageIcon iconoAjustado = new ImageIcon(imagenEscalada);

            String opcion = (String) JOptionPane.showInputDialog(null, mensaje, "Menú Devolucion de espacios", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
            if (opcion == null) {
                // Si se presiona el botón de cerrar o cancelar, se termina el ciclo
                break;
            }
            if (ValidacionNumero(opcion)) {
                switch (opcion) {
                    case "1":
                        if (Barbero.hayBarberosAgregados(barberoArray)) {

                            if (ReservacionClientes.hayClientesAgregados(ReservacionClientesArray)) {
                                String mensajeIDEliminar = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el ID de la reservacion que desea devolver </li>" + "</ul></div></body></html>";
                                String mensajeListaReservaciones = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<div style='background-color: #f2f2f2; padding: 20px; border-radius: 5px;'>" + "<h3 style='text-align: center; margin-top: 10px; color: #333;'>Se le mostrará la lista de las Reservaciones</h3>" + "<p style='text-align: center; margin-top: 10px; color: #333;'>Por favor, tome nota del id de la reservacion que desea devolver.</p>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>";
                                JOptionPane.showMessageDialog(null, mensajeListaReservaciones);

                                String DiaCita = (String) JOptionPane.showInputDialog(null, "Ingrese el dia con el formato (dd/mm/yyyy) de las citas que quiere mostrar", "Menú Reservación de espacios - Mostar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
                                boolean esFechaValida = ReservacionClientes.validarFecha(DiaCita, "dd/MM/yyyy");
                                if (!esFechaValida) {
                                    String mensajeError = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                                            + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                                            + "<hr style='border-top: 2px solid #ccc;'>"
                                            + "<div style='display: flex; justify-content: center;'>"
                                            + "<div style='background-color: #f4e6e6; padding: 20px; border-radius: 5px;'>"
                                            + "<h3 style='text-align: center; margin-top: 10px; color: #FF0000;'>Error en el registro</h3>"
                                            + "<p style='text-align: center; margin-top: 10px; color: #333;'>La fecha tiene el formato incorrecto o ingreso un mes actual del que estamos.</p>"
                                            + "<div style='display: flex; justify-content: center;'>"
                                            + "</div></div></div></body></html>";
                                    JOptionPane.showMessageDialog(null, mensajeError);
                                    return;
                                }

                                if (DiaCita == null || DiaCita.isEmpty()) {
                                    JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    int count = 0;
                                    for (Barbero barbero : barberoArray) {
                                        if (barbero != null) {
                                            count++;
                                        }
                                    }

                                    // Crear un array de los nombres de los barberos no nulos
                                    String[] nombresBarberos = new String[count];
                                    int x = 0;
                                    for (Barbero barbero : barberoArray) {
                                        if (barbero != null) {
                                            nombresBarberos[x] = barbero.getNombre();
                                            x++;
                                        }
                                    }

                                    int indiceNombreBarbero = JOptionPane.showOptionDialog(null, "Seleccione el nombre del barbero", "Menú de opciones",
                                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, nombresBarberos, nombresBarberos[0]);
                                    int IdBarberoSeleccionado = 0;

                                    String nombre = nombresBarberos[indiceNombreBarbero];
                                    for (int z = 0; z < count; z++) {
                                        if (nombre == barberoArray[z].getNombre()) {
                                            IdBarberoSeleccionado = barberoArray[z].getid();
                                        }

                                    }

                                    ReservacionClientes.mostrarReservacionClientesPorDiayBarbero(ReservacionClientesArray, DiaCita, barberoArray, IdBarberoSeleccionado);
                                }

                                String id = (String) JOptionPane.showInputDialog(null, mensajeIDEliminar, "Menú Administracion Personal", JOptionPane.PLAIN_MESSAGE, iconoAjustado, null, null);
                                if (id != null) {
                                    try {
                                        int idparseado = Integer.parseInt(id);
                                        ReservacionClientes.eliminarReservacion(ReservacionClientesArray, idparseado);
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Error: El campo debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: El campo es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No hay Reservaciones agregados.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No hay barberos agregados.", "Error", JOptionPane.ERROR_MESSAGE);

                        }
                        break;
                    case "2":
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