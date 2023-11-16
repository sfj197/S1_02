package n1ejercicio1;

public class VentaVaciaExcepcion extends Exception {

	private static final long serialVersionUID = 1L;
	private String mensaje;

	public VentaVaciaExcepcion(String mensaje)  {

		super(mensaje);
		
	}
	
	@Override
	public String getMessage() {
		return "Para hacer la comanda primero ha de haber productos en la lista";
	}

}
