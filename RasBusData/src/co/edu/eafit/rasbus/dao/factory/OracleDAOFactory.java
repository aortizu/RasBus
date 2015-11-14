package co.edu.eafit.rasbus.dao.factory;

import java.sql.Connection;

import co.edu.eafit.rasbus.dao.posicion.OraclePosicionDAO;
import co.edu.eafit.rasbus.dao.vehiculos.VehiculoDAO;
import co.edu.eafit.rasbus.dao.vehiculos.OracleVehiculoDAO;

/**
 * Clase factory para administrar la conexion de la base de datos Oracle
 * 
 * @author AORTIZU
 *
 */
public class OracleDAOFactory extends DAOFactory {

	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@[host]:[port]:[sid]";

	/**
	 * Metodo encargado de crear la conexion a la base de datos Oracle
	 * 
	 * @return
	 */
	public static Connection createConnection() {
		return null;
	}

	
	public VehiculoDAO getVehiculoDAO() {
		return new OracleVehiculoDAO();
	}

	public co.edu.eafit.rasbus.dao.posicion.PosicionDAO getPosicionDAO() {
		return new OraclePosicionDAO();
	}

}
