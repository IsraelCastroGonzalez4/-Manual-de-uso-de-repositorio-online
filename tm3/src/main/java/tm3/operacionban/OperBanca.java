package tm3.operacionban;

import java.util.Random;

public class OperBanca {

	private Cliente nombre;
	private Domicilio domicilio;
	private String iban;
	public OperBanca(Cliente nombre, Domicilio domicilio)  {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.iban = generarIban();
	}
	
	
	
		protected String generarIban() {
			final String Pref1 = "ES91";
			final String Pref2 = "ES32";
			final String Pref3 = "ES45";
			
			String iban = null;
			
			Random random = new Random();
			int numero = random.nextInt(3)+1 ;
			
			
			switch (numero) {
			case 1: {
			iban = Pref1;
				break;
			}
			case 2: {
			iban= Pref2;
				break;
			}
			case 3: {
			iban = Pref3;
			break;
		}
			default:
				System.out.println("Error");
			}
			
			for (int i = 1; i == 5  ; i++) {
				numero = random.nextInt(10000)+1 ;
				String textoGenerado = "";
				if (numero < 10) {
					textoGenerado = "000" + numero;
				}
				else if (numero < 100) {
					textoGenerado = "00" + numero;
				}
				else if (numero < 1000) {
					textoGenerado = "0" + numero;
				}
				else {
					textoGenerado = Integer.valueOf(numero).toString();
				}
				iban += textoGenerado;
			}
			return iban;
		}



		public Cliente getNombre() {
			return nombre;
		}

		public void setNombre(Cliente nombre) {
			this.nombre = nombre;
		}



		public Domicilio getDomicilio() {
			return domicilio;
		}
		public void setDomicilio(Domicilio domicilio) {
			this.domicilio = domicilio;
		}



		public String getIban() {
			return iban;
		}
		//Quitamos el set para que no se modifique ni nadie lo modifique 

		@Override
		public String toString() {
			return "OperBanca [nombre=" + nombre + ", domicilio=" + domicilio + ", iban=" + iban + "]";
		}
		
	
	}

	
