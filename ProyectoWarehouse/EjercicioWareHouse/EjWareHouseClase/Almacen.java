package EjWareHouseClase;

import java.util.ArrayList;
import java.util.Iterator;

public class Almacen {
	ArrayList<Articulo> articulos;
	
	public void cargarDatos() {
		
	}
	public Articulo elMasCaro() {
		Articulo a = null ;
		for (int i = 0; i < articulos.size(); i++) {
			if (articulos.get(i).getPrecio()>a.getPrecio()) {
				a= articulos.get(i);
			}
		}
		return a;
	}
	public double precio(String codigoProducto) {
		double a=0;
		for (int i = 0; i < articulos.size(); i++) {
			if (articulos.get(i).getCode().equals(codigoProducto)) {
				a=articulos.get(i).getPrecio();
			}
		}
		return a;
		
	}
	public boolean hayStock(String codigoProducto) {
		boolean a=false;
		for (int i = 0; i < articulos.size(); i++) {
			if (articulos.get(i).getCode().equals(codigoProducto)) {
				if (articulos.get(i).getStock()>0) {
					a=true;
				}
			}
		}
		return a;
		
	}
	public ArrayList<Articulo> stockJusto() {
		ArrayList<Articulo> a=null;
		for (int i = 0; i < articulos.size(); i++) {
			
				if (articulos.get(i).getStock()<10) {
					a.add(articulos.get(i));
				}
			
		}
		return a;
		
	}
	public Articulo articulo(String codigoProducto) {
		Articulo a = null;
		for (int i = 0; i < articulos.size(); i++) {
			if (articulos.get(i).getCode().equals(codigoProducto)) {
				a=articulos.get(i);
			}
		}
		return a;
		
	}
	public boolean disponibilidad(int cantidad, String codigoProducto) {
		boolean a=false;
		for (int i = 0; i < articulos.size(); i++) {
			if (articulos.get(i).getCode().equals(codigoProducto)) {
				if (articulos.get(i).getStock()-5>=0) {
					a=true;
				}
			}
		}
		return a;
		
	}
	public ArrayList<Articulo> equivalentes(Articulo articulo) {
		ArrayList<Articulo> a=null;
		double dif=0;
		for (int i = 0; i < articulos.size(); i++) {
			
			if (articulos.get(i).getPrecio()>articulo.getPrecio()) {
				dif=articulos.get(i).getPrecio()-articulo.getPrecio();
			}else {
				dif= articulo.getPrecio()-articulos.get(i).getPrecio();
			}
			if (dif<0.2) {
				a.add(articulos.get(i));
			}
		
	}
	return a;
		
	}
	public ArrayList<Articulo> ordenarPorPrecio(String orden) {
		return null;
		
	}
	public void ordenarPorStock(String orden) {
		
	}
}
