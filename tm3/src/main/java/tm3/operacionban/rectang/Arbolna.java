package tm3.operacionban.rectang;

public class Arbolna {
public static void main(String[] args) {
	
	int altura = 7;
	int base = 2;
	
	 for (int fila = 1; fila <= altura; fila++) {
		for (int columna = 1; columna <= (altura - fila); columna++) {
			System.out.print(" ");}
		
		for (int columna1 = 1; columna1 < (fila * 2); columna1++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
	 for (int fila = 1; fila <= base; fila++) {
		for (int columna = 1; columna <= altura - 2; columna++) {
			System.out.print(" ");
		}
		for (int columnas = 1; columnas <= 5; columnas++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}

