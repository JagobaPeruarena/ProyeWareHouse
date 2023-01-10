package EjWareHouseClase;

public abstract class Articulo {
	private String code;
	private String name;
	private String mark;
	private int capacidadBotella;
	private double precio;
	private int stock;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public int getCapacidadBotella() {
		return capacidadBotella;
	}
	public void setCapacidadBotella(int capacidadBotella) {
		this.capacidadBotella = capacidadBotella;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return code + ", " + name + ", " + mark + ", " + capacidadBotella + ", " + precio + ", " + stock;
	}
	public Articulo(String code, String name, String mark, int capacidadBotella, double precio, int stock) {
		super();
		this.code = code;
		this.name = name;
		this.mark = mark;
		this.capacidadBotella = capacidadBotella;
		this.precio = precio;
		this.stock = stock;
	}
	public void incrementarStock(int cantidad) {
		
	}
	public void disminuirStock(int cantidad) {
		
	}
	public abstract void visualizarArticulo();
	public abstract boolean saludable();
	public abstract void preciototal();
	

}
