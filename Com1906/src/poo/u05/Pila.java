package poo.u05;

import java.util.ArrayList;

public class Pila implements IColeccion{
	public ArrayList<Object> coleccion;
	
	public Pila(int cant) {
		coleccion =new ArrayList<Object>(cant);
	}

	
	public boolean estaVacia() {
		
		return coleccion.isEmpty();
	}
	
	/*public Object primero() {
		if(!estaVacia()) {
			return coleccion.get(coleccion.size()-1);
		}
		return null;
	}
	*/
	
	
	public Object extraer() {
		if(!estaVacia()) {
			coleccion.remove(coleccion.size()-1);
			return coleccion.lastIndexOf(coleccion.size()-1);
		}
		return null;
	}

	
	public boolean añadir(Object obj) {
		if(o) {
			
		}
		return false;
	}
	
}
