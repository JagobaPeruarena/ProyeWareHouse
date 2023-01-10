package EjWareHouseClase;

public class Cerveza extends Articulo implements Alcoholico {
	public Cerveza(String code, String name, String mark, int capacidadBotella, double precio, int stock, String cereales, String origen,int gradosAlcohol) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.origen= origen;
		this.cereales=cereales;
		this.gradosAlcohol=gradosAlcohol;
	}
	
	private String origen;
	private String cereales;
	private double gradosAlcohol;
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getCereales() {
		return cereales;
	}
	public void setCereales(String cereales) {
		this.cereales = cereales;
	}
	public double getGradosAlcohol() {
		return gradosAlcohol;
	}
	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	@Override
	public void visualizarArticulo() {
		System.out.println(this.toString());
		
	}
	@Override
	public boolean saludable() {
		if (getCereales().equals("lupulo")) {
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
		if (getGradosAlcohol()>13.5) {
			return true;
		}else {
		return false;
		}
	}
	@Override
	public String toString() {
		return origen + ", " + cereales + ", " + gradosAlcohol + ", " + super.toString();
	}
	
	
	
}
