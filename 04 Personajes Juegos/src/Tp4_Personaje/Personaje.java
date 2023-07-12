package Tp4_Personaje;

public abstract class Personaje {
    //Variables
        protected Position ubicacion;
        protected String nick;
        protected int vidas;
        protected int energia;
        protected char orientacion;

    //Constructor
        public Personaje(Position ubicacion, String nick, int vidas, int energia, char orientacion){
            this.ubicacion = ubicacion;
            this.nick = nick;
            this.vidas = vidas;
            this.energia = energia;
            this.orientacion = orientacion;
        }

    //Setters & Getters
        public char getOrientacion() {
            return orientacion;
        }

        public int getEnergia() {
            return energia;
        }

        public int getVidas() {
            return vidas;
        }

        public Position getUbicacion() {
            return ubicacion;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }
        
    //Metodos Extras
        public void disparar(){
            if(energia >= 10){
               energia -= 10;
               System.out.println("Disparo ----");
            }else{
                System.out.println("No tienes la energia suficiente para disparar");
            }
        }
        
        public void girar() {
            char opcion = orientacion;

            switch ( opcion ) {
                case 'N':
                    System.out.println("Ahora usted esta mirando al Este.");
                    orientacion = 'E';
                    break;
                case 'E':
                    System.out.println("Ahora usted esta mirando al Sur.");
                    orientacion = 'S';
                    break;
                case 'S':
                    System.out.println("Ahora usted esta mirando al Oeste.");
                    orientacion = 'O';
                    break;
                case 'O':
                    System.out.println("Ahora usted esta mirando al Norte.");
                    orientacion = 'N';
                    break;
            }
        }
        
        public void avanzar(){
            if(orientacion == 'N') { ubicacion.setY( ubicacion.getY() - 1 ); }
            if(orientacion == 'S') { ubicacion.setY( ubicacion.getY() + 1 ); }
            if(orientacion == 'O') { ubicacion.setX( ubicacion.getX() - 1 ); }
            if(orientacion == 'E') { ubicacion.setX( ubicacion.getX() + 1 ); }
        }
}
