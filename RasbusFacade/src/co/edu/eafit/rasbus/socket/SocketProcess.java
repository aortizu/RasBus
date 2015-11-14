package co.edu.eafit.rasbus.socket;

import java.io.IOException;

import co.edu.eafit.rabus.string.utils.StringUtils;
import co.edu.eafit.rasbus.dao.posicion.MysqlPosicionDAO;
import co.edu.eafit.rasbus.dao.posicion.OraclePosicionDAO;
import co.edu.eafit.rasbus.dao.posicion.PosicionDAO;
import co.edu.eafit.rasbus.model.Posicion;
import co.edu.eafit.rasbus.properties.ReaderProperties;

/**
 * Clase del procesamiento de entradas socket
 *  
 * @author jzapat28
 *
 */
public class SocketProcess {

	private ReaderProperties reader;
	private StringUtils util;

	/**
	 * Constructor
	 * 
	 * @param reader
	 */
	public SocketProcess(ReaderProperties reader) {
		super();
		this.reader = reader;
		this.util= new StringUtils();
	}

	/**
	 * Metodo de procesamiento de entradas socket, no se implementa algoritmo de procesamiento
	 */
	public void validarMensaje(String message) throws IOException {

		PosicionDAO posicion = null;

		switch (reader.getPropValues("DB")) {
		case "ORACLE":
			posicion = new OraclePosicionDAO();
			break;
		case "MYSQL":
			posicion = new MysqlPosicionDAO();
			break;

		default:
			break;
		}

		posicion.insertPosicion(
				new Posicion("x=" + util.getMessageValue("x", message), "y=" + util.getMessageValue("y", message),
						String.valueOf(System.currentTimeMillis()), "placa=" + util.getMessageValue("placa", message)));
	}

}
