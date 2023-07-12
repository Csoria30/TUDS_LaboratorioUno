public class Registro {
    
    public Persona procesarDatos(Persona persona) {
        
        if(persona instanceof Trabajador){
            System.out.println("Nombre: " + persona.getNombre() + "."); 
            persona.calcularEdad();
            persona.cobrar();
        }
        
        if(persona instanceof Jubilado){
            persona.calcularDiasVividos(persona.getFechaNacimiento());
            persona.cobrar();
        }

        return null;
    }
}
