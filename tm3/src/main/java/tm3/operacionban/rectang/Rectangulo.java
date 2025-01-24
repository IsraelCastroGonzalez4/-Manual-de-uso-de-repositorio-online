package tm3.operacionban.rectang;

public class Rectangulo {

	private int ancho;
	private int largo;
	
	private final int ANCHO_DEFECTO = 5;
	private final int LARGO_DEFECTO = 10;
	
	public Rectangulo (int ancho, int largo) {
		if (ancho > 1) {
			this.ancho = ancho;
		} else {
			this.ancho = ANCHO_DEFECTO;
		}
		if (largo > 1) {
			this.largo = largo;
		} else {
			this.largo = LARGO_DEFECTO;
		}
	}
	public boolean isVertical() {
		if (largo > ancho) {
			return true;
		}
		return false;
	}
	public boolean isHorizontal() {
	if (largo > ancho) {
		return false;
	}
	return true;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo (int largo) {
		if (largo > 1) {
		this.largo = LARGO_DEFECTO;	
		}
	}
	public int calculaArea() {
		return largo * ancho;
	}
	private int calculaPerimetro() {
		return (2 * largo) + (2 * ancho);
	}
	public void dibujarRectangulo() {
		for (int i = 0; i < largo; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", largo=" + largo + "]";
	}
		
	}
	

