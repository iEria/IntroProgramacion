/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sc202_2c2023_g1;

import javax.swing.JOptionPane;

/**
 *
 * @author eria
 */
public class SC202_2C2023_G1 {

    public static void main(String[] args) {
        boolean repetir = true;
        while(repetir == true){
            String opcion = JOptionPane.showInputDialog("---Menu Parqueo---\n"
                                                    + "1.Opcion #1     \n"
                                                    + "2.Opcion #2     \n"
                                                    + "3.Opcion #3     \n");
        if (ValidacionNumero(opcion) == true){
            switch (opcion) { 
                case "1":
                    JOptionPane.showMessageDialog(null,"Opcion #1");
                    repetir = false;
                break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Opcion #2");
                    repetir = false;
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"Opcion #3");
                    repetir = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"No es una opcion, reintente");
                    repetir = true;
    
                }
            }else{
                JOptionPane.showMessageDialog(null,"No es numero , reintente");
                repetir = true;
            }
        }
        
    }
    
    public static boolean ValidacionNumero(String opcion)
    {
        try{
            Integer.parseInt(opcion);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    
}
