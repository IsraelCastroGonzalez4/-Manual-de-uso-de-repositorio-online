package edu.alonso.tm3;

public class Coche {

	private String marca;
	private String modelo;
	private int kms;
	private int litros;
	
	public String toString() {
		String aux = "Marca: " + marca + " ,modelo" + modelo + ", km" + kms;
		return aux;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String valorMarca) {
		if(valorMarca.equals("dacia") || valorMarca.equals("peugeot"));
		marca = valorMarca;
	}
	
	
	private final int LITROS_MINIMOS = 20;
	
	private static int contador = 0;
	private  int contadornoSta = 0;
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		contador++;
		contadornoSta++;
	} 
	public Coche(String marca, String modelo, int kms) {
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
		contador++;
		contadornoSta++;
	} 
	
	public boolean ValidaAceite(int litrosIntroducidos) {
	litros = litrosIntroducidos;
	if (litros >= LITROS_MINIMOS){
	return true;
	}
	return false;
	}
	private void metodoPrueba (int litrosIntroducidos) {
		int variable2;
		for (int i = 0; i < 10; i++) {
			variable2 = litrosIntroducidos ;
			
		}
		
	}
	
}
