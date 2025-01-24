package edu.alonso.tm3;

public class Cochepracti {
public static void main(String[] args) {
	Coche dacia = new Coche("Dacia","Sandero");
	Coche dacia2 = dacia;
	dacia.setMarca("BMW");
	Coche peugeot = new Coche("peugeot","",100);
	
	String stringPeugeot = peugeot.toString();
	System.out.println(stringPeugeot);
	System.out.println(dacia.toString());
	System.out.println(dacia);
	
	int litros = 10;
	
	boolean Valida = dacia.ValidaAceite(litros);
	System.out.println("Valida " + Valida);
	
	
}
}
