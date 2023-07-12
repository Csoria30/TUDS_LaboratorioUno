import java.util.Scanner;

public class Hombre {
    Scanner leer = new Scanner (System.in);
    private String nombre;
    private String apellido;

        public Hombre() {
        }

        public Hombre(String apellido, String nombre) {
            this.apellido = apellido;
            this.nombre = nombre;
        }
            
        String getNombre(){
            return nombre;
        }
        
        String getApellido(){
            return apellido;
        }
        
        void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        void setApellido(String apellido){
            this.apellido = apellido;
        }
    
    //Metodos
        void jugarConRobot(Robot robot){
            int opcion;

            do {
                System.out.println(
                        "\n\nElija una opcion del siguiente Menu\n" + 
                        "1 : Avanzar.\n" + 
                        "2 : Retroceder.\n" + 
                        "3 : Recargar bateria.\n" + 
                        "4 : Consulta Bateria LLena.\n" + 
                        "5 : Consulta Bateria Vacia.\n" + 
                        "6 : Carga Actual.\n" + 
                        "0 : Dejar de jugar."
                );
                opcion = numeroEntreRango(0, 6);
                
                    switch (opcion) {
                        case 1:
                            System.out.println("¿Cuantos pasos desea avanzar?");
                            int nPasosAv = validarEntero();
                            robot.avanzar(nPasosAv);
                            continue;

                        case 2:
                            System.out.println("¿Cuantos pasos desea retroceder?");
                            int nPasosRe = validarEntero();
                            robot.avanzar(nPasosRe);
                            continue;
                        case 3:
                            robot.recargar();

                            continue;
                        case 4:
                            robot.bateriaLlena();
                            
                            continue;

                        case 5:
                            robot.bateriaVacia();
                           
                            continue;

                        case 6:
                            robot.bateriaActual();
                            continue;
                        case 0:
                            System.out.println("\nDejo de jugar con Octopus");
                            continue;
                            
                        default:
                            System.out.println("ERROR: Usted ingreso una opcion invalida\n");
                    }
                
                } while (opcion != 0);                        

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

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
}