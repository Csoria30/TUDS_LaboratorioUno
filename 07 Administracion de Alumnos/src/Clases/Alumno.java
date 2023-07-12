package Clases;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    private HashSet <Materia> hashMaterias = new HashSet<>();
    
    
     //Constructores
        public Alumno(){
            
        }

        public Alumno(int legajo, String apellido, String nombre) {
            this.legajo = legajo;
            this.nombre = nombre;
            this.apellido = apellido;
        }
    
    //Getters
        public int getLegajo() {
            return legajo;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public String getApellido() {
            return apellido;
        }
        
    //Setters
        public void setLegajo(int legajo) {
            this.legajo = legajo;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
    //Metodos
        //Inscribir a materia
        public void agregarMateria ( Materia materia ){
            if(hashMaterias.add(materia) == true){
                JOptionPane.showMessageDialog(null, "Alumno inscripto correctamente.");
            }else{
                JOptionPane.showMessageDialog(null, "El Alumno ya se encuentra inscripto.");
            }
        }
        
        public int cantidadMaterias(){
            return hashMaterias.size();
        }

        @Override
        public String toString() {
            return apellido + " " + nombre;
        }

    //Verificando objetos unicos
        @Override
        public int hashCode() {
            int hash = 7;
            hash = 97 * hash + this.legajo;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Alumno other = (Alumno) obj;
            
            if (this.legajo != other.legajo) {
                return false;
            }
            return true;
        }
        
}
