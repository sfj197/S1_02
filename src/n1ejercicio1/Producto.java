package n1ejercicio1;

public class Producto {
	
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		this.precio = precio;
		this.nombre = nombre;
		
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String toString() {
		return "Soy un producto de nombre " + this.getNombre() + " con un precio "
				+ this.getPrecio() + " euros.";
	}
}
