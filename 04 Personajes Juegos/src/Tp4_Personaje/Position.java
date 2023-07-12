package Tp4_Personaje;

public class Position {
    //Variables
        private int x;
        private int y;

    //Constructores
        Position (int x, int y){
            this.x = x;
            this.y = y;
        }

    //Getters & Setters
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

}
