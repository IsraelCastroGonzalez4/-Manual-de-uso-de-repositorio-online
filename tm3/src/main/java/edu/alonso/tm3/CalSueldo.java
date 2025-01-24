package edu.alonso.tm3;

public class CalSueldo {
/*
	public static double calSueldo (ProfesorDefi profe) {
		return profe.SUELDO_BASE;
	}
	public static double calSueldo (ProfesorInter profe) {
		return profe.SUELDO_BASE + (profe.getanosPlaza()*100);
	}
	*/
	
	public static double calSueldo(Profesor profe) {
		double sueldo;
		System.out.println(profe);
		if (profe instanceof ProfesorDefi) {
			 sueldo = ((ProfesorDefi)profe).SUELDO_BASE;
		}
		else {
		sueldo = ((ProfesorInter)profe).SUELDO_BASE + (((ProfesorInter)profe).getanosPlaza()/100);
	}
	return sueldo;
	}
}
