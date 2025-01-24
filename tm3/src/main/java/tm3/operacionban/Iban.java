package tm3.operacionban;

import java.util.Random;

public class Iban {

	private int num;
	
	
	
	public static void main(String[] args) {
		String prin;
		
		Random random = new Random();
		int numero = random.nextInt(3)+1 ;
		
		switch (numero) {
		case 1: {
			prin = "ES91";
			break;
		}
		case 2: {
		prin = "ES32";
			break;
		}
		case 3: {
		prin = "ES45";
		break;
	}
		default:
			System.out.println("Error");
		}
	}

	
}
