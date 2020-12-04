/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Lenovo
 */
public class MPOOP73 {
    public static void main (String[] args){
        
        InstrumentoMusical instrumento;
        instrumento = new instrumentoViento();
        instrumento.afinar();
        System.out.println(instrumento);
        
        instrumento = new Flauta();
        instrumento.afinar();
        System.out.println(instrumento);
         
    }
    
}
