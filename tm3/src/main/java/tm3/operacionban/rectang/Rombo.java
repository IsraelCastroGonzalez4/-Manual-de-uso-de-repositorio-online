package tm3.operacionban.rectang;

public class Rombo {
public static void main(String[] args) {
	int alturaRombo = 5;
	int alturaMitadTriangulo = (alturaRombo + 1) / 2;
	 
	//Triangulo de arriba
	for (int fila = 1; fila <= alturaMitadTriangulo; fila++) {
		//Espacio
		for (int columna = 1; columna <= alturaMitadTriangulo - fila; columna++) {
			System.out.print(" ");
		}
		//Asteriscos
		for (int columna = 1; columna < (fila * 2); columna++) {
			System.out.print("*");
		}
		System.out.println();
	}

	
	//Triangulo de abajo
	for (int fila = 1; fila < alturaMitadTriangulo; fila++) {
		//Espacio
	for (int columna = 1; columna <= fila; columna++) {
		System.out.print(" ");
	}
		//Asteriscos
		for (int columna = 1; columna < (alturaMitadTriangulo - fila) * 2; columna++) {
			System.out.print("*");
		}
	System.out.println();
	}
}
}
