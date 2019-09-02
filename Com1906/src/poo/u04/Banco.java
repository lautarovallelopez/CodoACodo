package poo.u04;
import poo.u04.Cuenta;
import java.util.ArrayList;
public class Banco {
	private String nombre;
	private ArrayList<Cuenta> cue;
	public final static double descubierto=3000;
	
	public Banco(String nomb){
		nombre=nomb;
		cue=new ArrayList<>();
	}
	
	public boolean agregarCuenta(Cuenta cuent) {
		if (cuent.getSaldo()>=0 && cuent.esMayor()) {
			return cue.add(cuent);
		}else return false;
	}
	public String toString() {
		String msj="Banco " + nombre + "\n";
		for(Cuenta x:cue) {
			msj=msj+x.toString()+"\n";
		}
		return msj;
		
		
		
		
	}
}
