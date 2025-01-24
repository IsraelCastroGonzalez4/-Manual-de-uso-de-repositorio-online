package edu.alonso.tm3;

public class ProfesorInit {

	public static void main(String[] args) {
		/*
		Profesor Ana = new Profesor("Ana ", 48);
		System.out.println("Contenido: " + Ana.toString());
		Profesor Fran = new Profesor("Fran ", 37);
				System.out.println("Contenido: " + Fran.toString());
		Profesor Javi = new Profesor("Javi ", 50);		
		System.out.println("Contenido: " + Javi.toString());
	
	Fran.setAsignatura("Programacion");
	System.out.println("Nuevo: " + Fran);
		*/
	ProfesorDefi rodrigo = new ProfesorDefi("Rodrigo", 40, "BBDD" , "Avila");
	System.out.println("Profesor 1: " + rodrigo.toString());
	
	ProfesorInter luis = new ProfesorInter("Luis", 40, "Sistemas", 6, "Palencia");
	System.out.println("Profesor 2: " + luis.toString());
	
	
	System.out.println("Luis cobra: " + CalSueldo.calSueldo(luis));
	System.out.println("Rodrigo cobra: " + CalSueldo.calSueldo(rodrigo));
	}

}
