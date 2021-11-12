package beans;

public class Usuario {
	private String username;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String email;
	private double saldo;
	private boolean premium;
	
	public Usuario(String username, String contrasena, String nombre, String apellidos, String email, double saldo,
			boolean premium) {
		super();
		this.username = username;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.saldo = saldo;
		this.premium = premium;
	}
	
	

}
