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
public class instrumentoViento implements InstrumentoMusical {

    public instrumentoViento() {
    }
    
    
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento...");
    }
    
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento...");
    }

    @Override
    public String tipoInstrumento() {
        return "instrumento de viento";
    }
    
    @Override
    public String toString() {
        return "instrumentoViento{" + '}';
    }
    
    
    
}
