package tm3.operacionban;

public class OperBancaInit {
public static void main(String[] args) {
	OperBanca optr = new Trasferencia(new Cliente("Fran", "Jose", "4884125H", 34), new Domicilio("Prueba", "Salamanca", "Salamanca",12,'A' ));
	System.out.println(optr);
	Bizum opbz = new Bizum(new Cliente("Hola", "Hola", "4545644H", 15), new Domicilio("Jose", "Salamanca", "Salamanca",12, 'A'));
	System.out.println(opbz);
	
}
}
