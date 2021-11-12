package test;

import java.sql.ResultSet;
import java.sql.Statement;

import connection.DBConnection;

public class OperacionesBD {

	public static void main(String[] args) {
		actualizarLibro(1, "Histórica");
	}

	public static void actualizarLibro(int id, String genero) {
		DBConnection con = new DBConnection();
		String sql = "UPDATE libros SET genero = '" + genero + "'WHERE id=" + id;

		try {
			Statement st = con.getConnection().createStatement();
			st.executeQuery(sql);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			con.descoenctar();
		}
	}

}
