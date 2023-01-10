package EjWareHouseClase;

public class Cerveza extends Articulo {
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean saludable() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void preciototal() {
		// TODO Auto-generated method stub
		
	}
	
}
