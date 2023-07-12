package Modelo;

public class Inscripcion {
    private int id_inscripto;
    private Double nota;
    private Alumno alumno;
    private Materia materia;

    //Constructores
        public Inscripcion(int id_inscripto, double nota, Alumno alumno, Materia materia) {
            this.id_inscripto = id_inscripto;
            this.nota = nota;
            this.alumno = alumno;
            this.materia = materia;
        }

        public Inscripcion(double nota, Alumno alumno, Materia materia) {
            this.nota = nota;
            this.alumno = alumno;
            this.materia = materia;
        }

        public Inscripcion(Alumno alumno, Materia materia) { 
            this.alumno = alumno;
            this.materia = materia;
        }
        
        public Inscripcion() {
        }

    //Setters
        public void setId_inscripto(int id_inscripto) {
            this.id_inscripto = id_inscripto;
        }
        
        public void setNota(Double nota) {
            this.nota = nota;
        }
        
        public void setAlumno(Alumno alumno) {
            this.alumno = alumno;
        }
        
        public void setMateria(Materia materia) {
            this.materia = materia;
        }
        
    //Getters
        public int getId_inscripto() {
            return id_inscripto;
        }

        public Double getNota() {
            return nota;
        }

        public Alumno getAlumno() {
            return alumno;
        }

        public Materia getMateria() {
            return materia;
        }

    @Override
    public String toString() {
        return "Inscripcion{" + "id_inscripto=" + id_inscripto + ", nota=" + nota + ", alumno=" + alumno + ", materia=" + materia + '}';
    }
 
        
        
        
        
}
