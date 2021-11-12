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
	}

}
