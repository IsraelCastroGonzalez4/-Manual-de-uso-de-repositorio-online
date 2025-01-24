package tm3.operacionban;

public class Bizum {

private int numde;
private int numor;

public Bizum (Cliente cliente, Domicilio domicilio) {
	super();
	this.numde = numde;
	this.numor = numor;
}


public int getNumde() {
	return numde;
}
public void setNumde(int numde) {
	this.numde = numde;
}


public int getNumor() {
	return numor;
}
public void setNumor(int numor) {
	this.numor = numor;
}


@Override
public String toString() {
	return "Bizum" + super.toString() + "numde=" + numde + ", numor=" + numor + "]";
}

}
