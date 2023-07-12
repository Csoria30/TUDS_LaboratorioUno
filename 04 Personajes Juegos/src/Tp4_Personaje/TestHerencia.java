package Tp4_Personaje;

import java.util.Scanner;


public class TestHerencia {
    public static void main(String[] args) {
        
        //Constantes
            final int PASOS_AVANZAR = 5;
            final int DISPAROS = 8;
            final int ENERGIA = 100;
            final int VIDAS = 3;
            final int POSICION_X = 100;
            final int POSICION_Y = 200;
            final char ORIENTACION = 'N';
            final boolean TIENE_CABALLO  = true;
            
        Scanner leer = new Scanner(System.in);
        Position posicion = new Position ( POSICION_X , POSICION_Y );
        Guerrero Thor = new Guerrero ( posicion , "Thor", VIDAS, ENERGIA, ORIENTACION, TIENE_CABALLO );
            
        boolean opcion = false;
        
        //Girar
        System.out.println("\n\tEjecutando Girar hasta que mire al Oeste.");
        do{ 
            if(Thor.getOrientacion() != 'O'){
                Thor.girar();
            }else{
                opcion = true;
            }
            
        }while(!opcion);
        
        //Avanzar
        System.out.println("\n\tEjecutando Avanzar - 5 pasos.");
        for (int i = 0; i < PASOS_AVANZAR; i++) {
            Thor.avanzar();
            System.out.println("\nDespues de paso " + (i+1));
            System.out.println("Posicion X: " + Thor.getUbicacion().getX());
            System.out.println("Posicion Y: " + Thor.getUbicacion().getY());
        }
        
        System.out.println("\n\tEjecutando Disparar - 8 veces.");
        //Disparar
        for (int i = 0; i < DISPAROS; i++) {
            System.out.println("\nRealizando disparo: " + (i+1));
            Thor.disparar();
            System.out.println("Energia restante: " + Thor.getEnergia());
        }
        
        //Respuestas
        System.out.println("\n\tRespuestas");
        System.out.println("1 - Thor empieza con " + ENERGIA + " de energia y termina con " + Thor.getEnergia() + ".");
        System.out.println(
                "2 - Thor empieza en la ubicacion\n" + 
                "posicion X: " + POSICION_X +
                "\nposicion Y: " + POSICION_Y +
                "\n\nLa nueva ubicacion es\n" +
                "posicion X: " + Thor.getUbicacion().getX() +
                "\nposicion Y: " + Thor.getUbicacion().getY()
        );
    }
    

}
