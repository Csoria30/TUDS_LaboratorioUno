/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class PruebaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Arreglo num = new Arreglo();
        Scanner leer = new Scanner(System.in);
        //punto a
        int [] puntoA = {10,2,28,6,4};
        num.sumarLista(puntoA);
        
        // punto b
        int [][] puntoB = {{100,200,280,6,40}, {1,300}};
        System.out.println("El numero mayor es: " + Arreglo.buscarMayor(puntoB));
         
        // punto c        
        System.out.println("Ingrese la frase que desee contar sus vocales");
        System.out.println("Hay : " + num.cuentaVocales(leer.nextLine()) + " vocales");
        
        // punto d
        System.out.println("Ingrese la frase que desee contar sus vocale y la vocal a buscar");
        System.out.println("La vocal buscada se repite: " + num.cuentaCaracter(leer.nextLine(), leer.next().charAt(0)) 
                + " veces");
        
        
        
        
    }
    
}
