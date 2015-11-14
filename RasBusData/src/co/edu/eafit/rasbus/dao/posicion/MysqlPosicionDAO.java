package co.edu.eafit.rasbus.dao.posicion;

import java.util.List;

import co.edu.eafit.rasbus.dao.factory.OracleDAOFactory;
import co.edu.eafit.rasbus.model.Posicion;

/**
 * Clase que se encarga del manejo de los metodos que acceden a Base de Datos,
 * para consultar, modificar, crear y eliminar información de los Posiciones del
 * negocio.
 * 
 * @author AORTIZU
 * 
 */
public class MysqlPosicionDAO implements PosicionDAO {

	/**
	 *Constructor
	 */
	public MysqlPosicionDAO() {
		OracleDAOFactory.createConnection();
	}

	/**
	 *Funciones query 
	 */	
	@Override
	public int insertPosicion(Posicion Posicion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deletePosicion(Posicion Posicion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Posicion findPosicion(int idPosicion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePosicion(Posicion Posicion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Posicion> selectPosiciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Posicion> findPosicionByVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
