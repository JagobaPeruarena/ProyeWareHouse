package EjWareHouseClase;

public interface Alcoholico {
	public static final double TASA_BEBIDAS_FUERTES= 64.13;
	public static final double TASA_BEBIDAS_SUABES= 38.48;
	
	public  boolean esFuerte();
	public  double calcularTasa();
}
