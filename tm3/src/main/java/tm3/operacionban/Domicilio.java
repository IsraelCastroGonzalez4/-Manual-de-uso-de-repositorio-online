package tm3.operacionban;

public class Domicilio {

	private String calle;
	private String localidad;
	private String provincia;
	private int numero;
	private char letra;
	
	
	public Domicilio(String calle, String localidad, String provincia, int numero, char letra) {
		super();
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
		this.numero = numero;
		this.letra = letra;
	}
	

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}


	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", localidad=" + localidad + ", provincia=" + provincia + " letra=  " + letra + ", numero=" + numero + "]";
	}
	
	
	
	
	
	
	
}
