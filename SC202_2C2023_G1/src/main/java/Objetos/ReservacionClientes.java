/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
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
    /*Hay que buscar porque deberia ser de tipo date o algo similar*/
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

    private static void mostrarMensajeDatosReservacionClientes(ReservacionClientes reservacionclientes) {
        String mensajeDatosReservacionClientes = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Datos del Barbero</h1>"
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
                + "</div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeDatosReservacionClientes);
    }

    public static void CrearReservacionClientes(ReservacionClientes[] ReservacionClientesArray) {
        int IDReservacionClientes = 0;
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
            String TelefonoCliente = (String) JOptionPane.showInputDialog(null, mensajeTelefonoCliente, "Menú Reservación de espacios - Agregar Reservacion", JOptionPane.PLAIN_MESSAGE, null, null, null);
            //Estaba intntando hacer como las horas pero que sean con el array de barberos que hay


            MostrarCalendario();
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

            String[] options = {"8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 MD", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM"};

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
                    if ( ReservacionClientesArray[i] != null &&  ReservacionClientesArray[i].getid() > maxId) {
                        maxId =  ReservacionClientesArray[i].getid();
                    }
                }
                int id = maxId + 1;
                ReservacionClientes nuevoReservacionClientes = new ReservacionClientes();
                nuevoReservacionClientes.setid(id);
                nuevoReservacionClientes.setNombreCliente(NombreCliente);
                nuevoReservacionClientes.setCedulaCliente(CedulaCliente);
                nuevoReservacionClientes.setApellidosCliente(ApellidosCliente);
                nuevoReservacionClientes.setTelefonoCliente(TelefonoCliente);
                nuevoReservacionClientes.setHoraInicio(horaInicioSeleccionada);
                nuevoReservacionClientes.setHoraFinal(horaFinalSeleccionada);
                nuevoReservacionClientes.setDiaCita(DiaCita);

                ReservacionClientesArray[posicion] = nuevoReservacionClientes;
                posicion = (posicion + 1);

                mostrarMensajeExito();
                mostrarMensajeDatosReservacionClientes(nuevoReservacionClientes);

                comenzar = false;
            } else {
                // Mostrar mensaje de error si al menos uno de los campos es nulo o está en blanco
                JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                comenzar = false;
            }
        }

    }

    public static void mostrarReservacionClientes(ReservacionClientes[] ReservacionClientesArray) {
        String reservacionclientesInfo = "";
        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionclientes = ReservacionClientesArray[i];
            if (reservacionclientes != null) {
                reservacionclientesInfo += "ID: " + reservacionclientes.getid() + "<br>";
                reservacionclientesInfo += "Nombre: " + reservacionclientes.getNombreCliente() + "<br>";
                reservacionclientesInfo += "Apellidos: " + reservacionclientes.getCedulaCliente() + "<br>";
                reservacionclientesInfo += "Cédula: " + reservacionclientes.getApellidosCliente() + "<br>";
                reservacionclientesInfo += "Teléfono: " + reservacionclientes.getTelefonoCliente() + "<br>";
                reservacionclientesInfo += "Horario Inicio Cita: " + reservacionclientes.getHoraInicio() + "<br>";
                reservacionclientesInfo += "Horario Final Cita: " + reservacionclientes.getHoraFinal() + "<br>";
                reservacionclientesInfo += "Dia de la cita: " + reservacionclientes.getDiaCita() + "<br>";
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

    public static boolean mostrarReservacionClientesPorDia(ReservacionClientes[] ReservacionClientesArray, String diaCita) {
        String reservacionClientesInfo = "";
        boolean reservacionesEncontradas = false;

        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionClientes = ReservacionClientesArray[i];
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
                reservacionClientesInfo += "------------------<br>";
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

    public static void MostrarCalendario() {

        // Solicitar mes y año al usuario
        int monthNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes (1-12):"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

        // Crear objeto YearMonth y LocalDate
        YearMonth yearMonth = YearMonth.of(year, monthNumber);
        LocalDate startDate = yearMonth.atDay(1);
        int daysInMonth = yearMonth.lengthOfMonth();
        DayOfWeek firstDayOfWeek = startDate.getDayOfWeek();
        int offset = firstDayOfWeek.getValue() % 7; // Ajuste para comenzar en domingo (1)

        // Crear el contenido HTML del calendario
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<html><body style='font-family: Arial, sans-serif;'>");
        htmlContent.append("<h1 style='text-align: center;'>Calendario para ").append(yearMonth.getMonth()).append(" ").append(year).append("</h1>");
        htmlContent.append("<p style='text-align: center;'>Seleccione un dia del mes que desea para su cita<p/>");
        htmlContent.append("<table style='border-collapse: collapse;'>");
        htmlContent.append("<tr><th>DOM</th><th>LUN</th><th>MAR</th><th>MIE</th><th>JUE</th><th>VIE</th><th>SAB</th></tr>");

        // Espacios en blanco hasta el primer día de la semana
        htmlContent.append("<tr>");
        for (int i = 0; i < offset; i++) {
            htmlContent.append("<td style='padding: 8px; border: 1px solid #ccc;'></td>");
        }

        // Días del mes
        for (int day = 1; day <= daysInMonth; day++) {
            htmlContent.append("<td style='padding: 8px; border: 1px solid #ccc;'>").append(day).append("</td>");

            if (startDate.getDayOfWeek().getValue() % 7 == 6) { // Sábado (6)
                htmlContent.append("</tr><tr>");
            }

            startDate = startDate.plusDays(1);
        }

        // Salto de línea final si el último día del mes no es sábado
        if (startDate.getDayOfWeek().getValue() % 7 != 0) { // Domingo (0)
            htmlContent.append("<td style='padding: 8px; border: 1px solid #ccc;' colspan='").append(7 - startDate.getDayOfWeek().getValue()).append("'></td>");
        }

        htmlContent.append("</tr></table></body></html>");

        // Mostrar el calendario utilizando JOptionPane
        JOptionPane.showMessageDialog(null, htmlContent.toString(), "Calendario", JOptionPane.INFORMATION_MESSAGE);


    }

    public static boolean validarFecha(String fecha, String formato) {
        SimpleDateFormat diaformato = new SimpleDateFormat(formato);
        diaformato.setLenient(false); // Desactiva la interpretación flexible de la fecha

        try {
            Date date = diaformato.parse(fecha);

            // Obtener la fecha actual
            Calendar cal = Calendar.getInstance();
            int mesActual = cal.get(Calendar.MONTH);

            // Obtener el mes de la fecha ingresada
            cal.setTime(date);
            int mesIngresado = cal.get(Calendar.MONTH);

            // Validar si el mes ingresado es posterior o igual al mes actual
            return mesIngresado >= mesActual;
        } catch (ParseException e) {
            return false;
        }
    }
}
