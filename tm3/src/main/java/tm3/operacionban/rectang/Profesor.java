package tm3.operacionban.rectang;

public class Profesor extends Persona{
private String modulo1;
private String modulo2;
private String modulo3;
private String modulo4;
public Profesor(String nombre, int edad, char sexo, String modulo1, String modulo2, String modulo3, String modulo4) {
	super(nombre, edad, sexo);
	this.modulo1 = modulo1;
	this.modulo2 = modulo2;
	this.modulo3 = modulo3;
	this.modulo4 = modulo4;
}
public Profesor(String nombrei, String modulo1, String modulo2, String modulo3, String modulo4) {
	super(nombrei);
	this.modulo1 = modulo1;
	this.modulo2 = modulo2;
	this.modulo3 = modulo3;
	this.modulo4 = modulo4;
}


@Override
public String toString() {
	return "Profesor [modulo1=" + modulo1 + ", modulo2=" + modulo2 + ", modulo3=" + modulo3 + ", modulo4=" + modulo4
			+ ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + "]";
}
	





}


