package EjWareHouseClase;

public class Vino extends Articulo implements Alcoholico {
	private String color;
	private String origen;
	private int anio;
	private String tipoDeUva;
	private double gradosAlcohol;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getTipoDeUva() {
		return tipoDeUva;
	}
	public void setTipoDeUva(String tipoDeUva) {
		this.tipoDeUva = tipoDeUva;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	public Vino(String code, String name, String mark, int capacidadBotella, double precio, int stock, String color,
			String origen, int anio, String tipoDeUva, double gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.color = color;
		this.origen = origen;
		this.anio = anio;
		this.tipoDeUva = tipoDeUva;
		this.gradosAlcohol = gradosAlcohol;
	}
	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}
	@Override
	public boolean saludable() {
		if (origen.equals("Navarra")) {
			return true;
		}else {
		return false;
		}
	}
	@Override
	public void preciototal() {
		double total;
		total=getPrecio()+getPrecio()*21/100+calcularTasa();
		System.out.println("El precio total es de "+total+"€");
	}
	@Override
	public double calcularTasa() {
		double tasa;
		if (esFuerte()) {
			tasa=getCapacidadBotella()*TASA_BEBIDAS_FUERTES/10000;
		}else {
			tasa=getCapacidadBotella()*TASA_BEBIDAS_SUABES/10000;
		}
		return tasa;
	}
	@Override
	public boolean esFuerte() {
		if (getGradosAlcohol()>7) {
			return true;
		}else {
		return false;
		}
	}
	@Override
	public String toString() {
		return color + ", " + origen + ", " + anio + ", " + tipoDeUva + ", " + gradosAlcohol+ ", "+super.toString();
	}
	
}
