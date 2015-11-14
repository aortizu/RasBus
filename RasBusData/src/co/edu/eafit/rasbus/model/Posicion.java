package co.edu.eafit.rasbus.model;

/**
 * Clase que representa un Posicion de la aplicación
 * 
 * @author AORTIZU
 * 
 */
public class Posicion {
	private String coordenadaX;
	private String coordenadaY;
	private String fecha;
	private String placaVehiculo;


	/**
	 * Constructor de la clase
	 * 
	 * @param coordenadaX
	 * @param coordenadaY
	 * @param Fecha
	 * @param placaVehiculo
	 */
	public Posicion(String coordenadaX, String coordenadaY, String fecha,
			String placaVehiculo) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.fecha = fecha;
		this.placaVehiculo = placaVehiculo;
	}

	
	/** Setters */
	public void setCoordenadaX(String coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	

	public void setCoordenadaY(String coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}
	
}
