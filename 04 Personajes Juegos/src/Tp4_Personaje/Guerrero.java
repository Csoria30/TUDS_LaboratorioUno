package Tp4_Personaje;

import java.util.Scanner;

public final class Guerrero extends Personaje {
    //Variables
        Scanner leer = new Scanner(System.in);
        private boolean caballo;

    //Constructores
        public Guerrero (Position ubicacion, String nick,int vidas, int energia, char orientacion, boolean caballo) {
            super(ubicacion, nick, vidas, energia, orientacion);
            this.caballo = caballo;
        }
        
    //Getters
        public boolean getCaballo() {
           return caballo;
        }

    //Metodos Extras
        @Override
        public void avanzar() {
            if(caballo == true){
                for (int i = 0 ; i < 10 ; i++){
                    super.avanzar();
                }
            }else{
                super.avanzar();
            }
        }

        @Override
        public void disparar() {
            if(super.energia <= 30 && caballo == true){
                caballo = false;
                System.out.println("Thor perdio el caballo");
            }
                super.disparar();
        }
    
}