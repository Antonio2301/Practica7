/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Lenovo
 */
public class MPOOP7 {
    
    public static void main (String[] args){
        System.out.println("******************************************");
        
        Poligono poligono = new Poligono();
        System.out.println(poligono);
        
        Object objeto = new Object();
        System.out.println("Objeto "+objeto);
        
        objeto = poligono;
        System.out.println("Objeto como Poligono "+objeto);
        
        objeto = new Poligono();
        System.out.println("Objeto como Poligono "+objeto);
        
        System.out.println("2******************************************");
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligono(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligono(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligono(poligono);
        
        
    }
    
    public static void selectorPoligono(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if (poligono instanceof Poligono){
           System.out.println("El objeto es un Poligono");
        }else {
             System.out.println("El objeto es otra figura");
        }   
    }
    
}
