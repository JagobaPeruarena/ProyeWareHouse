package EjWareHouseClase;

public class Refresco extends Articulo {
	public Refresco(String code, String name, String mark, int capacidadBotella, double precio, int stock, int cantidadAzucar, boolean zumo, boolean gaseoso,String sabor) {
		super(code, name, mark, capacidadBotella, precio, stock);
		this.cantidadAzucar=cantidadAzucar;
		this.gaseoso=gaseoso;
		this.sabor=sabor;
		this.zumo=zumo;
	}
	




	@Override
	public String toString() {
		return sabor + ", " + zumo + ", " + gaseoso + ", " + cantidadAzucar + ", " + super.toString();
	}





	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isZumo() {
		return zumo;
	}
	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}
	public boolean isGaseoso() {
		return gaseoso;
	}
	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}
	public int getCantidadAzucar() {
		return cantidadAzucar;
	}
	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	@Override
	public void visualizarArticulo() {
		toString();
		
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
	public void visualizarPropiedades() {
		System.out.println( sabor + ", " + zumo + ", " + gaseoso + ", " + cantidadAzucar);
		
	}
	

}
