package unidad10.ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Ejerciico {

	public static void VentasVendedor(Date fecha, String codigo) {
		
		try {
			Class.forName("org.postgres.Driver");
			
			
			Connection cnn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ventas", "postgres", "postgres");
			PreparedStatement pstmt = cnn.prepareStatement(
					" SELECT artiuclo, importe, forma_pago " +
					" FROM venta " +
					" WHERE fecha = ?  AND vendedor = ?");
			pstmt.setDate(1, new java.sql.Date(fecha.getTime() ));
			pstmt.setString(2, codigo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				String s = rs.getString("articulo");
				s += rs.getDouble("importe");
				s += rs.getString("forma_pago");
				System.out.println(s);
			}
			
			rs.close();
			pstmt.close();
			cnn.close();
			
			
			
		} catch (Exception ex) {
			System.err.println("Error al acceder a los datos");
		}
		
		
		
	}
}



