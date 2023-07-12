package Controlador;

import Conexion.Conexion;
import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {
    private final Connection con;
    private static Alumno alumno = new Alumno();
    private static AlumnoData alumnoData = new AlumnoData();
    private static Materia materia = new Materia();
    private static MateriaData materiaData = new MateriaData();
    
    
    public InscripcionData (){
        con = Conexion.getConexion();
    }

    public Alumno regenerarAlumno ( int idAlumno ){
        alumno = alumnoData.buscarAlumno(idAlumno);
        return alumno;
    }
    
    public Materia regenerarMateria ( int idMateria ){
        materia = materiaData.buscarMateria(idMateria);
        return materia;
    }
    
    /*<-- CREATE -->*/
    public void inscribirAlumno(Inscripcion inscripcion){
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "INSERT INTO inscripcion (nota, id_alumno, id_materia) "
                        + "VALUES (?, ?, ?)";
        
        try
        {
            stmt = con.prepareStatement( query, Statement.RETURN_GENERATED_KEYS );
            stmt.setDouble(1, inscripcion.getId_inscripto() );
            stmt.setInt(2, inscripcion.getAlumno().getId_alumno() );
            stmt.setInt(3, inscripcion.getMateria().getId_materia() );
            
            stmt.executeUpdate();
            resultado = stmt.getGeneratedKeys();
            
            if ( resultado.next() ) 
            {
                inscripcion.setId_inscripto( resultado.getInt( 1 ) );
            }
            JOptionPane.showMessageDialog( null, "Inscripcion realizada con exito." , "", JOptionPane.INFORMATION_MESSAGE);
        } 
        catch ( SQLException ex ) {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try{
                resultado.close();
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() );
            }
        }
        
    } // inscribirAlumno() 
    
    /*<-- READ -->*/
    public List<Inscripcion> listarInscripciones( ) {
        List <Inscripcion> array_Inscripciones= new ArrayList<Inscripcion>();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT i.id_inscripcion , i.nota , i.id_alumno , i.id_materia "
                        + "FROM inscripcion AS i "
                        + "JOIN alumno AS a "
                        + "ON a.id_alumno = i.id_alumno "
                        + "JOIN materia AS m "
                        + "ON m.id_materia = i.id_materia "
                        + "ORDER BY a.dni";
        try{    
            stmt = con.prepareStatement( query );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int id = resultado.getInt("id_inscripcion");
                double nota = resultado.getDouble("nota");
                alumno = regenerarAlumno(resultado.getInt("id_alumno"));
                materia = regenerarMateria(resultado.getInt("id_materia"));
                Inscripcion inscripcion = new Inscripcion(id, nota, alumno, materia);
                array_Inscripciones.add(inscripcion);
            }
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() ,"" , JOptionPane.ERROR_MESSAGE);
        }
        finally {
            try {
                resultado.close();
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() ,"" , JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return array_Inscripciones;
    } // listarInscripciones()    
    
    public List<Inscripcion> listarInscripcionesDNIsuario ( int dniAlumno ) {
        List <Inscripcion> array_Inscripciones= new ArrayList<Inscripcion>();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        List <String> arrayMateriasInscriptas = new ArrayList ();
        String query    = "SELECT i.id_inscripcion , i.nota , i.id_alumno , i.id_materia "
                        + "FROM inscripcion AS i "
                        + "JOIN alumno AS a "
                        + "ON i.id_alumno = a.id_alumno "
                        + "JOIN materia AS m "
                        + "ON i.id_materia = m.id_materia "
                        + "WHERE i.id_alumno = ? "
                        + "ORDER BY m.nombre"; //ordena
        
        try{    
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, dniAlumno );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int id = resultado.getInt("id_inscripcion");
                double nota = resultado.getDouble("nota");
                alumno = regenerarAlumno(resultado.getInt("id_alumno"));
                materia = regenerarMateria(resultado.getInt("id_materia"));
                Inscripcion inscripcion = new Inscripcion(id, nota, alumno, materia);
                array_Inscripciones.add(inscripcion);
            }
           
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try {
                resultado.close();
                stmt.close();
            } catch ( SQLException ex ) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
            }
        }
        return array_Inscripciones;
    } //listarInscripcionesDNIsuario ()
    
    public List<Materia> listarNOInscripcionesDNIsuario ( int idInscripto ) {
        List <Materia> array_materias = new ArrayList<Materia>();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        List <String> arrayMateriasInscriptas = new ArrayList ();
        String query    = "SELECT materia.id_materia, materia.nombre, materia.anio "
                        + "FROM materia "
                        + "WHERE materia.id_materia "
                        + "NOT IN( "
                            + "SELECT i.id_materia "
                            + "FROM inscripcion AS i "
                            + "JOIN alumno AS a "
                            + "ON i.id_alumno = a.id_alumno "
                            + "JOIN materia AS m "
                            + "ON i.id_materia = m.id_materia "
                            + "WHERE i.id_alumno = ? "
                        + ")"
                        + "ORDER BY materia.nombre";
        
        try
        {    
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idInscripto );
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ) 
            {
                int id = resultado.getInt("id_materia");
                String nombre = resultado.getString("nombre");
                int anio = resultado.getInt("anio");
                Materia materia = new Materia(id, nombre, anio);
                array_materias.add(materia);
            }
           
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
        }
        finally {
            try {
                resultado.close();
                stmt.close();
            } catch ( SQLException ex ) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() ,"", JOptionPane.ERROR_MESSAGE );
            }
        }
        return array_materias;
    } //listarInscripcionesDNIsuario ()
       
    public List <Alumno> buscarInscripcionIDMateria ( int idMateria ) {
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        List <Alumno> listaAlumnos= new ArrayList<Alumno>();
        
         String query   = "SELECT id_alumno "
                        + "FROM inscripcion "
                        + "WHERE id_materia = ?";
        
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, idMateria );

            resultado = stmt.executeQuery();
         
            while ( resultado.next() ) 
            {
                Alumno a = new Alumno();
                a = regenerarAlumno(resultado.getInt("id_alumno"));
                listaAlumnos.add(a);
            }
            
            
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        } finally  {
            try  {
                resultado.close();
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
            }
        }
        return listaAlumnos;
    } //buscarInscripcionID ()
    public List<Alumno> buscarNoInscripcionIdmateria(int idMateria){
        PreparedStatement stmt= null;
        ResultSet resultado=null;
        List<Alumno> listaAlumnos=new ArrayList<Alumno>();
        
        String query    = "SELECT alumno.id_alumno " +
                           "FROM alumno " +
                           "WHERE alumno.id_alumno NOT IN (SELECT i.id_alumno " +
                           "FROM inscripcion AS i " +
                           "JOIN alumno AS a " +
                           "ON i.id_alumno=a.id_alumno " +
                           "JOIN materia AS m " +
                           "ON i.id_materia=m.id_materia " +
                           "WHERE i.id_materia = ?)";
        
        try{
            stmt=con.prepareStatement(query);
            stmt.setInt(1, idMateria);
            
            resultado= stmt.executeQuery();
            
            while (resultado.next()) {
                Alumno a = new Alumno();
                a = regenerarAlumno(resultado.getInt("id_alumno"));
                listaAlumnos.add(a);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try  {
                resultado.close();
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog( null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return listaAlumnos;
    }
    
    
    public List <Materia> listarCursadaIDAlumno (int idAlumno) {
        List<Materia> listaMateria = new ArrayList <Materia> ();
        PreparedStatement stmt = null;
        ResultSet resultado = null;
        
        String query    = "SELECT id_materia "
                        + "FROM inscripcion "
                        + "WHERE id_alumno = ?";
        
        try{
            stmt = con.prepareStatement( query );
            stmt.setInt(1, idAlumno );
            
            resultado = stmt.executeQuery();
            
            while ( resultado.next() ){
                Materia m = new Materia();
                m = regenerarMateria(resultado.getInt("id_materia"));
                listaMateria.add(m);
            }
        
        }catch( SQLException ex ){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return listaMateria;
    }
    
    /*<-- UPDATE -->*/ 
    public void actualizarNotaID( int id_inscripcion, double nota ){
        PreparedStatement stmt = null;
        
        String query    = "UPDATE inscripcion "
                        + "SET nota = ? "
                        + "WHERE id_inscripcion = ?";
        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setDouble( 1, nota);
            stmt.setInt( 2, id_inscripcion);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nota actualizada.", "", JOptionPane.INFORMATION_MESSAGE);
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(null, "ERROR al actualizar registro: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        } finally  {
            try {
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage(), "", JOptionPane.ERROR_MESSAGE);
            }
        }
    } // actualizarMateriaID() 
    
    
    
    /*<-- DELETE -->*/
    public void eliminarInscripcion ( int id_inscripcion){
        PreparedStatement stmt = null;
        
        String query    = "DELETE FROM inscripcion "
                        + "WHERE id_inscripcion = ?";
                        
        try
        {
            stmt = con.prepareStatement( query );
            stmt.setInt( 1, id_inscripcion);
            
            if(stmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado" , "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ID ingresado incorrecto" , "", JOptionPane.ERROR_MESSAGE);
            }
        } catch ( SQLException ex ) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                stmt.close();
            } catch  ( SQLException ex ) {
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage() , "", JOptionPane.ERROR_MESSAGE);
            }
        }
    } // eliminarInscripcion()
    
}