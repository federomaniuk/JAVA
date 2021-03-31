package entidades;

public class Empleado implements Comparable<Empleado>{
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private float sueldoBase;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Empleado() {
		
	}
	
	public Empleado(int dni, String apellido, String nombre, String email, float sueldoBase) {
		this.setDni(dni);
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setEmail(email);
		this.setSueldoBase(sueldoBase);
	}
	
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
