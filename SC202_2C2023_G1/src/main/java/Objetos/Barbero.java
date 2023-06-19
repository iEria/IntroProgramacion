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

    public int id;
    public String Cedula;
    public String Nombre;
    public String Apellidos;
    public String Telefono;
    public String HoraAlmuerzoInicio;
    public String HoraAlmuerzoFinal;

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

    public static void CrearBarbero(int id, String Cedula, String Nombre, String Apellidos, String Telefono, String HoraAlmuerzoInicio, String HoraAlmuerzoFinal) {

        Barbero nuevoBarbero = new Barbero();
        nuevoBarbero.setid(id);
        nuevoBarbero.setNombre(Nombre);
        nuevoBarbero.setApellidos(Apellidos);
        nuevoBarbero.setCedula(Cedula);
        nuevoBarbero.setTelefono(Telefono);
        nuevoBarbero.setHoraAlmuerzoInicio(HoraAlmuerzoInicio);
        nuevoBarbero.setHoraAlmuerzoFinal(HoraAlmuerzoFinal);

        String mensajeExito = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<h3 style='text-align: center; margin-top: 10px; color: #4CAF50;'>Registro exitoso</h3>"
                + "<p style='text-align: center; margin-top: 10px; color: #333;'>¡El nuevo barbero se ha registrado correctamente!</p>"
                + "<div style='display: flex; justify-content: center;'>"
                + "</div></div></div></body></html>";
        
        String mensajeError = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                            + "<h1 style='text-align: center; margin-top: 10px;'>Menú BarberShop</h1>"
                            + "<hr style='border-top: 2px solid #ccc;'>"
                            + "<div style='display: flex; justify-content: center;'>"
                            + "<div style='background-color: #f4e6e6; padding: 20px; border-radius: 5px;'>"
                            + "<h3 style='text-align: center; margin-top: 10px; color: #FF0000;'>Error en el registro</h3>"
                            + "<p style='text-align: center; margin-top: 10px; color: #333;'>No se pueden agregar más barberos en este momento.</p>"
                            + "<div style='display: flex; justify-content: center;'>"
                            + "</div></div></div></body></html>";

        String mensajeDatosBarbero = "<html><body style='width: 250px; font-family: Arial, sans-serif;'>"
                + "<h1 style='text-align: center; margin-top: 10px;'>Datos del Barbero</h1>"
                + "<hr style='border-top: 2px solid #ccc;'>"
                + "<div style='display: flex; justify-content: center;'>"
                + "<div style='background-color: #e6f4e6; padding: 20px; border-radius: 5px;'>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>ID:</strong> " + nuevoBarbero.getid() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Nombre:</strong> " + nuevoBarbero.getNombre() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Apellidos:</strong> " + nuevoBarbero.getApellidos() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Cédula:</strong> " + nuevoBarbero.getCedula() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Teléfono:</strong> " + nuevoBarbero.getTelefono() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Inicio Almuerzo:</strong> " + nuevoBarbero.getHoraAlmuerzoInicio() + "</p>"
                + "<p style='text-align: center; margin-top: 10px;'><strong>Horario Final Almuerzo:</strong> " + nuevoBarbero.getHoraAlmuerzoFinal() + "</p>"
                + "</div></div></body></html>";

        JOptionPane.showMessageDialog(null, mensajeExito);
        JOptionPane.showMessageDialog(null, mensajeDatosBarbero);

        int maximoBaberos = 6;
        String[] Barbero1 = {};
        String[] Barbero2 = {};
        String[] Barbero3 = {};
        String[] Barbero4 = {};
        String[] Barbero5 = {};

        if (1 < maximoBaberos) {
            if (Barbero1.length == 0) {
                String idString = String.valueOf(nuevoBarbero.getid());
                Barbero1[0] = idString;
                Barbero1[1] = nuevoBarbero.getNombre();
                Barbero1[2] = nuevoBarbero.getApellidos();
                Barbero1[3] = nuevoBarbero.getCedula();
                Barbero1[4] = nuevoBarbero.getTelefono();
                Barbero1[5] = nuevoBarbero.getHoraAlmuerzoInicio();
                Barbero1[6] = nuevoBarbero.getHoraAlmuerzoFinal();
                maximoBaberos--;
            }

            if (Barbero1.length == 1) {
                if (Barbero2.length == 0) {
                    String idString = String.valueOf(nuevoBarbero.getid());
                    Barbero2[0] = idString;
                    Barbero2[1] = nuevoBarbero.getNombre();
                    Barbero2[2] = nuevoBarbero.getApellidos();
                    Barbero2[3] = nuevoBarbero.getCedula();
                    Barbero2[4] = nuevoBarbero.getTelefono();
                    Barbero2[5] = nuevoBarbero.getHoraAlmuerzoInicio();
                    Barbero2[6] = nuevoBarbero.getHoraAlmuerzoFinal();
                    maximoBaberos--;
                }
            }

            if (Barbero1.length == 1) {
                if (Barbero2.length == 1) {
                    if (Barbero3.length == 0) {
                        String idString = String.valueOf(nuevoBarbero.getid());
                        Barbero3[0] = idString;
                        Barbero3[1] = nuevoBarbero.getNombre();
                        Barbero3[2] = nuevoBarbero.getApellidos();
                        Barbero3[3] = nuevoBarbero.getCedula();
                        Barbero3[4] = nuevoBarbero.getTelefono();
                        Barbero3[5] = nuevoBarbero.getHoraAlmuerzoInicio();
                        Barbero3[6] = nuevoBarbero.getHoraAlmuerzoFinal();
                        maximoBaberos--;
                    }
                }
            }

            if (Barbero1.length == 1) {
                if (Barbero2.length == 1) {
                    if (Barbero3.length == 1) {
                        if (Barbero4.length == 0) {
                            String idString = String.valueOf(nuevoBarbero.getid());
                            Barbero4[0] = idString;
                            Barbero4[1] = nuevoBarbero.getNombre();
                            Barbero4[2] = nuevoBarbero.getApellidos();
                            Barbero4[3] = nuevoBarbero.getCedula();
                            Barbero4[4] = nuevoBarbero.getTelefono();
                            Barbero4[5] = nuevoBarbero.getHoraAlmuerzoInicio();
                            Barbero4[6] = nuevoBarbero.getHoraAlmuerzoFinal();
                            maximoBaberos--;
                        }
                    }
                }
            }

            if (Barbero1.length == 1) {
                if (Barbero2.length == 1) {
                    if (Barbero3.length == 1) {
                        if (Barbero4.length == 1) {
                            if (Barbero5.length == 0) {
                                String idString = String.valueOf(nuevoBarbero.getid());
                                Barbero5[0] = idString;
                                Barbero5[1] = nuevoBarbero.getNombre();
                                Barbero5[2] = nuevoBarbero.getApellidos();
                                Barbero5[3] = nuevoBarbero.getCedula();
                                Barbero5[4] = nuevoBarbero.getTelefono();
                                Barbero5[5] = nuevoBarbero.getHoraAlmuerzoInicio();
                                Barbero5[6] = nuevoBarbero.getHoraAlmuerzoFinal();
                                maximoBaberos--;
                            }
                        }
                    }
                }

            }
        }else
        {
            JOptionPane.showMessageDialog(null, mensajeError);
        }

    }

}
