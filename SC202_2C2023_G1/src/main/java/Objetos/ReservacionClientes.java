/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author eria
 */
public class ReservacionClientes {
    public int id;
    public String CedulaCliente;
    public String NombreCliente;
    public String ApellidosCliente;
    public String TelefonoCliente;
    public int HoraInicio;
    public int HoraFinal;
    public String DiaCita; /*Hay que buscar porque deberia ser de tipo date o algo similar*/
    
    
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
    public void setHoraInicio(int HoraInicio) {
        this.HoraInicio = HoraInicio;
    }
    
    public int getHoraInicio() {
        return HoraInicio;
    }
    
    /*Get and Set del atributo HoraFinal*/
    public void setHoraFinal(int HoraFinal) {
        this.HoraFinal = HoraFinal;
    }
    
    public int getHoraFinal() {
        return HoraFinal;
    }
    
    /*Get and Set del atributo DiaCita*/
    public void setDiaCita(String DiaCita) {
        this.DiaCita = DiaCita;
    }
    
    public String getDiaCita() {
        return DiaCita;
    }
    
}
