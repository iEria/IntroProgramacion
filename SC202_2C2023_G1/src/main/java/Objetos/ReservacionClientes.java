/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * @author Kevin
 */
public class ReservacionClientes {

    public int id;
    public String NombreCliente;
    public String CedulaCliente;
    public String ApellidosCliente;
    public String TelefonoCliente;
    public String HoraInicio;
    public String HoraFinal;
    public int idBarbero;
    public String DiaCita;
    public static int posicion = 0;

    /*Get and Set del atributo ID*/
    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public int getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }

    /*Get and Set del atributo CedulaCliente*/
    public void setCedulaCliente(String CedulaCliente) {
        this.CedulaCliente = CedulaCliente;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    /*Get and Set del atributo NombreCliente*/
    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    /*Get and Set del atributo ApellidosCliente*/
    public void setApellidosCliente(String ApellidosCliente) {
        this.ApellidosCliente = ApellidosCliente;
    }

    public String getApellidosCliente() {
        return ApellidosCliente;
    }

    /*Get and Set del atributo TelefonoCliente*/
    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    /*Get and Set del atributo HoraInicio*/
    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    /*Get and Set del atributo HoraFinal*/
    public void setHoraFinal(String HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

    public String getHoraFinal() {
        return HoraFinal;
    }

    /*Get and Set del atributo DiaCita*/
    public void setDiaCita(String DiaCita) {
        this.DiaCita = DiaCita;
    }

    public String getDiaCita() {
        return DiaCita;
    }

    private static void mostrarMensajeExito() {
        String mensajeExito = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #4CAF50;'>Registro exitoso</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>¡La reservacion del cliente se creo correctamente!</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeExito);
    }

    private static void mostrarMensajeExitoEliminacion() {
        String mensajeExitoEliminacion = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #4CAF50;'>Eliminación exitosa</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>¡La reservacion del cliente se elimino correctamente!</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeExitoEliminacion);
    }

    private static void mostrarMensajeDatosReservacionClientes(ReservacionClientes reservacionclientes, Barbero[] barberoArray) {
        int count = 0;
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                count++;
            }
        }

        String NombreBarbero = "";
        for (int x = 0; x < count; x++) {
            if (barberoArray[x].getid() == reservacionclientes.getIdBarbero()) {
                NombreBarbero = barberoArray[x].getNombre();
            }
        }

        String mensajeDatosReservacionClientes = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Datos de Reservacion Clientes</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>ID:</strong> " + reservacionclientes.getid() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Nombre:</strong> " + reservacionclientes.getNombreCliente() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Apellidos:</strong> " + reservacionclientes.getCedulaCliente() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Cédula:</strong> " + reservacionclientes.getApellidosCliente() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Teléfono:</strong> " + reservacionclientes.getTelefonoCliente() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Inicio:</strong> " + reservacionclientes.getHoraInicio() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Final:</strong> " + reservacionclientes.getHoraFinal() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Dia de la cita:</strong> " + reservacionclientes.getDiaCita() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Nombre Barbero seleccionado es :</strong> " + NombreBarbero + "</p>"
                + "</div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeDatosReservacionClientes);
    }

    public static boolean ValidarReservaciones(ReservacionClientes[] ReservacionClientesArray, String DiaCita, int IdBarbero, ReservacionClientes ReservacionNueva) {
    SimpleDateFormat horaFormato = new SimpleDateFormat("h:mm a", Locale.ENGLISH);

    Calendar HoraInicioMenuCal = Calendar.getInstance();
    Calendar HoraFinalMenuCal = Calendar.getInstance();

    try {
        HoraInicioMenuCal.setTime(horaFormato.parse(ReservacionNueva.getHoraInicio()));
        HoraFinalMenuCal.setTime(horaFormato.parse(ReservacionNueva.getHoraFinal()));
    } catch (ParseException e) {
        e.printStackTrace();
        return false;
    }

    for (ReservacionClientes ReservacionCliente : ReservacionClientesArray) {
        if (ReservacionCliente != null && ReservacionCliente.DiaCita.equals(DiaCita) && ReservacionCliente.idBarbero == IdBarbero) {
            try {
                Calendar horaInicioSeleccionadaCal = Calendar.getInstance();
                Calendar horaFinalSeleccionadaCal = Calendar.getInstance();
                horaInicioSeleccionadaCal.setTime(horaFormato.parse(ReservacionCliente.getHoraInicio()));
                horaFinalSeleccionadaCal.setTime(horaFormato.parse(ReservacionCliente.getHoraFinal()));

                if (horaInicioSeleccionadaCal.compareTo(HoraFinalMenuCal) < 0 && horaFinalSeleccionadaCal.compareTo(HoraInicioMenuCal) > 0) {
                    return false;
                }
            } catch (ParseException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    return true;
}

    public static void CrearReservacionClientes(ReservacionClientes[] ReservacionClientesArray, Barbero[] barberoArray) {
        boolean comenzar = true;
        String mensajeNombreCliente = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el nombre del cliente </li>" + "</ul></div></body></html>";
        String mensajeCedulaCliente = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del cliente </li>" + "</ul></div></body></html>";
        String mensajeApellidosCliente = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el apellido del cliente </li>" + "</ul></div></body></html>";
        String mensajeTelefonoCliente = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el telefono del cliente </li>" + "</ul></div></body></html>";
        String mensajeDiaCita = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el dia de la cita segun el formato (dd/MM/yyyy)</li>" + "</ul></div></body></html>";
        while (comenzar) {
            String NombreCliente = (String) JOptionPane.showInputDialog(null, mensajeNombreCliente, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            String ApellidosCliente = (String) JOptionPane.showInputDialog(null, mensajeApellidosCliente, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            String CedulaCliente = (String) JOptionPane.showInputDialog(null, mensajeCedulaCliente, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (CedulaCliente.length() != 9) {
                JOptionPane.showMessageDialog(null, "No tiene los digitos suficientes.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String TelefonoCliente = (String) JOptionPane.showInputDialog(null, mensajeTelefonoCliente, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            if (TelefonoCliente.length() != 8) {
                JOptionPane.showMessageDialog(null, "No tiene los digitos suficientes.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Estaba intntando hacer como las horas pero que sean con el array de barberos que hay
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

            int indiceNombreBarbero = JOptionPane.showOptionDialog(null, "Seleccione el nombre del barbero que desea", "Menú de opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, nombresBarberos, nombresBarberos[0]);
            int IdBarberoSeleccionado = 0;

            String nombre = nombresBarberos[indiceNombreBarbero];
            for (int z = 0; z < count; z++) {
                if (nombre == barberoArray[z].getNombre()) {
                    IdBarberoSeleccionado = barberoArray[z].getid();
                }

            }

            String DiaCita = (String) JOptionPane.showInputDialog(null, mensajeDiaCita, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            boolean esFechaValida = validarFecha(DiaCita, "dd/MM/yyyy");
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

            String[] options = {"8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM"};
            String HoraInicioMenu = "";
            String HoraFinalMenu = "";
            for (int z = 0; z < count; z++) {
                if (IdBarberoSeleccionado == barberoArray[z].getid()) {
                    HoraInicioMenu = barberoArray[z].getHoraAlmuerzoInicio();
                    HoraFinalMenu = barberoArray[z].getHoraAlmuerzoFinal();

                }

            }
            JOptionPane.showMessageDialog(null, "Recordar que la hora de almuerzo del barbero selecionado es de " + HoraInicioMenu + " a " + HoraFinalMenu);
            int indiceHoraInicio = JOptionPane.showOptionDialog(null, "Seleccione la hora inicio de la cita", "Menú de opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            String horaInicioSeleccionada = options[indiceHoraInicio];

            // Obtener las opciones para la hora final
            String[] opcionesHoraFinal = new String[options.length - indiceHoraInicio - 1];
            for (int i = indiceHoraInicio + 1; i < options.length; i++) {
                opcionesHoraFinal[i - indiceHoraInicio - 1] = options[i];
            }

            int indiceHoraFinal = JOptionPane.showOptionDialog(null, "Seleccione la hora final de la cita", "Menú de opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesHoraFinal, opcionesHoraFinal[0]);

            String horaFinalSeleccionada = opcionesHoraFinal[indiceHoraFinal];

            boolean campoInvalido = NombreCliente.isEmpty() || CedulaCliente.isEmpty() || ApellidosCliente.isEmpty() || TelefonoCliente.isEmpty()
                    || DiaCita.isEmpty();

            if (!campoInvalido) {
                // Incrementar el ID para el próximo barbero
                int maxId = 0;
                for (int i = 0; i < posicion; i++) {
                    if (ReservacionClientesArray[i] != null && ReservacionClientesArray[i].getid() > maxId) {
                        maxId = ReservacionClientesArray[i].getid();
                    }
                }
                int id = maxId + 1;
                SimpleDateFormat horaFormato = new SimpleDateFormat("h:mm a", Locale.ENGLISH);

                // Convierte las cadenas de hora seleccionadas en objetos Calendar
                Calendar horaInicioSeleccionadaCal = Calendar.getInstance();
                Calendar horaFinalSeleccionadaCal = Calendar.getInstance();
                Calendar HoraInicioMenuCal = Calendar.getInstance();
                Calendar HoraFinalMenuCal = Calendar.getInstance();

                try {
                    horaInicioSeleccionadaCal.setTime(horaFormato.parse(horaInicioSeleccionada));
                    horaFinalSeleccionadaCal.setTime(horaFormato.parse(horaFinalSeleccionada));
                    HoraInicioMenuCal.setTime(horaFormato.parse(HoraInicioMenu));
                    HoraFinalMenuCal.setTime(horaFormato.parse(HoraFinalMenu));
                } catch (ParseException e) {
                    // Manejo de excepciones si ocurre un error al analizar las horas
                    e.printStackTrace();
                }

                // Realiza las comparaciones de tiempo utilizando objetos Calendar
                if ((horaInicioSeleccionadaCal.compareTo(HoraFinalMenuCal) >= 0)
                        || (horaFinalSeleccionadaCal.compareTo(HoraInicioMenuCal) <= 0)) {
                    // Las condiciones se invierten para permitir registros fuera del horario de almuerzo
                    // Mostrar mensaje si la cita cae fuera del horario de almuerzo
                    // Continuar con el flujo normal si la cita está fuera del horario de almuerzo
                } else {
                    JOptionPane.showMessageDialog(null, "Error: En este horario almuerza el barbero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ReservacionClientes nuevoReservacionClientes = new ReservacionClientes();
                nuevoReservacionClientes.setid(id);
                nuevoReservacionClientes.setNombreCliente(NombreCliente);
                nuevoReservacionClientes.setCedulaCliente(CedulaCliente);
                nuevoReservacionClientes.setApellidosCliente(ApellidosCliente);
                nuevoReservacionClientes.setTelefonoCliente(TelefonoCliente);
                nuevoReservacionClientes.setHoraInicio(horaInicioSeleccionada);
                nuevoReservacionClientes.setHoraFinal(horaFinalSeleccionada);
                nuevoReservacionClientes.setDiaCita(DiaCita);
                nuevoReservacionClientes.setIdBarbero(IdBarberoSeleccionado);
                if (!ReservacionClientes.ValidarReservaciones(ReservacionClientesArray, DiaCita, IdBarberoSeleccionado, nuevoReservacionClientes)) {
                    JOptionPane.showMessageDialog(null, "Error: El Horario choca con citas anteriormente agregadas.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                ReservacionClientesArray[posicion] = nuevoReservacionClientes;
                posicion = (posicion + 1);

                mostrarMensajeExito();
                mostrarMensajeDatosReservacionClientes(nuevoReservacionClientes, barberoArray);

                comenzar = false;
            } else {
                // Mostrar mensaje de error si al menos uno de los campos es nulo o está en blanco
                JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                comenzar = false;
            }
        }

    }

    public static void mostrarReservacionClientes(ReservacionClientes[] ReservacionClientesArray, Barbero[] barberoArray) {
        int count = 0;
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                count++;
            }
        }
        String reservacionclientesInfo = "";
        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionclientes = ReservacionClientesArray[i];
            if (reservacionclientes != null) {
                String NombreBarbero = "";
                for (int x = 0; x < count; x++) {
                    if (barberoArray[x].getid() == reservacionclientes.getIdBarbero()) {
                        NombreBarbero = barberoArray[x].getNombre();
                    }
                }

                reservacionclientesInfo += "ID: " + reservacionclientes.getid() + "<br>";
                reservacionclientesInfo += "Nombre: " + reservacionclientes.getNombreCliente() + "<br>";
                reservacionclientesInfo += "Apellidos: " + reservacionclientes.getCedulaCliente() + "<br>";
                reservacionclientesInfo += "Cédula: " + reservacionclientes.getApellidosCliente() + "<br>";
                reservacionclientesInfo += "Teléfono: " + reservacionclientes.getTelefonoCliente() + "<br>";
                reservacionclientesInfo += "Horario Inicio Cita: " + reservacionclientes.getHoraInicio() + "<br>";
                reservacionclientesInfo += "Horario Final Cita: " + reservacionclientes.getHoraFinal() + "<br>";
                reservacionclientesInfo += "Dia de la cita: " + reservacionclientes.getDiaCita() + "<br>";
                reservacionclientesInfo += "Nombre Barbero seleccionado es : " + NombreBarbero + "<br>";
                reservacionclientesInfo += "------------------<br>";
            }
        }

        String mensaje = "<html><body style='width: 300px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<p style='text-align: left; margin-top: 10px;'>"
                + reservacionclientesInfo
                + "</p>"
                + "</div></div></body></html>";

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static boolean mostrarReservacionClientesPorDia(ReservacionClientes[] ReservacionClientesArray, String diaCita, Barbero[] barberoArray) {
        String reservacionClientesInfo = "";
        boolean reservacionesEncontradas = false;
        int count = 0;
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                count++;
            }
        }

        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionClientes = ReservacionClientesArray[i];

            if (reservacionClientes != null) {
                String NombreBarbero = "";
                for (int x = 0; x < count; x++) {
                    if (barberoArray[x].getid() == reservacionClientes.getIdBarbero()) {
                        NombreBarbero = barberoArray[x].getNombre();
                    }

                    if (reservacionClientes != null && reservacionClientes.getDiaCita().equals(diaCita)) {
                        reservacionesEncontradas = true;
                        reservacionClientesInfo += "ID: " + reservacionClientes.getid() + "<br>";
                        reservacionClientesInfo += "Nombre: " + reservacionClientes.getNombreCliente() + "<br>";
                        reservacionClientesInfo += "Apellidos: " + reservacionClientes.getApellidosCliente() + "<br>";
                        reservacionClientesInfo += "Cédula: " + reservacionClientes.getCedulaCliente() + "<br>";
                        reservacionClientesInfo += "Teléfono: " + reservacionClientes.getTelefonoCliente() + "<br>";
                        reservacionClientesInfo += "Horario Inicio Cita: " + reservacionClientes.getHoraInicio() + "<br>";
                        reservacionClientesInfo += "Horario Final Cita: " + reservacionClientes.getHoraFinal() + "<br>";
                        reservacionClientesInfo += "Día de la cita: " + reservacionClientes.getDiaCita() + "<br>";
                        reservacionClientesInfo += "Nombre Barbero seleccionado es : " + NombreBarbero + "<br>";
                        reservacionClientesInfo += "------------------<br>";
                    }
                }
            }
        }

        if (reservacionesEncontradas) {
            String mensaje = "<html><body style='width: 300px; font-family: Arial, sans-serif;'>"
                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                    + "<hr style='border-top: 2px solid #ccc;'>"
                    + "<div style='display: flex; justify-content: center;'>"
                    + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                    + "<p style='text-align: left; margin-top: 10px;'>"
                    + reservacionClientesInfo
                    + "</p>"
                    + "</div></div></body></html>";

            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No hay citas para el día ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean mostrarReservacionClientesPorDiayBarbero(ReservacionClientes[] ReservacionClientesArray, String diaCita, Barbero[] barberoArray, int IdBarberoRecibido) {
        String reservacionClientesInfo = "";
        boolean reservacionesEncontradas = false;
        int count = 0;
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                count++;
            }
        }

        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionClientes = ReservacionClientesArray[i];

            if (reservacionClientes != null) {
                String NombreBarbero = "";
                for (int x = 0; x < count; x++) {
                    if (barberoArray[x].getid() == reservacionClientes.getIdBarbero()) {
                        NombreBarbero = barberoArray[x].getNombre();
                    }

                    if (reservacionClientes != null && reservacionClientes.getDiaCita().equals(diaCita)) {
                        if (reservacionClientes.getIdBarbero() == IdBarberoRecibido) {
                            reservacionesEncontradas = true;
                            reservacionClientesInfo += "ID: " + reservacionClientes.getid() + "<br>";
                            reservacionClientesInfo += "Nombre: " + reservacionClientes.getNombreCliente() + "<br>";
                            reservacionClientesInfo += "Apellidos: " + reservacionClientes.getApellidosCliente() + "<br>";
                            reservacionClientesInfo += "Cédula: " + reservacionClientes.getCedulaCliente() + "<br>";
                            reservacionClientesInfo += "Teléfono: " + reservacionClientes.getTelefonoCliente() + "<br>";
                            reservacionClientesInfo += "Horario Inicio Cita: " + reservacionClientes.getHoraInicio() + "<br>";
                            reservacionClientesInfo += "Horario Final Cita: " + reservacionClientes.getHoraFinal() + "<br>";
                            reservacionClientesInfo += "Día de la cita: " + reservacionClientes.getDiaCita() + "<br>";
                            reservacionClientesInfo += "Nombre Barbero seleccionado es : " + NombreBarbero + "<br>";
                            reservacionClientesInfo += "------------------<br>";
                        }
                    }
                }
            }
        }

        if (reservacionesEncontradas) {
            String mensaje = "<html><body style='width: 300px; font-family: Arial, sans-serif;'>"
                    + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                    + "<hr style='border-top: 2px solid #ccc;'>"
                    + "<div style='display: flex; justify-content: center;'>"
                    + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                    + "<p style='text-align: left; margin-top: 10px;'>"
                    + reservacionClientesInfo
                    + "</p>"
                    + "</div></div></body></html>";

            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No hay citas para el día ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public static void eliminarReservacion(ReservacionClientes[] ReservacionClientesArray, int idReserva) {
        boolean idEncontrado = false;

        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            if (ReservacionClientesArray[i] != null && ReservacionClientesArray[i].getid() == idReserva) {
                ReservacionClientesArray[i] = null;
                idEncontrado = true;
                mostrarMensajeExitoEliminacion();
                break;
            }
        }

        if (!idEncontrado) {
            JOptionPane.showMessageDialog(null, "Error: No se encontró el ID de reserva.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean hayClientesAgregados(ReservacionClientes[] ReservacionClientesArray) {
        for (ReservacionClientes reservacionclientes : ReservacionClientesArray) {
            if (reservacionclientes != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarFecha(String fecha, String formato) {
        SimpleDateFormat diaformato = new SimpleDateFormat(formato);
        diaformato.setLenient(false); // Desactiva la interpretación flexible de la fecha

        try {
            Date date = diaformato.parse(fecha);

            // Obtener la fecha actual
            Calendar calActual = Calendar.getInstance();

            // Obtener la fecha ingresada
            Calendar calIngresada = Calendar.getInstance();
            calIngresada.setTime(date);

            // Comparar fechas completas (año, mes, día)
            if (calIngresada.get(Calendar.YEAR) < calActual.get(Calendar.YEAR)) {
                return false; // El año ingresado es anterior al año actual
            } else if (calIngresada.get(Calendar.YEAR) == calActual.get(Calendar.YEAR)) {
                if (calIngresada.get(Calendar.MONTH) < calActual.get(Calendar.MONTH)) {
                    return false; // El mes ingresado es anterior al mes actual
                } else if (calIngresada.get(Calendar.MONTH) == calActual.get(Calendar.MONTH)) {
                    if (calIngresada.get(Calendar.DAY_OF_MONTH) < calActual.get(Calendar.DAY_OF_MONTH)) {
                        return false; // El día ingresado es anterior al día actual
                    }
                }
            }

            return true; // Todas las validaciones pasaron
        } catch (ParseException e) {
            return false;
        }
    }

}
