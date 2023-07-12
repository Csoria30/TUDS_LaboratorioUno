/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author loren
 */
public class Arreglo {

    public Arreglo() {
    }

    public static void sumarLista(int[] lista) { 
        int total = 0, promedio;
        for (int i = 0; i < lista.length; i++) {
            total += lista[i];
        }
        promedio = total / lista.length;
        System.out.println(" La suma de los numeros es: " + total
                + " \n El promedio es: " + promedio);
    }

    public static int buscarMayor(int[][] lista) { 
        int mayor = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j] > mayor) {
                    mayor = lista[i][j];
                }
            }
        }

        return mayor;
    }

    public static int cuentaVocales(String frase) { 
        int cantVocales = 0;
        char letra;
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.toLowerCase().charAt(i);
            if( letra == 'a' || letra =='e' || letra =='i' || letra =='o' || letra =='u'){
                cantVocales++;
            }
        }
        
        return cantVocales;
    }

    public static int cuentaCaracter(String frase, char letraBuscada) { 
        int cantCaracteres = 0;
        char letraFrase;
        for (int i = 0; i < frase.length(); i++) {
            letraFrase = frase.toLowerCase().charAt(i);
            if( letraFrase == letraBuscada){
                cantCaracteres++;
            }
        }
        
        return cantCaracteres;

    }

}
