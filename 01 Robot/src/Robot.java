
import java.util.Scanner;

public class Robot {
    Scanner leer = new Scanner (System.in);
    private double altura;
    private Bateria bateria;
    private boolean estado;

  
        public Robot() {
        }

        public Robot(double altura, Bateria bateria, boolean estado) {
            this.altura = altura;
            this.bateria = new Bateria();
            this.estado = estado;
        }
        
        public boolean dormir(){
            return estado;
        }
        
        public boolean despertar(){
            return !estado;
        }
        
        public void setEstado (boolean estado){
            this.estado = estado;
        }
        

        public void avanzar(int pasos){
            int nPasos = pasos;
            double energiaNecesaria;
                    
            energiaNecesaria = (nPasos * 0.1);
            
            if (bateria.getBateria() >= energiaNecesaria){
                bateria.setBateria(bateria.getBateria()-energiaNecesaria);
                System.out.println("Se logro avanzar " + nPasos + " de pasos.");
                bateriaActual();
            }else{
                System.out.println("Energia insuficiente para avanzar la cantidad de pasos");
            }
        }
        
        public void retroceder(int pasos){
            int nPasos = pasos;
            double energiaNecesaria;
                    
            energiaNecesaria = (nPasos * 0.1);
            
            if (bateria.getBateria() >= energiaNecesaria){
                bateria.setBateria(bateria.getBateria()-energiaNecesaria);
                System.out.println("Se logro retroceder " + nPasos + " de pasos.");
                bateriaActual();
            }else{
                System.out.println("Energia insuficiente para retroceder la cantidad de pasos");
            }
        }
        
        public void recargar(){
            bateria.setBateria(1000);
            System.out.println("Se cargo la bateria");
            bateriaActual();
        }
        
        public boolean bateriaLlena(){
             if (bateria.getBateria() == 1000){
                System.out.println("\nLa bateria esta llena");
             }else{
                 estado = false;
                System.out.println("\nLa bateria no se encuentra vacia, pero no esta al 100%");
             }
            return estado;
        }
        public boolean bateriaVacia(){

             if (bateria.getBateria() == 0){
                 estado = false;
                System.out.println("La bateria esta vacia");
             }else{
                System.out.println("La bateria aun tiene carga");
                bateriaActual();
             }
             return estado;
        }
        
        public void bateriaActual(){
            double porcentaje = (bateria.getBateria()*100) / 1000;
            System.out.println(
                    "\nEnergia actual: " + porcentaje + " %"
            );
        }
}
