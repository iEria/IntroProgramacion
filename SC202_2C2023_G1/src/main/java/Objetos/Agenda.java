/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author eria
 */
public class Agenda {
    private int id;
    private int idCliente;
    private int idBarbero;
    private int Corte;
    
    /*Get and Set del atributo Corte*/
    public int getCorte() {
        return Corte;
    }

    public void setCorte(int Corte) {
        this.Corte = Corte;
    }
    
    /*Get and Set del atributo ID*/
    public void setid(int id) {
        this.id = id;
    }
    
    public int getid() {
        return id;
    }
    
    
    /*Get and Set del atributo idCliente*/
    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public int getidCliente() {
        return idCliente;
    }
    
    /*Get and Set del atributo idBarbero*/
    public void setidBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }
    
    public int getidBarbero() {
        return idBarbero;
    }
    public static boolean mostrarAgendaBarbero(ReservacionClientes[] ReservacionClientesArray, String diaCita, Barbero[] barberoArray, int IdBarberoRecibido) {
        String reservacionClientesInfo = "";
        boolean reservacionesEncontradas = false;
        double preciototal = 0 ;
        
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
                            preciototal += PrecioCorte(diaCita);
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
                    + "<p style='text-align: left; margin-top: 10px;'>"
                    + "El precio total es de " + preciototal
                    + "</p>"
                    + "</div></div></body></html>";

            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No hay citas para el día ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
    
   public static int PrecioCorte(String DiaCita) {
        // Convertir la cadena de fecha a un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCita = LocalDate.parse(DiaCita, formatter);
        
        // Obtener el día de la semana de la fecha de la cita
        DayOfWeek diaSemana = fechaCita.getDayOfWeek();
        
        // Definir los precios para fin de semana y entre semana
        int costoCorteFinDeSemana = 3000;
        int costoCorteEntreSemana = 2500;
        
        // Determinar el precio basado en el día de la semana
        int precioCorte;
        if (diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY) {
            precioCorte = costoCorteFinDeSemana;
        } else {
            precioCorte = costoCorteEntreSemana;
        }
        
        // Agregar el 13% de IVA al precio
        double iva = precioCorte * 0.13;
        precioCorte += (int) iva; // Convertir el resultado a entero
        
        return precioCorte;
    }
}
