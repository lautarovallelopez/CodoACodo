package poo.u04;

public class CuentaGold extends Cuenta {
	
	private double descubierto;
	
	public CuentaGold(String dni, String nombre, int edad, String genero,double saldo) {
		super(dni,nombre,edad,genero,saldo);
		descubierto=Banco.descubierto;
	}
	
	public boolean extraer(double importe) {
		double resta = saldo + descubierto- importe;
		if (resta < 0) {
			return false;
		} else {
			saldo = saldo-importe;
			return true;
		}
	}

}
