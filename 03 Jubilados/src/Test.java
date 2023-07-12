
import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Registro registro = new Registro();
        
        //Creando objetos - Trabajador / Jubilado
            Trabajador trabajador = new Trabajador("Juan", "12345678", LocalDate.of(1993, 5, 31), "Av. Siempre Viva 123", 50000);
            Jubilado jubilado = new Jubilado("Pedro", "87654321", LocalDate.of(1950, 4, 1), "Calle Falsa 123", 30000);
        
        System.out.println("\t-- Datos del Trabajador: -- ");
            registro.procesarDatos(trabajador);
        System.out.println("\n\t-- Datos del Jubilado: -- ");
            registro.procesarDatos(jubilado);
    }
}
