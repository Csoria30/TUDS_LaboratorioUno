import java.util.ArrayList;
import java.util.Scanner;

public class TestJuego {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Creando robot
        Bateria bateria = null;
      double alturaLocal = validarDouble("Ingrese la altura del robot: ");
        Robot robot = new Robot(alturaLocal, bateria, true);
        ArrayList<Hombre> hombres = new ArrayList();
        //Creando a persona 
        System.out.println("Ingrese la cantidad de jugadores");
        int CantidadPersonas = validarEntero();
      
         Hombre hombre1 = null;
         String namePersona1 = "";
       for (int i = 0; i < CantidadPersonas; i++) {
            System.out.print("Ingrese el nombre " + (i+1) + " :");
            String nombre = leer.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = leer.next();
            hombre1 = new Hombre(nombre, apellido);
            hombres.add(hombre1);
        }
    
        System.out.println("Cantidad de participantes " + hombres.size());
  
        System.out.println(
                "\n\nOctopus Prime ....ZzZZzZZz \n\n" +
                        "¿ Te atrevez a despertarlo ?\n\n" +
                        "1 : Despertar a Octopus.\n" +
                        "0 : Salir."
        );

        int opcion2 = numeroEntreRango(0, 1);

        //Menu Inicio - El Despertar
        boolean op=false;
            for (int i = 0; i < hombres.size(); i++) {
                do {
                    switch (opcion2) {
                        case 1:
                            //Bienvenida de Octupus
                            robot.setEstado(true);
                            System.out.println(
                                    "\n\n\t  ; \n" +
                                            "\t[ '' ]\n" +
                                            "\t/[__]\\\n" +
                                            "\t  ][ "

                            );
                            System.out.println("Te atrevez a despertarme humano, que quieres? ");
                            int opcion;
                            do {
                                System.out.println("Turno de: " + hombres.get(i));
                                System.out.println(
                                        "1 : Jugar con Octupus \n"
                                                + "2 : Pasarle el robot a otra persona \n"
                                                + "3 : Hacer dormir a Octopus\n"
                                );
                                opcion = validarEntero();
                                switch (opcion) {
                                    case 1:
                                        hombre1.jugarConRobot(robot);
                                        break;
                                    case 2:
                                        i++;
                                        System.out.println("Turno de: " + hombres.get(i));
                                        if (i >= 3) {
                                            i = 0;
                                        }
                                        hombre1.jugarConRobot(robot);
                                        break;
                                    case 3:
                                        robot.setEstado(false);
                                        if (robot.despertar()) {
                                            System.out.println("Regresare a mi sueño... zZzZzZz");
                                        }
                                        break;
                                    default:
                                        System.out.println("ERROR: Usted ingreso una opcion invalida\n");
                                }
                            } while (opcion !=3);
                        case 0:
                          op=true;
                          i= hombres.size();
                            System.out.println("Usted dejo de jugar con Octopus");
                    }
                } while (!op);
            }
        }
    public static double validarDouble(String mensaje) {
        Scanner leerInterno = new Scanner(System.in);
        double numero;
            
        System.out.println(mensaje);
            while (true) {
                if (leerInterno.hasNextDouble()) {
                    numero = leerInterno.nextDouble();
                    if ( numero < 0 ) System.out.println("ERROR: Opcion invalida.");
                    else return numero;
                } else {
                    System.out.println("ERROR: Opcion invalida.");
                    leerInterno.next();
                }
            }
    }
    
    public static int numeroEntreRango(int minimo, int maximo) {
        Scanner leerInterno = new Scanner(System.in);
        int numero;
        
        while (true) {
            if (leerInterno.hasNextInt()) {
                numero = leerInterno.nextInt();
                        
                if (numero >= minimo && numero <= maximo) return numero;
                else System.out.println("ERROR: Opcion invalida.");
                    
            } else {
                System.out.println("ERROR: Opcion invalida.");
                leerInterno.next();
            }
        }
    }
    
    public static int validarEntero() {
        Scanner leerInterno = new Scanner(System.in);
        int numero;

        while (true) {
            if (leerInterno.hasNextInt()) {
                numero = leerInterno.nextInt();
                if(numero < 0) System.out.println("ERROR: Opcion invalida.");
                else return numero;
            } else {
                System.out.println("ERROR: Opcion invalida.");
                leerInterno.next();
            }
        }
   }
    
}
 