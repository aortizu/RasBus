package co.edu.eafit.rasbus.dao.factory;

import co.edu.eafit.rasbus.dao.posicion.PosicionDAO;
import co.edu.eafit.rasbus.dao.vehiculos.VehiculoDAO;

/**
 * Clase factory genera diferentes tipos de conexión
 * 
 * @author AORTIZU
 *
 */
public abstract class DAOFactory {
	public static final int ORACLE = 1;
	public static final int MySql = 2;

	public abstract VehiculoDAO getVehiculoDAO();
	public abstract PosicionDAO getPosicionDAO();

	/**
	 * Se retorna la instancia de coonexion para el control de datos
	 * 
	 * @param tipoFactory
	 * @return
	 */
	public static DAOFactory getDAOFactory(int tipoFactory) {

		switch (tipoFactory) {
		case ORACLE:
			return new OracleDAOFactory();
		case MySql:
			return new OracleDAOFactory();
		default:
			return null;
		}
	}
}
