package tm3.operacionban;

public class Cliente {
	protected String nombre;
	private String apellidou;
	private String apellidod;
	protected int edad;
	
	
	
	public Cliente(String nombre, String apellidou, String apellidod, int edad) {
		super();
		this.nombre = nombre;
		this.apellidou = apellidou;
		this.apellidod = apellidod;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	} 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidou() {
		return apellidou;
	} 
	public void setApellidou(String apellidou) {
		this.apellidou = apellidou;
	}
	
	public String getApellidod() {
		return apellidou;
	} 
	public void setApellidod(String apellidou) {
		this.apellidou = apellidou;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidou=" + apellidou + ", apellidod=" + apellidod + ", edad=" + edad
				+ "]"; }
	}
