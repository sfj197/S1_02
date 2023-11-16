package n1ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws VentaVaciaExcepcion,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		int precioTotal = 0;
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Venta nuevaVenta = new Venta(productos, precioTotal);
		try {
			
			System.out.println(nuevaVenta.calcularTotal(productos));

		} catch (VentaVaciaExcepcion e) {

			System.out.println(e.getMessage());

		}
		try {
			
			int [] array = new int[5];
			System.out.println(array[6]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception	
			
			System.out.println("Fuera de rango");

		}

	}

}
