package viaje_carretera;
import java.util.Scanner;

public class Viaje_Carretera {
    public static void main(String[] args) {
        
        //Variables
            Scanner leer = new Scanner(System.in);
            String ciudad;
            float nRuta, nKilometro;
            int opcion;
        
        //Constructores
            Viaje vacaciones = new Viaje();
            Combustible ypf = new Combustible("Super", 200);
            Vehiculo car = new Auto("Focus", "Fort", "AB120DE", ypf) {};
            Vehiculo camioneta = new Camioneta("Hilux", "Toyota", "AF150FE", ypf) {};
            Vehiculo camion = new Camion("Volvo", "Fort", "AB580DE", ypf) {};
        
        //Validacion - menu seleccion vehiculo
            System.out.println(
                    "\n\t¿Que vehiculo utilizara?\n" + 
                    "1 : Auto.\n" + 
                    "2 : Camioneta\n" + 
                    "3 : Camion."
            );

            int opcVehiculo = numeroEntreRango(1,3); //Opiniones - Consultar
 
        //Menu Principal
        do {
            System.out.println("\n\tCalculemos el costo de tu viaje\n");
            System.out.println(
                    "1 : Ingresar datos del viaje.\n" + 
                    "2 : Calcular costo de combustible.\n" + 
                    "3 : Calcular costo de total.\n" + 
                    "0 : Salir.");
            opcion = opcVehiculo = numeroEntreRango(0,3); //Opiniones - Consultar
            
            switch (opcion){
                case 1:
                    //Cargando origen
                        Ciudad cityOrigin = new Ciudad();
                        System.out.println("Ingrese la ciudad de origen: ");
                            ciudad = leer.nextLine();
                        nRuta = validarFloat("Ingrese el numero de ruta: ");
                        nKilometro = validarFloat("Ingrese el Km de altura de la ciudad: ");
                        
                        cityOrigin.setNumRuta(nRuta);
                        cityOrigin.setCiudadOrigen(ciudad);
                        cityOrigin.setKlmRuta(nKilometro);
                            
                        vacaciones.setOrigen(cityOrigin);

                        pausa("\nInformacion de ciudad de origen ingresada.\nPresione una tecla para continuar.");
                     
                    //Cargando destino
                        Ciudad cityDestino = new Ciudad();
                        System.out.println("Ingrese la ciudad de destino: ");
                            ciudad = leer.nextLine();
                        nRuta  = validarFloat("Ingrese el numero de ruta: ");
                        nKilometro = validarFloat("Ingrese el Km de altura de la ciudad: ");
                    
                        cityDestino.setNumRuta(nRuta);                    
                        cityDestino.setCiudadOrigen(ciudad);
                        cityDestino.setKlmRuta(nKilometro);
                    
                        vacaciones.setDestino(cityDestino);
                        pausa("\nInformacion de ciudad de destino ingresada.\nPresione una tecla para continuar.");
                    
                    //Calculando Distancia
                        vacaciones.calculoDistacia();
                        
                    //Calculando Peaje
                        int cantidadPeajes = validarEntero("\n\nIngrese la cantidad de peajes: ");
                        
                        vacaciones.setCantPeajes(cantidadPeajes);
                        
                            switch (opcVehiculo){
                                case 1:
                                        vacaciones.calculoCostoPeaje(car);
                                        vacaciones.setVehiculo(car);
                                       break;
                                case 2:
                                        vacaciones.calculoCostoPeaje(camioneta);
                                        vacaciones.setVehiculo(camioneta);
                                     break;
                                case 3:
                                        vacaciones.calculoCostoPeaje(camion);
                                        vacaciones.setVehiculo(camion);
                                     break;
                                default: System.out.println("La opcion ingresada no es correcta."); 
                                continue;
                            }//.Calculando Peaje
                        
                        
                        pausa("\nPresione una tecla para continuar.");
                        continue;
                        
                case 2: //Calculando costo de combustible
                    
                    float gastoCombustible;
                    switch (opcVehiculo) {
                        case 1:
                            gastoCombustible =  car.calcularCostoDeCombustible(vacaciones.getDistancia());
                            System.out.println("\nEl costo en auto es: $" + gastoCombustible);
                            break;
                        case 2:
                            gastoCombustible = camioneta.calcularCostoDeCombustible(vacaciones.getDistancia());
                            System.out.println("\nEl costo en camioneta es: $" + gastoCombustible);
                            break;
                        case 3:
                            gastoCombustible =  camion.calcularCostoDeCombustible(vacaciones.getDistancia());
                            System.out.println("\nEl costo en camion es: $" + gastoCombustible);
                    };
                    pausa("Presione una tecla para continuar\n");
                    continue;
                
                case 3: //Calculando costo total
                    System.out.println("\n\nUd debe tener $" + vacaciones.calculoCostotal() + " para realizar este viaje.");
                    pausa("Presione una tecla para continuar.");
                          
                case 0: 
                    break;
                
                default: System.out.println("La opcion ingresada no es correcta");
                   
            }

        } while (opcion != 0);//.Menu Principal

    } //. PSVM
    
    //Funcion extras
        static void pausa(String info) {
            System.out.println(info);
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
           
        public static int numeroEntreRango(int minimo, int maximo) {
            Scanner leerInterno = new Scanner(System.in);
            int numero;
        
            while (true) {//Bucle__
                if (leerInterno.hasNextInt()) {
                    numero = leerInterno.nextInt();
                        
                    if (numero >= minimo && numero <= maximo) return numero;
                    else System.out.println("ERROR: Opcion invalida.");
                    
                } else {
                    System.out.println("ERROR: Opcion invalida.");
                    leerInterno.next();
                }
            }//.Bucle__
        }
        
        public static int validarEntero(String mensaje) {
            Scanner leerInterno = new Scanner(System.in);
            int numero;
            
            System.out.println(mensaje);
            while (true) {//Bucle__
                if (leerInterno.hasNextInt()) {
                    numero = leerInterno.nextInt();
                    if(numero < 0) System.out.println("ERROR: Opcion invalida.");
                    else return numero;
                } else {
                    System.out.println("ERROR: Opcion invalida.");
                    leerInterno.next();
                }
            }//.Bucle__
        }
        
        public static float validarFloat(String mensaje) {
            Scanner leerInterno = new Scanner(System.in);
            float numero;
            
            System.out.println(mensaje);
            while (true) {//Bucle__
                if (leerInterno.hasNextFloat()) {
                    numero = leerInterno.nextFloat();
                    if ( numero < 0 ) System.out.println("ERROR: Opcion invalida.");
                    else return numero;
                } else {
                    System.out.println("ERROR: Opcion invalida.");
                    leerInterno.next();
                }
            }//.Bucle__
        }
        
}
