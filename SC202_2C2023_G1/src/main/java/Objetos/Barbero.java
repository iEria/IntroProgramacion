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

    private int id;
    private String Cedula;
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String HoraAlmuerzoInicio;
    private String HoraAlmuerzoFinal;
    private static int posicion = 0;

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

    public static void CrearBarbero(Barbero[] barbero) {
        if (posicion >= 5) {
            mostrarMensajeError();
            return;
        }
        boolean comenzar = true;
        String mensajeNombre = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el nombre del nuevo barbero </li>" + "</ul></div></body></html>";
        String mensajeApellidos = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese los apellidos del nuevo barbero </li>" + "</ul></div></body></html>";
        String mensajeCedula = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese la cedula del nuevo barbero </li>" + "</ul></div></body></html>";
        String mensajeTelefono = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>" + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>" + "<hr style='border-top: 2px solid #ccc;'>" + "<div style='display: flex; justify-content: center;'>" + "<ul style='list-style-type: none; padding: 0; text-align: left;'>" + "<li style='margin-bottom: 10px;'>Ingrese el telefono del nuevo barbero </li>" + "</ul></div></body></html>";

        String nombreBarbero = (String) JOptionPane.showInputDialog(null, mensajeNombre, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
        String nombreApellidos = (String) JOptionPane.showInputDialog(null, mensajeApellidos, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
        String cedulaBarbero = (String) JOptionPane.showInputDialog(null, mensajeCedula, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (cedulaBarbero.length() != 9) {
            JOptionPane.showMessageDialog(null, "No tiene los digitos suficientes.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String telefonoBarbero = (String) JOptionPane.showInputDialog(null, mensajeTelefono, "Menú Administracion Personal - Nuevo Barbero", JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (telefonoBarbero.length() != 8) {
            JOptionPane.showMessageDialog(null, "No tiene los digitos suficientes.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String[] options = {"8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM"};

        int indiceHoraInicio = JOptionPane.showOptionDialog(null, "Seleccione la hora inicio del almuerzo del Barbero", "Menú de opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        String horaAlmuerzoBarberoI = options[indiceHoraInicio];

        // Obtener las opciones para la hora final
        String[] opcionesHoraFinal = new String[options.length - indiceHoraInicio - 1];
        for (int i = indiceHoraInicio + 1; i < options.length; i++) {
            opcionesHoraFinal[i - indiceHoraInicio - 1] = options[i];
        }

        int indiceHoraFinal = JOptionPane.showOptionDialog(null, "Seleccione la hora final del almuerzo del Barbero", "Menú de opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesHoraFinal, opcionesHoraFinal[0]);

        String horaAlmuerzoBarberoF = opcionesHoraFinal[indiceHoraFinal];
        boolean campoInvalido = nombreBarbero.isEmpty() || nombreApellidos.isEmpty() || cedulaBarbero.isEmpty() || telefonoBarbero.isEmpty()
                || horaAlmuerzoBarberoI.isEmpty() || horaAlmuerzoBarberoF.isEmpty();
        while (comenzar) {
            if (!campoInvalido) {
                // Incrementar el ID para el próximo barbero
                int maxId = 0;
                for (int i = 0; i < posicion; i++) {
                    if (barbero[i] != null && barbero[i].getid() > maxId) {
                        maxId = barbero[i].getid();
                    }
                }
                int id = maxId + 1;

                // Crear el nuevo barbero con el ID actual y la información proporcionada
                Barbero nuevoBarbero = new Barbero();
                nuevoBarbero.setid(id);
                nuevoBarbero.setNombre(nombreBarbero);
                nuevoBarbero.setApellidos(nombreApellidos);
                nuevoBarbero.setCedula(cedulaBarbero);
                nuevoBarbero.setTelefono(telefonoBarbero);
                nuevoBarbero.setHoraAlmuerzoInicio(horaAlmuerzoBarberoI);
                nuevoBarbero.setHoraAlmuerzoFinal(horaAlmuerzoBarberoF);
                barbero[posicion] = nuevoBarbero;
                posicion = (posicion + 1);

                mostrarMensajeExito();
                mostrarMensajeDatosBarbero(nuevoBarbero);

                comenzar = false;
            } else {
                // Mostrar mensaje de error si al menos uno de los campos es nulo o está en blanco
                JOptionPane.showMessageDialog(null, "Error: Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                comenzar = false;
            }
        }
    }

    public static void mostrarBarberos(Barbero[] barberoArray) {
        String barberosInfo = "";
        for (int i = 0; i < barberoArray.length; i++) {
            Barbero barbero = barberoArray[i];
            if (barbero != null) {
                barberosInfo += "ID: " + barbero.getid() + "<br>";
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

    public static void eliminarBarbero(Barbero[] barberoArray, int id) {
        boolean IDEncontrado = false;

        for (int i = 0; i < barberoArray.length; i++) {
            if (barberoArray[i] != null) {
                if (barberoArray[i].getid() == id) {
                    barberoArray[i] = null;
                    IDEncontrado = true;
                    mostrarMensajeExitoEliminacion();
                    break;
                }
            }
        }

        if (!IDEncontrado) {
            JOptionPane.showMessageDialog(null, "Error: No se encontro el ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean hayBarberosAgregados(Barbero[] barberoArray) {
        for (Barbero barbero : barberoArray) {
            if (barbero != null) {
                return true;
            }
        }
        return false;
    }

}
