package tm3.operacionban.rectang;

import java.util.Random;

public class Persona {
	protected String nombre;
	protected String dni;
	protected int edad;
	protected char sexo;
	protected double peso;
	protected double altura;
	
	private final int PESO_IDEAL = -1;
	private final int PESO_NORMAL = 0;
	private final int SOBREPESO = 1;
	private final String LETRAS_DNI = "TRWAGMYSDBDBASDBSDBIASD";

	
	public Persona(String nombrei) {
		super();
		this.nombre = nombre;
		this.dni = generarDNI();
	}


	public Persona(String nombre,  int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.dni = generarDNI();
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public int calcularIMC() {
		double resultado = peso/(altura*altura);
		int respuesta = 0;
		if (resultado<20) {
			respuesta = PESO_IDEAL;
		}
		else if (resultado >=20 && resultado <=25) {
			respuesta = PESO_NORMAL;
		}
		else if (resultado>25) {
			respuesta = SOBREPESO;
		}
		return respuesta;
	}
	public boolean esMayorDeEdad() {
		boolean respuesta = false;
		if (edad >= 18) {
			respuesta = true;
		}
	return respuesta;
	}
	public char comprobarSexo(char sexo) {
		char respuesta = 'H';
		switch (sexo) {
		case 'h':
			respuesta = 'H';
		case 'M':
			respuesta = 'M';
		case 'm':
			respuesta = 'M';
			
		}
		return respuesta;
	}
	private String generarDNI() {
		Random r = new Random();
		Integer numero = r.nextInt(99999999)+10000000;
		
		String alea = "";
		for (int i = 0; i <8; i++) {
			alea += r.nextInt(10);
		}
		int resto = Integer.valueOf(alea)% 23;
		return alea + LETRAS_DNI.charAt(resto);
		}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getDni() {
		return dni;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
}
