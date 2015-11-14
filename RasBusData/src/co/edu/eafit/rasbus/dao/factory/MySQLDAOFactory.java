package co.edu.eafit.rasbus.dao.factory;

import java.sql.Connection;

import co.edu.eafit.rasbus.dao.posicion.MysqlPosicionDAO;
import co.edu.eafit.rasbus.dao.posicion.PosicionDAO;
import co.edu.eafit.rasbus.dao.vehiculos.MysqlVehiculoDAO;
import co.edu.eafit.rasbus.dao.vehiculos.VehiculoDAO;

/**
 * Clase factory para administrar la conexion de la base de datos Mysql
 * 
 * @author AORTIZU
 *
 */
public class MySQLDAOFactory extends DAOFactory {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql:[host]:[port]:[root]:[password]";

	/**
	 * Metodo encargado de crear la conexion a la base de datos Mysql
	 * 
	 * @return Connection
	 */
	public static Connection createConnection() {
		return null;
	}

	/**
	 * Metodo que retorna la instancia Mysql vehiculo
	 * 
	 * @return VehiculoDAO
	 */
	public VehiculoDAO getVehiculoDAO() {
		return new MysqlVehiculoDAO();
	}
	
	/**
	 * Metodo que retorna la instancia Mysql posicion
	 * 
	 * @return PosicionDAO
	 */
	public PosicionDAO getPosicionDAO() {
		return new MysqlPosicionDAO();
	}

}
