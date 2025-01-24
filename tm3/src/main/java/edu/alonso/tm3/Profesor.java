package edu.alonso.tm3;

public class Profesor {
 protected String nombre;
 protected int edad;
 protected String asignatura;

 
 public Profesor (String nombre, int edad){
	 super();
	 this.nombre = nombre;
	 this.edad =edad;
 }
 public Profesor (String nombre, int edad, String asignatura){
	 super();
	 this.nombre = nombre;
	 this.edad =edad;
	 this.asignatura = asignatura;
 }
 
 
 public String getNombre () {
	 return nombre;
 }
 public void  setNombre(String nombre) {
	 this.nombre = nombre;
 }
 public int getEdad() {
	 return edad;
 }
 public void  setEdad(int edad) {
	 this.edad = edad;
 }
 public String getAsignatura() {
	 return asignatura;
 }
 public void  setAsignatura(String asignatura) {
	 this.asignatura = asignatura;
 }

 @Override
 public String toString() {
	 return "Nombre  " + nombre + "  Edad  " + edad + " Asignatura  " + asignatura + "  " ;}

}
