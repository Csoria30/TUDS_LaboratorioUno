
package negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// buscarTeléfono() que en base a un apellido nos devuelve una lista con los nros de 
//teléfono asociados a dicho apellido.
public class Directorio {
    private HashMap <String,Cliente> registro = new HashMap <String,Cliente>();
    
    public int getRegistros (){
        return registro.size();
    }
    
    public Cliente buscarCliente ( String numTelefono ){
        for ( Map.Entry <String, Cliente> entry : registro.entrySet() ) {
            String key = entry.getKey();
            Cliente value = entry.getValue();
            if(numTelefono.equals(key)){
                return value;
            }
        }
        System.out.println("No se encontro el telefono asociado a un cliente.");
        return null;
    }
    
    public ArrayList <Cliente> buscarClientes( String ciudad ){    
        ArrayList <Cliente> buscar = new ArrayList();
        Set <String> claves = registro.keySet();
        Iterator <String> it = claves.iterator();
        
        while(it.hasNext()){
            String claveActual = it.next();
            Cliente clienteActual = registro.get( claveActual );
           
            if( clienteActual.getCiudad().equals( ciudad ) ) {
                buscar.add( clienteActual );
            }         
        }
        return buscar;
    }


/*
AgregarCliente() que permite registrar un nuevo cliente con su respectivo nro de 
teléfono. Siendo el nro del teléfono la clave del mismo.
*/

    public boolean agregarCliente( String telefono, Cliente cliente ){
        boolean agregado = false;

        if ( !registro.containsKey( telefono ) ){
            registro.put( telefono, cliente );
            agregado = true;
        }
        return agregado;
    }
    
    //
    
    public ArrayList <Cliente> buscarApellido( String apellido ){
        ArrayList <Cliente> buscar = new ArrayList();
        Set <String> claves = registro.keySet();
        Iterator <String> it = claves.iterator();
        
        while ( it.hasNext() ) {
            String claveActual = it.next();
            Cliente clienteActual = registro.get( claveActual );
           
            if( clienteActual.getCiudad().equals( apellido ) ) {
                buscar.add( clienteActual );
            }         
        }
        
        return buscar;
    }
    
    //https://github.com/DiscoDurodeRoer/ejercicios-java-youtube/blob/master/estructuras%20dinamicas/estructuras%20dinamicas%2007/Ejercicio_ED_7_Discoduroderoer/src/ejercicio_ed_7_discoduroderoer/Ejercicio_ED_7_Discoduroderoer.java
    
    public ArrayList <String> buscarTelefono ( String apellido ){
        ArrayList <String> arrayNum = new ArrayList <>();
                
        for ( Map.Entry <String, Cliente> entry : registro.entrySet() ){
            if( registro.containsValue(apellido)){
                arrayNum.add(entry.getKey());
            }
        }
         
        return arrayNum;
    }
    
    
    public void borrarCliente(String telefono){
        Cliente aux = registro.remove( telefono );
        
        if ( aux != null) 
        {
            System.out.println("Se ha eliminado correctamente.");
        }
        else 
        {
            System.out.println("Cliente no encontrado.");
        }
    }

}
