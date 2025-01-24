package tm3.operacionban;

public class Trasferencia  extends OperBanca{

	private String ibandes;
	
	public Trasferencia (Cliente cliente, Domicilio domicilio) {
		super(cliente, domicilio);
		this.ibandes = generarIban();
	}
	
	public String getIbandes() {
		 return ibandes;
	 }

	
	 
	 @Override
	public String toString() {
		return "Trasferencia " + super.toString() + " ibandes= " + ibandes + "]";
	}
	 
}
