package Controlador;

import Conexion.Conexion;
import Modelo.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private final Connection con;
   // private static List<Alumno> list_alumnos = new ArrayList<Alumno>();
   // private static List<Alumno> list_alumnosD = new ArrayList<Alumno>();
    
    public AlumnoData(){
        con = Conexion.getConexion();
    }

    public void guardarAlumno( Alumno alumno ){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO alumno "
                        + "(dni, apellido, nombre, fecha_nacimiento, estado) "
                        + "VALUES (?, ?, ?, ?, 1)";
        
        try
        {
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setInt( 1, alumno.getDni() );
            stmt.setString( 2, alumno.getApellido() );
            stmt.setString( 3, alumno.getNombre() );
            stmt.setDate( 4, Date.valueOf( alumno.getFecha_nacimiento() ) );
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if( resultado.next() ) 
            {
                alumno.setId_alumno(resultado.getInt( 1 ));
            }
            JOptionPane.showMessageDialog(null, "Alumno guardado con exito", "" ,JOptionPane.INFORMATION_MESSAGE );
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(),"Error al guardar Alumno", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                resultado.close(); 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
    } // .guardarAlumno()
    
    public void actualizarAlumno ( Alumno alumno ){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE alumno "
                        + "SET dni = ?, apellido = ? , nombre = ? , fecha_nacimiento = ?  "
                        + "WHERE dni = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, alumno.getDni() );
            stmt.setString( 2, alumno.getApellido() );
            stmt.setString( 3, alumno.getNombre() );
            stmt.setDate( 4, Date.valueOf( alumno.getFecha_nacimiento() ) );
            stmt.setInt( 5, alumno.getDni() );
            
            stmt.executeUpdate();           
            JOptionPane.showMessageDialog(null, "Registro actualizado"," ",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), " ", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
    }//.actualizarAlumno()
       
    public Alumno buscarAlumno ( int idAlumno ){
        Alumno alumnoN = null;
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT * "
                        + "FROM alumno "
                        + "WHERE id_alumno = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idAlumno );
            resultado = stmt.executeQuery();
            
            if( resultado.next() )
            {
                alumnoN = new Alumno();
                alumnoN.setId_alumno( idAlumno );
                alumnoN.setDni(resultado.getInt("dni"));
                alumnoN.setApellido(resultado.getString("apellido"));
                alumnoN.setNombre(resultado.getString("nombre"));
                alumnoN.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());
                alumnoN.setEstado(resultado.getBoolean("estado"));
            }else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el alumno solicitado.", "ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch ( SQLException ex )
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { 
                resultado.close(); 
                stmt.close(); 
            }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
        return alumnoN;
    }//.buscarAlumno()
    
    public void eliminarAlumno ( int idAlumno ){
        PreparedStatement stmt = null;

        String query    = "UPDATE alumno "
                        + "SET estado = false "
                        + "WHERE id_alumno = ?";
        
        try
        {
            stmt = con.prepareStatement ( query );
            stmt.setInt ( 1 , idAlumno );
            
            if(stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog( null, "Registro eliminado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            } else {
                JOptionPane.showMessageDialog( null, "ID ingresado incorrecto"  + " " + JOptionPane.ERROR_MESSAGE );
            }
        }
        catch ( SQLException ex ) {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() + " " + JOptionPane.ERROR_MESSAGE );
        }
        
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }

    }//.eliminarAlumno()
    
    public void habilitarAlumno ( int idAlumno ){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE alumno "
                        + "SET estado = true "
                        + "WHERE id_alumno = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idAlumno );
            
            if(stmt.executeUpdate() > 0){
                JOptionPane.showMessageDialog( null, "Alumno habilitado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog( null, "ID ingresado incorrecto"  + " " + JOptionPane.ERROR_MESSAGE );
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
    }//.habilitarAlumno()
   
    public List <Alumno> listarHabilitados ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Alumno> list_alumnos = new ArrayList<Alumno>(); // se agregp
        String query    = "SELECT * "
                        + "FROM alumno "
                        + "WHERE estado = 1 "
                        + "ORDER BY alumno.apellido ";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Alumno alumnoN = new Alumno();
                alumnoN.setId_alumno( resultado.getInt("id_alumno"));
                alumnoN.setDni(resultado.getInt("dni"));
                alumnoN.setApellido(resultado.getString("apellido"));
                alumnoN.setNombre(resultado.getString("nombre"));
                alumnoN.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());
                list_alumnos.add(alumnoN);
            }   
        }
        catch ( SQLException ex ) 
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "" , JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        return list_alumnos;
    }
    
    public void deshabilitandoAlumno ( int idAlumno ){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE alumno "
                        + "SET estado = false "
                        + "WHERE id_alumno = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idAlumno );
            
            if(stmt.executeUpdate() < 1){
                JOptionPane.showMessageDialog( null, "Alumno deshabilitado"  + " " + JOptionPane.INFORMATION_MESSAGE );
            }else{
                JOptionPane.showMessageDialog( null, "ID ingresado incorrecto"  + " " + JOptionPane.ERROR_MESSAGE );
            }
        }
        catch ( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "" , JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        
    }//.deshabilitadosAlumno()
  
    public List <Alumno> listarDeshabilitados ( ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List<Alumno> list_alumnosD = new ArrayList<Alumno>();
        
        String query    = "SELECT * "
                        + "FROM alumno "
                        + "WHERE estado = 0 "
                        + "ORDER BY alumno.apellido";
        
        try
        {
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Alumno alumnoM = new Alumno();
                alumnoM.setId_alumno( resultado.getInt("id_alumno"));
                alumnoM.setDni(resultado.getInt("dni"));
                alumnoM.setApellido(resultado.getString("apellido"));
                alumnoM.setNombre(resultado.getString("nombre"));
                alumnoM.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());    
                list_alumnosD.add(alumnoM);
            }   
        }
        catch ( SQLException ex ) 
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "" , JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        return list_alumnosD;
    }
    
    public List <Alumno> listarTodosAlumnos ( ) { //COMPROBADO
        ArrayList <Alumno> array_alumnos = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT * "
                        + "FROM alumno "
                        + "ORDER BY alumno.apellido";
        
        try{
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                Alumno alumnoM = new Alumno();
                alumnoM.setId_alumno( resultado.getInt("id_alumno"));
                alumnoM.setDni(resultado.getInt("dni"));
                alumnoM.setApellido(resultado.getString("apellido"));
                alumnoM.setNombre(resultado.getString("nombre"));
                alumnoM.setFecha_nacimiento(resultado.getDate("fecha_nacimiento").toLocalDate());    
                array_alumnos.add(alumnoM);
            }   
        }
        catch ( SQLException ex ) 
        {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "" , JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try { stmt.close(); }
            catch ( SQLException ex )
            { JOptionPane.showMessageDialog( null, "ERROR : " + ex.getMessage(), " " , JOptionPane.ERROR_MESSAGE ); }
        }
        return array_alumnos;
    }  
    
}