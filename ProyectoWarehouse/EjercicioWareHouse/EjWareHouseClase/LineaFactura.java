package EjWareHouseClase;

public class LineaFactura {
	private int numero;
	private int cantidad;
	private Articulo articulo;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public LineaFactura(int numero, int cantidad, Articulo articulo) {
		super();
		this.numero = numero;
		this.cantidad = cantidad;
		this.articulo = articulo;
	}
	public double precioTotal() {
		return 1.1;
	}
	

}
