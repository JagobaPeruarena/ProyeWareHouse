package EjWareHouseClase;

import java.util.Date;

public class Factura {
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;
	private static int IVA;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public static int getIVA() {
		return IVA;
	}
	public static void setIVA(int iVA) {
		IVA = iVA;
	}
	public Factura(int numero, String nombreEmpresa, Date fecha, String concepto) {
		super();
		this.numero = numero;
		this.nombreEmpresa = nombreEmpresa;
		this.fecha = fecha;
		this.concepto = concepto;
	}
	
	public void addLinea(LineaFactura lineaFactura) {
		
		
	}
	public void eliminarLinea(int numeroLinea) {
		
	}
	public double precioTotal() {
		return 1.1;
		
	}
	public void mostrarEnPantalla() {
		
	}
	public void guardarEnFichero() {
		
	}

}
