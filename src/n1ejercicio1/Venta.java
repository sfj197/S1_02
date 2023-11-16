package n1ejercicio1;

import java.util.ArrayList;

public class Venta {

	private ArrayList<Producto> productos;
	private int precioTotal;

	public Venta(ArrayList<Producto> productos, int precioTotal) {
		this.productos = new ArrayList<Producto>();
		this.precioTotal = precioTotal;

	}

	public ArrayList<Producto> getProductos() {
		return this.productos;
	}

	public int getPrecioTotal() {
		return this.precioTotal;
	}

	public void setProductos(Producto producto) {
		this.productos.add(producto);
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int calcularTotal(ArrayList<Producto> productos) throws VentaVaciaExcepcion {

		if (productos.isEmpty()) {

			throw new VentaVaciaExcepcion("Para hacer la comanda primero ha de haber productos en la lista");

		} else {

			for (Producto producto : productos) {

				precioTotal += producto.getPrecio();
			}

		}

		return precioTotal;

	}

	public String toString() {
		return "La lista tiene estos productos " + this.getProductos() + " y el " + "precio total es "
				+ this.getPrecioTotal();
	}

}
