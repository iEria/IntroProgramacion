/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class ReservacionClientes {

    public int id;
    public String NombreCliente;
    public String CedulaCliente;
    public String ApellidosCliente;
    public String TelefonoCliente;
    public String HoraInicio;
    public String HoraFinal;
    public String DiaCita;
    /*Hay que buscar porque deberia ser de tipo date o algo similar*/
    public static int posicion = 0;
    public static ReservacionClientes[] ReservacionClientesArray = new ReservacionClientes[6];

    /*Get and Set del atributo ID*/
    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
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

    public static void CrearReservacionClientes(int id, String NombreCliente, String CedulaCliente, String ApellidosCliente, String TelefonoCliente, String HoraInicio, String HoraFinal, String DiaCita) {

        ReservacionClientes nuevoReservacionClientes = new ReservacionClientes();
        nuevoReservacionClientes.setid(id);
        nuevoReservacionClientes.setNombreCliente(NombreCliente);
        nuevoReservacionClientes.setCedulaCliente(CedulaCliente);
        nuevoReservacionClientes.setApellidosCliente(ApellidosCliente);
        nuevoReservacionClientes.setTelefonoCliente(TelefonoCliente);
        nuevoReservacionClientes.setHoraInicio(HoraInicio);
        nuevoReservacionClientes.setHoraFinal(HoraFinal);
        nuevoReservacionClientes.setDiaCita(DiaCita);

        ReservacionClientesArray[posicion] = nuevoReservacionClientes;
        posicion = (posicion + 1);

        mostrarMensajeExito();
        mostrarMensajeDatosReservacionClientes(nuevoReservacionClientes);

    }
    
      public static void mostrarReservacionClientes() {
        String reservacionclientesInfo = "";
        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            ReservacionClientes reservacionclientes = ReservacionClientesArray[i];
            if (reservacionclientes != null) {
                reservacionclientesInfo += "Nombre: " + reservacionclientes.getNombreCliente() + "<br>";
                reservacionclientesInfo += "Apellidos: " + reservacionclientes.getCedulaCliente() + "<br>";
                reservacionclientesInfo += "Cédula: " + reservacionclientes.getApellidosCliente() + "<br>";
                reservacionclientesInfo += "Teléfono: " + reservacionclientes.getTelefonoCliente() + "<br>";
                reservacionclientesInfo += "Horario Inicio Almuerzo: " + reservacionclientes.getHoraInicio() + "<br>";
                reservacionclientesInfo += "Horario Final Almuerzo: " + reservacionclientes.getHoraFinal() + "<br>";
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
      public static void eliminarReservacion(String cedula) {
        boolean cedulaEncontrada = false;

        for (int i = 0; i < ReservacionClientesArray.length; i++) {
            if (ReservacionClientesArray[i] != null && ReservacionClientesArray[i].getCedulaCliente().equals(cedula)) {
                ReservacionClientesArray[i] = null;
                cedulaEncontrada = true;
                mostrarMensajeExitoEliminacion();
                break;
            }
        }

        if (!cedulaEncontrada) {
            JOptionPane.showMessageDialog(null, "Error: No se encontro la cedula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
      
      
      public static boolean hayClientesAgregados() {
        for (ReservacionClientes reservacionclientes : ReservacionClientesArray) {
            if (reservacionclientes != null) {
                return true;
            }
        }
        return false;
    }
}
