/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import javax.swing.JOptionPane;

/**
 *
 * @author eria
 */
public class Barbero {

    public static boolean hayClientesAgregados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int id;
    public String Cedula;
    public String Nombre;
    public String Apellidos;
    public String Telefono;
    public String HoraAlmuerzoInicio;
    public String HoraAlmuerzoFinal;
    public static int posicion = 0;
    public static Barbero[] barberoArray = new Barbero[6];

    public String getHoraAlmuerzoInicio() {
        return HoraAlmuerzoInicio;
    }

    public void setHoraAlmuerzoInicio(String HoraAlmuerzoInicio) {
        this.HoraAlmuerzoInicio = HoraAlmuerzoInicio;
    }

    public String getHoraAlmuerzoFinal() {
        return HoraAlmuerzoFinal;
    }

    public void setHoraAlmuerzoFinal(String HoraAlmuerzoFinal) {
        this.HoraAlmuerzoFinal = HoraAlmuerzoFinal;
    }

    /*Get and Set del atributo ID*/
    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    /*Get and Set del atributo Cedula*/
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedula() {
        return Cedula;
    }

    /*Get and Set del atributo Nombre*/
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    /*Get and Set del atributo Apellidos*/
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getApellidos() {
        return Apellidos;
    }

    /*Get and Set del atributo Telefono*/
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTelefono() {
        return Telefono;
    }

    private static void mostrarMensajeExito() {
        String mensajeExito = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #4CAF50;'>Registro exitoso</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>¡El nuevo barbero se ha registrado correctamente!</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeExito);
    }

    private static void mostrarMensajeError() {
        String mensajeError = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #f4e6e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #FF0000;'>Error en el registro</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>No se pueden agregar más barberos en este momento.</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeError);
    }

    private static void mostrarMensajeExitoEliminacion() {
        String mensajeExitoEliminacion = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #4CAF50;'>Eliminación exitosa</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>¡El barbero se ha eliminado correctamente!</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeExitoEliminacion);
    }

    private static void mostrarMensajeDatosBarbero(Barbero barbero) {
        String mensajeDatosBarbero = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Datos del Barbero</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>ID:</strong> " + barbero.getid() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Nombre:</strong> " + barbero.getNombre() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Apellidos:</strong> " + barbero.getApellidos() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Cédula:</strong> " + barbero.getCedula() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Teléfono:</strong> " + barbero.getTelefono() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Inicio Almuerzo:</strong> " + barbero.getHoraAlmuerzoInicio() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Final Almuerzo:</strong> " + barbero.getHoraAlmuerzoFinal() + "</p>"
                + "</div></div></body></html>";
        JOptionPane.showMessageDialog(null, mensajeDatosBarbero);
    }

    public static void CrearBarbero(int id, String cedula, String nombre, String apellidos, String telefono, String horaAlmuerzoInicio, String horaAlmuerzoFinal) {
        if (posicion >= 5) {
            mostrarMensajeError();
            return;
        }
        Barbero nuevoBarbero = new Barbero();
        nuevoBarbero.setid(id);
        nuevoBarbero.setNombre(nombre);
        nuevoBarbero.setApellidos(apellidos);
        nuevoBarbero.setCedula(cedula);
        nuevoBarbero.setTelefono(telefono);
        nuevoBarbero.setHoraAlmuerzoInicio(horaAlmuerzoInicio);
        nuevoBarbero.setHoraAlmuerzoFinal(horaAlmuerzoFinal);

        barberoArray[posicion] = nuevoBarbero;
        posicion = (posicion + 1);

        mostrarMensajeExito();
        mostrarMensajeDatosBarbero(nuevoBarbero);

    }

    public static void mostrarBarberos() {
        String barberosInfo = "";
        for (int i = 0; i < barberoArray.length; i++) {
            Barbero barbero = barberoArray[i];
            if (barbero != null) {
                barberosInfo += "Nombre: " + barbero.getNombre() + "<br>";
                barberosInfo += "Apellidos: " + barbero.getApellidos() + "<br>";
                barberosInfo += "Cédula: " + barbero.getCedula() + "<br>";
                barberosInfo += "Teléfono: " + barbero.getTelefono() + "<br>";
                barberosInfo += "Horario Inicio Almuerzo: " + barbero.getHoraAlmuerzoInicio() + "<br>";
                barberosInfo += "Horario Final Almuerzo: " + barbero.getHoraAlmuerzoFinal() + "<br>";
                barberosInfo += "------------------<br>";
            }
        }

        String mensaje = "<html><body style='width: 300px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<p style='text-align: left; margin-top: 10px;'>"
                + barberosInfo
                + "</p>"
                + "</div></div></body></html>";

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static void eliminarBarbero(String cedula) {
        boolean cedulaEncontrada = false;

        for (int i = 0; i < barberoArray.length; i++) {
            if (barberoArray[i] != null && barberoArray[i].getCedula().equals(cedula)) {
                barberoArray[i] = null;
                cedulaEncontrada = true;
                mostrarMensajeExitoEliminacion();
                break;
            }
        }

        if (!cedulaEncontrada) {
            JOptionPane.showMessageDialog(null, "Error: No se encontro la cedula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualizarBarbero(int id, String cedula, String nombre, String apellidos, String telefono, String horaAlmuerzoInicio, String horaAlmuerzoFinal ,String cedulavieja) {
        boolean cedulaEncontrada = false;

        for (int i = 0; i < barberoArray.length; i++) {
            if (barberoArray[i] != null && barberoArray[i].getCedula().equals(cedulavieja)) {
                Barbero nuevoBarbero = new Barbero();
                int idvieja = barberoArray[i].getid();
                nuevoBarbero.setid(idvieja);
                nuevoBarbero.setNombre(nombre);
                nuevoBarbero.setApellidos(apellidos);
                nuevoBarbero.setCedula(cedula);
                nuevoBarbero.setTelefono(telefono);
                nuevoBarbero.setHoraAlmuerzoInicio(horaAlmuerzoInicio);
                nuevoBarbero.setHoraAlmuerzoFinal(horaAlmuerzoFinal);
                
                
                cedulaEncontrada = true;
                barberoArray[i] =nuevoBarbero ;
                break;
            }
        }

        if (!cedulaEncontrada) {
            JOptionPane.showMessageDialog(null, "Error: No se encontro la cedula.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean hayBarberosAgregados() {
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                return true;
            }
        }
        return false;
    }

}
