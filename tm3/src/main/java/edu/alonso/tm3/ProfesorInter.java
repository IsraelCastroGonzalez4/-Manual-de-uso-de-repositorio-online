package edu.alonso.tm3;


public class ProfesorInter  extends Profesor{
public ProfesorInter (String nombre, int edad, int anosplaza, String ciudad) {
	super (nombre, edad);
	this.anosplaza = anosplaza;
}
public ProfesorInter (String nombre, int edad, String asignatura, int anosplaza, String ciudad) {
	super (nombre, edad, asignatura);
	this.anosplaza = anosplaza;
}



private String ciudad;
private int anosplaza;

public int SUELDO_BASE = 1600;

public String getCiudad() {
	return  ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}
public int getanosPlaza() {
	return  anosplaza;
}

public void setanosPlaza(int anosplaza) {
	this.anosplaza = anosplaza;
}

@Override
public String toString() {
	return super.toString() + "[Anos Plaza:  " + anosplaza + "]";
}
}
