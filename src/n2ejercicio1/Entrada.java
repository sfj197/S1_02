package n2ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	static Scanner entrada = new Scanner(System.in);

	public static byte leerByte(String mensaje) {

		boolean comprobado = false;
		byte dato = 0;

		while (!comprobado) {

			try {

				System.out.println(mensaje);
				dato = entrada.nextByte();
				System.out.println("el valor es un byte");
				comprobado = true;

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Introduce valor correcto");
				entrada.nextLine();
			}
		}
		return dato;

	}

	public static int leerInt(String mensaje) {

		boolean comprobado = false;
		int dato = 0;

		while (!comprobado) {

			try {

				System.out.println(mensaje);
				dato = entrada.nextInt();
				System.out.println("Dato correcto");
				comprobado = true;

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Introduce valor correcto");
				entrada.nextLine();
			}
		}
		return dato;
	}

	public static float leerFloat(String mensaje) {

		float dato = 0.0f;
		boolean comprobado = false;

		while (!comprobado) {

			try {

				System.out.println(mensaje);
				dato = entrada.nextFloat();
				System.out.println("Formato correcto");
				comprobado = true;

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Introduce valor correcto");
				entrada.nextLine();
			}
		}
		return dato;
	}

	public static double leerDouble(String mensaje) {

		double dato = 0.0d;
		boolean encontrado = false;

		while (!encontrado) {

			try {
				System.out.println(mensaje);
				dato = entrada.nextDouble();
				System.out.println("Formato correcto");
				encontrado = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Introduce valor correcto");
				entrada.nextLine();
			}
		}
		return dato;
	}

	public static char leerChar(String mensaje) {

		String dato = "";
		boolean encontrado = false;
		char dato1 = 'a';

		while (!encontrado) {
			
			System.out.println(mensaje);
			dato = entrada.nextLine();

			try {
				
				if(dato.length() > 1) {
					
					throw new InputMismatchException();	
					
				}if(dato.isEmpty()) {
					
					throw new Exception();
				}
				
				dato1 = dato.charAt(0);
				encontrado = true;
				System.out.println("Dato correcto");
							
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Error mas de un caracter");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Error campo vacio");;
			}
		}
		return dato1;
	}

	public static String leerString(String mensaje) {

		String dato = "";
		boolean encontrado = false;

		while (!encontrado) {

			try {
				System.out.println(mensaje);
				dato = entrada.next();
				
				if(dato.length() == 1) {
					
					throw new InputMismatchException();
					
				}
				if(dato.isEmpty()) {
					
					throw new Exception();
				}
				System.out.println("Dato correcto");
				encontrado = true;

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Error faltan caracteres");
			}catch (Exception e) {
				// TODO: handle exception
				
			}
		}
		return dato;

	}

	public static boolean leerSiNo(String mensaje) {

		String dato = "";
		boolean encontrado = false;
		boolean salida = true;

		while (!encontrado) {

			try {
				System.out.println(mensaje);
				dato = entrada.next();

				if (dato.equalsIgnoreCase("S")) {

					salida = true;
					encontrado = true;

				} else if (dato.equalsIgnoreCase("N")) {

					salida = false;
					encontrado = true;

				}else {
					
					throw new Exception();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				
				System.out.println("Error, solo puedes poner 's' o 'n'");
			}
		}

		return salida;
	}
}
