package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String bd = "libreria";
	static String port = "3307";
	static String usuario = "root";
	static String password = "pass";
	static String cadenaDeConexion = "jdbc:mysql://localhost:" + port + "/" + bd;

	Connection connection = null;

	public DBConnection() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(cadenaDeConexion, usuario, password);

			if (connection == null) {
				System.out.println("la conexion ha fallado");

			} else {
				System.out.println("la conexion a " + bd + " ha sido satisfactoria");
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void descoenctar() {
		connection = null;

	}

}
