package edu.alonso.tm3;


public class ProfesorDefi extends Profesor{

	public ProfesorDefi(String nombre, int edad, String provincia) {
		super(nombre, edad);
		this.provincia = provincia;
	}

	public ProfesorDefi(String nombre, int edad, String provincia, String asignatura) {
		super(nombre, edad, asignatura);
		this.provincia = provincia;
	}

	private String centroActual;
	private String provincia;
	
	public int SUELDO_BASE = 2000;
	
	public String getCentroActual() {
		return centroActual;
	}
	public void setCentroActual(String centroActual) {
		this.centroActual = centroActual;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia= provincia;
	}
	
	public String toString() {
		return "[Nombre: " + super.nombre + "] [Edad:  " + super.edad + "] [Asignatura:  " + super.asignatura + "] [Provincia:  " + provincia +"]";
	}
	}

