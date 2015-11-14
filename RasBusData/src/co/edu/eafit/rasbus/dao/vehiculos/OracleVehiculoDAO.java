package co.edu.eafit.rasbus.dao.vehiculos;

import java.util.ArrayList;
import java.util.List;

import co.edu.eafit.rasbus.dao.factory.OracleDAOFactory;
import co.edu.eafit.rasbus.model.Vehiculo;

/**
 * Clase que se encarga del manejo de los metodos que acceden a Base de Datos,
 * para consultar, modificar, crear y eliminar información de los Vehiculos
 * del negocio.
 * 
 * @author AORTIZU
 * 
 */
public class OracleVehiculoDAO implements VehiculoDAO {

	/**
	 * Metodo constructor de la clase
	 */
	public OracleVehiculoDAO() {
		OracleDAOFactory.createConnection();
	}

	public int insertVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean deleteVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Vehiculo findVehiculo(int idVehiculo) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Vehiculo> selectVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public List<Vehiculo> findVehiculoByType(long idConductor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Vehiculo> findVehiculoByConductor(long idConductor) {
		// se simula la consulta en BD, el cual retorna la coleccion de
		// vehiculos

		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("Chevrolet");
		vehiculo1.setPlaca("AAA123");
		vehiculo1.setTipoVehiculo("taxi");
		
		List<String> sensoresVehiculo1 = new ArrayList<String>();
		sensoresVehiculo1.add("GPS");
		vehiculo1.setSensores(sensoresVehiculo1);
		vehiculos.add(vehiculo1);


		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setMarca("Himno");
		vehiculo2.setPlaca("BBB321");
		vehiculo2.setTipoVehiculo("bus");
		
		List<String> sensoresVehiculo2 = new ArrayList<String>();
		sensoresVehiculo2.add("GPS");
		vehiculo2.setSensores(sensoresVehiculo2);
		vehiculos.add(vehiculo2);
		vehiculos.add(vehiculo2);

		return vehiculos;
	}



}
