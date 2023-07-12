package Clases;

import java.util.Objects;

public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int anio;
    
    //Constructores
        public Materia() {
            
        }

        public Materia( int idMateria, String nombreMateria, int anio ){
            this.idMateria = idMateria;
            this.nombreMateria = nombreMateria;
            this.anio = anio;
        }

    //Getters
        public int getIdMateria() {
            return idMateria;
        }
        
        public String getNombreMateria() {
            return nombreMateria;
        }
        
        public int getAnio() {
            return anio;
        }
        
    //Setters
        public void setIdMateria(int idMateria) {
            this.idMateria = idMateria;
        }

        public void setNombreMateria(String nombreMateria) {
            this.nombreMateria = nombreMateria;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        
     //Metodos Extras

        @Override
        public String toString() {
            return nombreMateria;
        }
        
    //Verificar que no existan objetos iguales
        @Override
        public int hashCode() {
            int hash = 7;
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
            final Materia other = (Materia) obj;
            if (this.idMateria != other.idMateria) {
                return false;
            }
            if (this.anio != other.anio) {
                return false;
            }
            if (!Objects.equals(this.nombreMateria, other.nombreMateria)) {
                return false;
            }
            return true;
        }
        
}