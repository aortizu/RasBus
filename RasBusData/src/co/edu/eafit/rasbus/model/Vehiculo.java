package co.edu.eafit.rasbus.model;

import java.util.List;

/**
 * Objeto que representa un vehiculo
 * 
 * @author AORTIZU
 * 
 */
public class Vehiculo {

	/** Marca del vehiculo */
	private String marca;

	/** Placa del vehiculo */
	private String placa;

	/** Tipo de vehiculo */
	private String tipoVehiculo;

	/** Descripcion del vehiculo */
	private List<String> sensores;
	
	
	public Vehiculo(String marca, String placa, String tipoVehiculo,
			List<String> sensores) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.tipoVehiculo = tipoVehiculo;
		this.sensores = sensores;
	}
	
	public Vehiculo() {

	}

	/** Setters */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public void setSensores(List<String> sensores) {
		this.sensores = sensores;
	}

}
