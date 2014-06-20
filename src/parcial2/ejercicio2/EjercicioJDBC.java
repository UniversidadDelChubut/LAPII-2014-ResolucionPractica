package parcial2.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Ejercicio 2 - JDBC  
 *   Dada la siguiente tabla:
 *   
 *   PERSONA
 *     documento   integer PRIMARY KEY
 *     nombre      text    NOT NULL
 *     edad        integer NOT NULL
 *
 *   Escriba un método crearPersona que reciba un objeto Persona 
 *   y lo inserte en la base de datos si aún no existe o lance 
 *   una excepción de tipo PersonaException si la persona 
 *   ya está cargada en la base de datos.
 */

public class EjercicioJDBC {
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
		
	public void crearPersona (Persona persona) throws PersonaException {
		Connection cnn = null;
		try {
			cnn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/bdprueba", "postgres", "postgres");
			PreparedStatement pstmt = cnn.prepareStatement("Select nombre FROM persona WHERE documento = ?");
			pstmt.setInt(1, persona.getNumeroDocumento());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()){
				throw new PersonaException("La persona ya se encuentra registrada en la base de datos");
			}
			rs.close();
			pstmt.close();
			
			pstmt = cnn.prepareStatement("INSERT INTO persona (documento, nombre, edad) VALUES (?, ?, ?)");
			pstmt.setInt   (1, persona.getNumeroDocumento());
			pstmt.setString(2, persona.getNombre());
			pstmt.setInt   (3, persona.getEdad());
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			throw new PersonaException("Error de acceso a datos");
		} finally {
			try {
				cnn.close();
			} catch (SQLException e) {
			}
		}
	}
	
}
